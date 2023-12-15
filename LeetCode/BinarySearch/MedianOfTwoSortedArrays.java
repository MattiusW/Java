import java.util.ArrayList;
import java.util.Collections;

public class MedianOfTwoSortedArrays {
    
    public static void main(String[] args){
        int nums1[] = {1,3};
        int nums2[] = {2,7};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        double avg = 0;
   
        for(int i = 0; i < nums1.length; i++){
            list.add(nums1[i]);
        } 
         
        for(int j = 0; j < nums2.length; j++){
            list.add(nums2[j]);
        } 

        for(int k = 0; k < list.size(); k++){
            avg += list.get(k);
        }
        
        Collections.sort(list);
        
        return avg / list.size();
    }
}
