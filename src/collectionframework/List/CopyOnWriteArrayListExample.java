package collectionframework.List;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {

    public static void main(String[] args) {


        // It Creates a copy of list when ever need to modify it
        // Useful when write operations is required while reading


//        List<String> newList = new ArrayList<>();
        List<String> newList = new CopyOnWriteArrayList<>();

        newList.add("Asad1");
        newList.add("2sda");
        newList.add("3sadasd");
        newList.add("4asdasd");
        newList.add("5adsasd");

        System.out.println(newList);

        for (String item : newList){
            System.out.println(item);
            if(item.equals("2sda")){
                newList.add("6wasd");
                System.out.println("New element added");
            }
        }

        System.out.println(newList);


    }

}
