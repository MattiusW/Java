public class SumOfUnigueElements {

    public static void main(String[] args){
        int[] nums = {1,1,3,2,2,7};
        System.out.println(sumOfUnique(nums));
    }
    
    public static int sumOfUnique(int[] nums) {
        int sum = 0;

        for(int i = 0; i <= nums.length - 1; i++){
           for(int j = 0; j <= nums.length - 1; j++){
               if(nums[j] != nums[i]){
                sum = nums[j];
               }
           }
        }

        return sum;
    }
}