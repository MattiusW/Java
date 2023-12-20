public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3,0,1,2,4,5,8,9};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int count = 0;
        int miss = 0;

        for(int i = 1; i <= nums.length; i++){
            if(count != nums[i - 1]){
                miss = count;
            }
            count++;
        }
        return miss;
    }
}
