package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    
    public static void main(String[] args){
        int n = 15;
        System.out.print(fizzBuzz(n));
    }

    public static List<String> fizzBuzz(int n){
        ArrayList<String> fiz = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            
            if(i % 3 == 0 && i % 5 == 0){
                fiz.add("FizzBuzz");
            }

            else if(i % 3 == 0){
                fiz.add("Fizz");
            }

            else if(i % 5 == 0){
                fiz.add("Buzz");
            }

            else{
                fiz.add(Integer.toString(i));
            }
        }
        return fiz;
    }
}
