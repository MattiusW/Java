public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int count = 0;
        int miss = 0;

        for(int i = 1; i <= nums.length; i++){
            if(count != nums[i - 1]){
                miss = count;
            }

            if(count == nums.length - 1 && miss == 0){
                miss = (nums.length - 1) + 1;
            }

            if(nums.length == 1){
                miss = 0;
            }

            count++;
        }
        return miss;
    }
}
