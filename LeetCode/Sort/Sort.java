package LeetCode.Sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sort {
    
    public static void main(String[] args){
        int[] example = {4,3,1,2};

        for(int j = 1; j < example.length; j++){

            int key = example[j];
            int i = j - 1;

            while(i >= 0 && key < example[i]){
                example[i + 1] = example[i];
                i--;
            }
            example[i + 1] = key;
        }

        System.out.println(Arrays.toString(example));
    }

}
