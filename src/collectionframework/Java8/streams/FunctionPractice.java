package collectionframework.Java8.streams;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionPractice {

    public static void main(String[] args) {

        // 1. Write a function that converts a string to its length.
        List<String> stringList = Arrays.asList("Java", "Function", "Stream", "Lambda", "Predicate");
        stringList.stream().map( x -> x.length()).forEach(System.out::println);

        // 2. Use a function to convert Celsius to Fahrenheit.
        List<Double> celsiusTemps = Arrays.asList(0.0, 20.5, 37.0, 100.0, -10.0);

        // 3. Create a function that extracts domain from an email.
        List<String> emails = Arrays.asList("user@gmail.com", "contact@yahoo.com", "admin@openai.com", "test@hotmail.com");
        emails.stream().map( email -> email.split("@")[1]).forEach(System.out::println);

        // 4. Convert a list of names to a list of name lengths using streams and functions.
        List<String> nameList = Arrays.asList("Hassan", "Ali", "Fatima", "Zainab", "Umer");
        nameList.stream().map( x -> x.length()).forEach(System.out::println);

        // 5. Map an Employee object to their name using a function.
        class Employee {
            String name;
            int age;
            String department;
            public Employee(String name, int age, String department) {
                this.name = name;
                this.age = age;
                this.department = department;
            }
        }
        List<Employee> employeeList = Arrays.asList(
                new Employee("Sara", 28, "IT"),
                new Employee("Ali", 32, "Finance"),
                new Employee("Zara", 25, "HR"),
                new Employee("Usman", 40, "Admin")
        );
        employeeList.stream().map( employee -> employee.name ).forEach(System.out::println);

        // 6. Create a function that converts an object to JSON string.
        // Use any sample object like Product, you can assume simple fields
        class Product {
            String name;
            double price;
            public Product(String name, double price) {
                this.name = name;
                this.price = price;
            }
        }
        List<Product> productList = Arrays.asList(
                new Product("Laptop", 1200.0),
                new Product("Phone", 800.0),
                new Product("Tablet", 500.0)
        );

        // 7. Chain two functions: first get string length, then square it.
        List<String> lengthList = Arrays.asList("Hello", "Hi", "Java", "Streams", "Function");
        lengthList.stream().map(String::length).map(y -> y*y).forEach(System.out::println);

        // 8. Use a function to parse strings into integers.
        List<String> numericStrings = Arrays.asList("123", "456", "789", "1001", "2024");
        numericStrings.stream().map(Integer::parseInt).forEach(System.out::println);

        // 9. Convert a list of full names to first names using a function.
        List<String> fullNames = Arrays.asList("Ali Raza", "Sana Khan", "Hassan Tariq", "Amna Sheikh", "Zaid Ali");
        fullNames.stream().map( names -> names.split(" ")[0]).forEach(System.out::println);

        // 10. Build a reusable function to remove spaces and convert string to lowercase.
        List<String> messyStrings = Arrays.asList("  Hello World ", " Java PROGRAMMING ", " Stream API ", " FUNCTION ");
        Function<String,String> manplString = x -> x.trim().toLowerCase();
        messyStrings.stream().map(manplString::apply).forEach(System.out::println);

    }
}