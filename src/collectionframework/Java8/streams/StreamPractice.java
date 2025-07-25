package collectionframework.Java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {

        // Problem 1 : Given a list of integers, use streams to print only even numbers.
        List<Integer> listInt = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        listInt.stream().filter(x -> x%2 == 0).forEach(System.out::println);
        List<Integer> evenList = listInt.stream().filter(x -> x%2 == 0).toList();
        System.out.println(evenList);

        // 2.	Filter out duplicate elements from a list using streams.
        List<Integer> duplist = Arrays.asList(1,1,2,3,3,4,5,6,7,8,9,10,11,11,10,8,4,5,6,7);
        List<Integer> noDupList = duplist.stream().distinct().toList();
        System.out.println(noDupList);

        // 3. Find the maximum value in a list of integers using streams.
        List<Integer> maxList = Arrays.asList(1,1,2,3,3,4,5,6,7,8,9,10,11,11,10,8,4,5,6,7);
        Integer max1 = maxList.stream().reduce(Integer::max).get();
        System.out.println(max1);
        Integer max2 = maxList.stream().max(Integer::compareTo).orElse(null);
        System.out.println(max2);

        // 4.	Count how many strings in a list start with a specific letter using streams.
        List<String> strList = Arrays.asList("asad","dasoonex","aknfk","ebdfewjb","eqbdewjb","akjbj");
        System.out.println(strList.stream().filter(x -> x.startsWith("a")).count());

        // 	5.	Convert a list of strings to uppercase using streams.
        List<String> strList1 = Arrays.asList("asad","dasoonex","aknfk","ebdfewjb","eqbdewjb","akjbj");
        System.out.println(strList.stream().map(x -> x.toUpperCase()).toList());

        //  6.	Find the average of a list of decimal numbers using streams.
        List<Integer> avgList = Arrays.asList(1,1,2,3,3,4,5,6,7,8,9,10,11,11,10,8,4,5,6,7);
        System.out.println(avgList.stream().mapToInt(Integer::intValue).average().orElse(0.0));

        //  7.	Concatenate all elements of a list into a single comma-separated string using streams.
        List<String> catList = Arrays.asList("asad","dasoonex","aknfk","ebdfewjb","eqbdewjb","akjbj");
        System.out.println(catList.stream().collect(Collectors.joining(",")));

        //  8.	Use a stream to check if all numbers in a list are positive.
        List<Integer> posList = Arrays.asList(1,1,2,3,3,4,5,6,7,8,9,10,11,11,10,8,4,5,6,7);
        System.out.println(posList.stream().filter(x-> x>0).count() == posList.size());
        System.out.println(posList.stream().allMatch(x-> x>0));

        //  9.	Sort a list of strings in reverse order using streams.
        List<String> unSorted = Arrays.asList("asad","dasoonex","aknfk","ebdfewjb","eqbdewjb","akjbj");
        unSorted.stream().sorted().forEach(System.out::println);

        //  10.	Filter a list of employees to only include those with a salary greater than 50,000.
        List<Integer> salList = Arrays.asList(1,1,2,3,3,4,5,6,7,8,9,10,11,11,10,8,4,5,6,7);
        System.out.println(salList.stream().filter(x-> x>5).toList());


    }


}
