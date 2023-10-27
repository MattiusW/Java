package Algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListAlgo {
    
    public static void main(String[] args){
        List<String> example = new ArrayList<String>();
        example.add("One");
        example.add("Two");
        example.add("Three");
        example.add("Four");
        example.add("Five");

        System.out.println(example);

        System.out.println(example.get(3));
        
        example.remove(3);
        
        System.out.println(example.get(3));

        System.out.println(example);

        example.add("Three"); //Duplicate

        System.out.println(example);

        example.remove("Three"); //Remove first find element

        System.out.println(example);

        System.out.println(example.contains("Five"));
        System.out.println(example.contains("Six"));
        System.out.println(example.isEmpty());
        System.out.println(example.size());

        Collections.sort(example); 

        System.out.println(example);

        example.clear();
        System.out.println(example.isEmpty());
        System.out.println(example.size());
    }

}