package LeetCode;

import java.util.Arrays;

public class ContainsDuplicate {
    
    public static void main(String[] args){
        int[] nums = {1,2,3,1};
        int[] numsTwo = {1,2,3,4,5,6,7,8,9,11};
        System.out.println(containsDuplicate(nums));
        System.out.println(containsDuplicateIfTables(numsTwo));
    }

    public static boolean containsDuplicate(int[] nums){
        for(int i = 1; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean containsDuplicateIfTables(int[] nums){
        //Sort table if have most element inside
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]){
                return true;
            }
        }
        return false;
    }
}
