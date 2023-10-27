package Algorithm;

import java.util.ArrayList;
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

    }

}