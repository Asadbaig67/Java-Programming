package arrays;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {
        // Creating and initializing array
        int[] arr = {5, 3, 8, 6, 2};

        // Printing array using loop
        System.out.print("Original Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        // Sorting array
        Arrays.sort(arr);
        System.out.println("\nSorted Array: " + Arrays.toString(arr));

        // Filling array
        Arrays.fill(arr, 1);
        System.out.println("Array after fill: " + Arrays.toString(arr));

        // Copying array
        int[] copy = Arrays.copyOf(arr, arr.length);
        System.out.println("Copied Array: " + Arrays.toString(copy));

        // Comparing arrays
        boolean isEqual = Arrays.equals(arr, copy);
        System.out.println("Arrays equal? " + isEqual);

        // Searching (binary search - array must be sorted)
        int[] searchArr = {2, 4, 6, 8, 10};
        int index = Arrays.binarySearch(searchArr, 6);
        System.out.println("Index of 6: " + index);

        // Multi-dimensional array
        int[][] matrix = {
                {1, 2},
                {3, 4}
        };
        System.out.println("Matrix element [1][0]: " + matrix[1][0]);
    }

}


class FinalArrays{

    public static void main(String[] args) {
        final int[] numbers = {1, 2, 3};

        // Modifying contents - Allowed
        numbers[0] = 10;
        numbers[2] = 99;
        System.out.println("Modified array: " + Arrays.toString(numbers));

        // Sorting contents - Allowed
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // Filling array - Allowed
        Arrays.fill(numbers, 5);
        System.out.println("After fill: " + Arrays.toString(numbers));

        // Reassigning array - Not allowed (compilation error)
        // numbers = new int[] {4, 5, 6}; // ❌ Compile-time error
    }

}
