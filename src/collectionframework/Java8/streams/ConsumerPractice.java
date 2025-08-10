package collectionframework.Java8.streams;
import java.util.*;
import java.util.function.Consumer;


public class ConsumerPractice {

    public static void main(String[] args) {

        // 1. Create a consumer to print any given string.
        List<String> printList = Arrays.asList("Java", "Streams", "Consumer", "Lambda", "Functional Interface");
        printList.stream().forEach(System.out::println);

        // 2. Use a consumer to update an object’s field.
        class User {
            String name;
            int age;
            public User(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public String toString() {
                return name + " - " + age;
            }
        }
        List<User> userList = Arrays.asList(
                new User("Ali", 25),
                new User("Sara", 30),
                new User("Zain", 22)
        );
        userList.stream().forEach( user -> {
            user.age += 2;
            System.out.println(user);
        } );


        // 3. Use a consumer to append a suffix to strings in a list.
        List<String> names = new ArrayList<>(Arrays.asList("Ali", "Zara", "Sana", "Omar", "Hassan"));
        Consumer<List<String>> sufixAppend = list -> {
            for (int i=0;i<list.size();i++){
                list.set(i, list.get(i) + " - User");
            }
        };

        sufixAppend.accept(names);



        // 4. Log information of a list of users using a consumer.
        List<User> logUserList = Arrays.asList(
                new User("Ahmed", 29),
                new User("Fatima", 35),
                new User("Usman", 27)
        );
        logUserList.stream().forEach( user -> {
            System.out.println(user.age + user.name);
        });

        // 5. Use a consumer to set a discount on products.
        class Product {
            String name;
            double price;
            double discount; // in percentage
            public Product(String name, double price) {
                this.name = name;
                this.price = price;
                this.discount = 0;
            }
            public String toString() {
                return name + " - Price: " + price + ", Discount: " + discount + "%";
            }
        }
        List<Product> discountProducts = Arrays.asList(
                new Product("Laptop", 1000.0),
                new Product("Mobile", 500.0),
                new Product("Tablet", 300.0)
        );

        discountProducts.stream().forEach( product -> {
            product.discount = 20;
            System.out.println(product);
        });


        // 6. Combine two consumers to first modify and then print an object.
        List<User> modifyPrintUsers = Arrays.asList(
                new User("Saad", 28),
                new User("Hina", 24),
                new User("Tariq", 31)
        );

        // 7. Create a consumer that adds entries to a log file.
        List<String> logs = Arrays.asList(
                "User logged in",
                "Transaction completed",
                "Password updated",
                "Logout successful"
        );

        // 8. Build a consumer that takes a map and prints keys and values.
        Map<String, Integer> itemStock = new HashMap<>();
        itemStock.put("Keyboard", 10);
        itemStock.put("Mouse", 25);
        itemStock.put("Monitor", 5);
        itemStock.put("Charger", 15);

        // 9. Pass a consumer to a method that applies changes to an object.
        User customUser = new User("Nadia", 26);

        // 10. Use forEach with consumer to print uppercase versions of strings.
        List<String> cities = Arrays.asList("Lahore", "Karachi", "Islamabad", "Multan", "Peshawar");
    }
}
