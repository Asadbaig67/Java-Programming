package datatypes;


public class TestStrings {

    public static void main(String[] args) {

        // Concepts in this :

        // --> String Pool : A special memory inside heap where unique string values are stored
        //                   Whenever a string literal (like "Hello") is created, Java first checks if the same value already exists in the String Pool.
        //                   If it exists, the reference to the existing string is returned.
        //                   If it doesn’t exist, a new string object is created in the String Pool.
        // --> Heap Memory : General Object Allocation


        // IMMUTABLE STRINGS

        // STRING LITERALS
        String str1 = "Hello"; // Goes to string pool.
        String str2 = "Hello"; // Points to previous string location in string pool.

        // HEAP MEMORY
        String newString = new String("Hello");
        String newString2 = new String("Helllo");


        System.out.println(str1 == str2); // true (same reference) == compares memory locations (references).
        System.out.println(newString == newString2); // false (different heap locations)


        // MUTABLE STRINGS

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Modifies the existing object
        System.out.println(sb.toString()); // Output: "Hello World"

    }
}
