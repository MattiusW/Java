import java.util.ArrayList;
import java.util.Arrays;

public class Fibonacci {
    public static ArrayList<Integer> fibonacciSequence(int[] tab){
        ArrayList<Integer> fibonnaci = new ArrayList<Integer>();
        
        int i = 1;
        int j = 0;
        int total = 0;
        int table = tab.length;

        while(i < table)
        {   
            total = tab[j] + tab[i];
            fibonnaci.add(total);
            i += 2;
            j += 2; 
            //System.out.println(Arrays.toString(fibonnaci));
        }

        return fibonnaci;
    }
}
