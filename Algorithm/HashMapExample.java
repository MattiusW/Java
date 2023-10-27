package Algorithm;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    
    public static void main(String[] args){
        Map<Integer, String> hashMapOne = new HashMap<Integer, String>(); 

        hashMapOne.put(1, "One");
        hashMapOne.put(2, "Two");
        hashMapOne.put(3, "Three");
        hashMapOne.put(4, "Four");
        hashMapOne.put(5, "Five");

        System.out.println(hashMapOne.get(1));
        System.out.println(hashMapOne.putIfAbsent(1, "Six"));
        System.out.println(hashMapOne.isEmpty());
        System.out.println(hashMapOne.size());
        System.out.println(hashMapOne.keySet()); //Show keys in hashMap
        System.out.println(hashMapOne.values()); //Show values in hashMap
        
        hashMapOne.keySet().forEach(System.out::println); //Keys for each
        hashMapOne.values().forEach(System.out::println); //Values for each

        System.out.println(hashMapOne.entrySet()); //Show key, value

        //Stream in HashMap
        hashMapOne.entrySet().forEach(e -> System.out.print(" Key: " + e.getKey() + " Value: " + e.getValue()));

    }
}
