package collectionframework.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {



//        IMPORTANT NOTES
        // In linked hashmap items are stored in the order they were inserted
        // Initial capacity is the custom size load factor is the ration by which map size will be increased like 11*0.3.
        // Access order when true will place the least used item at the top of map so that it could be determined which items are more used and which are not.

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(11, 0.3f, true); // double linked list
        linkedHashMap.put("Orange", 10);
        linkedHashMap.put("Apple", 20);
        linkedHashMap.put("Guava", 13);


        linkedHashMap.get("Orange");
        linkedHashMap.get("Guava");
        linkedHashMap.get("Orange");
        linkedHashMap.get("Guava");

        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        HashMap<String, Integer> hashMap = new HashMap<>();
        LinkedHashMap linkedHashMap1 = new LinkedHashMap(hashMap);

        hashMap.put("hnuman", 91);
        hashMap.put("gao mata", 80);
        hashMap.put("deosai", 78);

        Integer res = hashMap.getOrDefault("Vipul", 0);
        hashMap.put("Shubham", 92);
        System.out.println(hashMap);

    }
}