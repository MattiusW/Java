import java.util.ArrayList;

public class SumOfUnigueElements {

    public static void main(String[] args){
        int[] nums = {1,1,2,2,7};
        System.out.println(sumOfUnique(nums));
    }
    
    public static int sumOfUnique(int[] nums) {
        int sum = 0;

        ArrayList list = new ArrayList<>();

        for(int i = 0; i <= nums.length - 1; i++){
           sum ^= nums[i];
        }

        return sum;
    }
}