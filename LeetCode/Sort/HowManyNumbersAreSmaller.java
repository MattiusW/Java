package LeetCode.Sort;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class HowManyNumbersAreSmaller {
    
    public static void main(String[] args){
        int nums[] = {8,1,2,2,3};
        int[] tab = smallerNumbersThanCurrentNextVersion(nums);
        System.out.println(Arrays.toString(tab));
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

    public static int[] smallerNumbersThanCurrentNextVersion(int[] nums){
        int[] table = new int[nums.length];
        int count = 0;
        int check = 0;
        int length = nums.length - 1;

        while(check <= length){

            for(int i = 0; i <= length; i++){
                if(nums[check] > nums[i]){
                    count++;
                }
            }
            table[check] = count;
            count = 0;
            check++;
        }
        return table;
    }
}
