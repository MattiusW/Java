package Algorithm;
import java.util.Arrays;

public class TotalNumberIndex {

    public static void main(String[] args){
        int[] tab = {2,7,11,15};
        int targ = 26;
        System.out.println(Arrays.toString(twoSum(tab, targ)));

    }

    public static int[] twoSum(int[] nums, int target){
        int total[] = new int[2];
        for(int i = 1; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                if(nums[i] + nums[j] == target){
                    total[0] = j;
                    total[1] = i;
                }
            }
        }
        return total;
    }
   
}

