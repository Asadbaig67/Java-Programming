package methods;

class HitCounter {
    private int count = 0;

    // Thread-safe update
    public synchronized void increment() {
        System.out.println("This is " + Thread.currentThread().getName() + " Inside Increment Function");
        count++;
    }

    // Thread-safe read
    public synchronized int getCount() {
        System.out.println("This is " + Thread.currentThread().getName() + " Inside getCount Function");
        return count;
    }
}

public class SynchronizedMethods {

        public static void main(String[] args) throws InterruptedException {
            HitCounter counter = new HitCounter();

            Runnable task = () -> {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            };

            Thread t1 = new Thread(task);
            Thread t2 = new Thread(task);
            t1.start();
            t2.start();
            t1.join();
            t2.join();

            System.out.println("Total hits: " + counter.getCount());  // Should always be 2000
        }


}
