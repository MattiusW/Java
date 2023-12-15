import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] table = intersection(nums1, nums2);
        System.out.println(Arrays.toString(table));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    set.add(nums1[i]);
                        break;
                }
            }
        }
        int[] solution = new int[set.size()];
        int j = 0;
        
        for(Integer value : set){
            solution[j] += value;
            j++; 
        }

        return solution;
    }
}
