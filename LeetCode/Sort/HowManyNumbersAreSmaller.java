package LeetCode.Sort;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class HowManyNumbersAreSmaller {
    
    public static void main(String[] args){
        int nums[] = {8,1,2,2,3};
        int[] small = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(small));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums){
        int[] smaller = new int[nums.length];
        int count = 0;
        Arrays.sort(nums);

        for(int i = nums.length - 1; i >= 0; i--){
            for(int j = nums.length - 2; j >= 0; j--){
                if(nums[i] > nums[j]){
                    count++; 
                }
            }
            smaller[i] = count;
            count = 0;
           }
        return smaller;
    }

}
