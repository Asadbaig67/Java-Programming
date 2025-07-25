package collectionframework.Map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {

//    IMPORTTANT NOTES

    // Here in identity-hashmap it uses Objects Class hashcode method to compare hashes
//    means that it will always check the two objects has same memory location or not.

//    whereas in HashMap it uses the objects own hashcode method to check for hashing


    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        String key11 = new String("Asad");
        String key22 = new String("Asad");
        map1.put(key11, 90);
        map1.put(key22, 92);

        // Here in this example the hashcode of String Object class is used which compares Asad string so thats why map1 has only one entry.

        System.out.println(map1);


        Map<String, Integer> map = new IdentityHashMap<>();
        String key1 = new String("Akshit");
        String key2 = new String("Akshit");
        map.put(key1, 90);
        map.put(key2, 92);
        System.out.println(map);

    }
}