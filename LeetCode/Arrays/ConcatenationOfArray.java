package LeetCode.Arrays;

import java.util.Arrays;

public class ConcatenationOfArray {
    
    public static void main(String[] args){
        int table[] = {3,4,5};
        int[] concat = getConcatenation(table);
        System.out.println(Arrays.toString(concat));
    }

    public static int[] getConcatenation(int[] nums){
        int[] concatenation = new int[nums.length * 2];
        for(int i = 0; i <= concatenation.length - 1; i++){
            concatenation[i] = nums[i % nums.length];
        }
        return concatenation;
    }

}
