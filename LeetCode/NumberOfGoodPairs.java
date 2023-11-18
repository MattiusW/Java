package LeetCode;

class NumberOfGoodPairs{

    public static void main(String[] args){ 
        int[] table = {1,2,3,1,1,3};
        System.out.println(numIndeticalPairs(table));

    }

    public static int numIndeticalPairs(int[] nums){
        int number = 0;

        for(int i = 0; i < nums.length - 1; i++){
            
            int j = i + 1;
            
            while(j <= nums.length - 1 && i < j){
                if(nums[i] == nums[j]){
                    number += 1;
                }
                j++;
            }
        }

        return number;
    }

}