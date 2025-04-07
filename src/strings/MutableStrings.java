package strings;

public class MutableStrings {

    static StringBuilder sbNonThread = new StringBuilder("Hello");
    static StringBuffer sbThreaded = new StringBuffer("Hello");

    public void threadSafe() {
        Runnable task = () -> {
            for (int i = 0; i < 10; i++) { // Increased iterations
                sbThreaded.append("!").append(Thread.currentThread().getName());
            }
        };

        Thread t1 = new Thread(task, "T1");
        Thread t2 = new Thread(task, "T2");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nStringBuffer (Thread-Safe) Output:");
        System.out.println(sbThreaded.toString()); // Always correct
    }

    public void nonThreadSafe() {
        Runnable task = () -> {
            for (int i = 0; i < 10; i++) { // Increased iterations
                sbNonThread.append("!").append(Thread.currentThread().getName());
                try {
                    Thread.sleep(1); // Introduce delay to increase inconsistency
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(task, "T1");
        Thread t2 = new Thread(task, "T2");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nStringBuilder (Not Thread-Safe) Output:");
        System.out.println(sbNonThread.toString()); // May produce corrupted output
    }

    public static void main(String[] args) {
        MutableStrings tempStr = new MutableStrings();

        tempStr.nonThreadSafe();
        tempStr.threadSafe();
    }
}
