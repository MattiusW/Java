import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetAfterSorting {
    
    public static void main(String[] args){
        int[] table = {1,2,5,2,3};
        int target = 3;
        System.out.println(targetIndices(table, target));
    }

     public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                result.add(i);
            }
        }

        return result;
    }
}
