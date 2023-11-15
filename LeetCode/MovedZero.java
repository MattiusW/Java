package LeetCode;

import java.util.Arrays;

// Mając tablicę liczb całkowitych nums, 
// przesuń wszystkie 0'' na koniec, zachowując względną kolejność niezerowych elementów.

public class MovedZero {
    
    public static void main(String[] args){
        int[] num = {-1,-2,0,1,0,3,12};
        moveZeroes(num);
        System.out.println(Arrays.toString(num));
    }

    public static void moveZeroes(int[] nums){
        int temp;

        for(int i = 1; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                if(nums[j] == 0){
                    temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }

    }

}
