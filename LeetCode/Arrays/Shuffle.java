import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

class Shuffle{

    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int[] shuffTable = shuffle(nums, 3);
        System.out.println(Arrays.toString(shuffTable));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] leftArray = new int[n];
        int[] rightArray = new int[nums.length - n];
        ArrayList<Integer> shuff = new ArrayList<Integer>();
        int[] shuffled = new int[nums.length];

        int i = 0;
        int j = 0;

        for(; i < nums.length; i++){
            if(i < n){
                leftArray[i] = nums[i];
            }
            else{
                rightArray[j] = nums[i];
                j++;
            }
        }

        for(int k = 0; k < n; k++){
            shuff.add(leftArray[k]);
            shuff.add(rightArray[k]);
        }

        for(int l = 0; l < nums.length; l++){
            shuffled[l] += shuff.get(l); 
        }

        return shuffled;
    }

}