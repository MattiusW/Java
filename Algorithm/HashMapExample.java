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

    }

    public static Map<Integer, String> hashMapMethod(){
    
        Map<Integer, String> hashMapTwo = new HashMap<Integer, String>(); 

        hashMapTwo.put(5, "Five");
        hashMapTwo.put(6, "Six");
        hashMapTwo.put(7, "Seven");
        hashMapTwo.put(8, "Eight");
        hashMapTwo.put(9, "Nine");

        return hashMapTwo;
    }
}
