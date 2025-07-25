package collectionframework.Java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class PredicatePractice {
    public static void main(String[] args) {

        // Predicate is a Functional Interface that returns boolean value used for conditional operations

        // 1. Write a predicate to check if a number is even.
        List<Integer> intList1 = Arrays.asList(3, 4, 6, 7, 10, 15, 20);
        intList1.stream().filter(x -> x % 2 == 0).forEach( x -> System.out.println(x + " is even") );

        // 2. Use a predicate to test if a string starts with “A”.
        List<String> namesList = Arrays.asList("Ali", "Ahmed", "Zara", "Amna", "Bilal");
        namesList.stream().forEach( x -> {
            if(x.startsWith("A")){
                System.out.println(x + " Starts With A");
            }
        });
        System.out.println(namesList.stream().map( x -> x.startsWith("A")).toList());

        // 3. Combine two predicates: number is positive and even.
        List<Integer> intList2 = Arrays.asList(-5, -2, 0, 1, 4, 6, 9, 12);
        intList2.stream().filter(x -> x > 0).filter( y -> y % 2 == 0).forEach(System.out::println);

        // 4. Use a predicate to filter names longer than 5 characters.
        List<String> namesLengthList = Arrays.asList("Hassan", "Ali", "Sana", "Abdullah", "Fatima", "Zain");
        namesLengthList.stream().filter( z -> z.length() > 5).forEach(System.out::println);

        // 5. Filter out null or empty strings using a predicate.
        List<String> mixedStrings = Arrays.asList("Java", "", null, " ", "Streams", "Predicate", "");
        mixedStrings.stream().filter(Objects::nonNull).map(String::trim).filter(y -> !y.isEmpty()).forEach(System.out::println);

        // 6. Test if a list contains a word that matches a given predicate.
        List<String> wordsList = Arrays.asList("Bank", "Loan", "Finance", "Code", "Credit", "Insurance");
        String word = "Loan";
        System.out.println(wordsList.stream().anyMatch( x -> x == word));

        // 7. Create a predicate that validates email format.
        List<String> emailList = Arrays.asList("user@example.com", "invalid@", "hello@site.org", "nope", "admin@fintech.io");
        emailList.stream().filter( email -> email.contains("@")).filter( email -> email.endsWith(".com")).forEach(System.out::println);

        // 8. Filter products that are in stock using a predicate.
        class Product {
            String name;
            boolean inStock;
            public Product(String name, boolean inStock) {
                this.name = name;
                this.inStock = inStock;
            }

            @Override
            public String toString() {
                return name + " is " + (inStock ? "in stock" : "out of stock");
            }

        }
        List<Product> products = Arrays.asList(
                new Product("Keyboard", true),
                new Product("Mouse", false),
                new Product("Monitor", true),
                new Product("Charger", false)
        );

        products.stream().filter( x -> x.inStock).forEach(System.out::println);

        // 9. Use predicate.negate() to invert logic in a filter.
        List<String> negateStrings = Arrays.asList("Apple", "Avocado", "Banana", "Apricot", "Orange");
        Predicate<String> endsWithA =s -> s.startsWith("a");

        negateStrings.stream().filter(endsWithA.negate()).forEach(System.out::println);

        // 10. Chain predicates to filter employees by department and salary.
        class Employee {
            String name;
            String department;
            int salary;
            public Employee(String name, String department, int salary) {
                this.name = name;
                this.department = department;
                this.salary = salary;
            }
        }
        List<Employee> employees = Arrays.asList(
                new Employee("Ali", "IT", 60000),
                new Employee("Sara", "HR", 45000),
                new Employee("Zain", "IT", 50000),
                new Employee("Areeba", "Finance", 70000),
                new Employee("Omar", "IT", 40000)
        );



    }
}
