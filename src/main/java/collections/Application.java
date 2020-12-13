package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        //List without duplicates
        //List<String> myList = new ArrayList<>();
        //Scanner scanner = new Scanner(System.in);
        //while(true){
        //    String myString = scanner.nextLine();
        //    if("print".equals(myString)){
        //        System.out.println(myList);
        //        break;
        //    }
        //    addElementToList(myList, myString);
        //}

        //Map from name to list of friends
        Map<String, List<String>> myMap = new HashMap<>();
        List<String> eduardFriends = new ArrayList<>();
        eduardFriends.add("Robert");
        eduardFriends.add("Vlad");
        myMap.put("Eduard", eduardFriends);

        List<String> paulFriends = new ArrayList<>();
        paulFriends.add("Bogdan");
        paulFriends.add("Daniel");
        myMap.put("Paul", paulFriends);

        System.out.println(myMap);

        System.out.println();

        for(Map.Entry<String, List<String>> entry : myMap.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println();
        }

    }

    private static void addElementToList(List<String> myList, String elementToBeAdded){
        if(!myList.contains(elementToBeAdded)){
            myList.add(elementToBeAdded);
            System.out.println("Element added to list");
        } else {
            System.out.println("Element already in list");
        }
    }
}
