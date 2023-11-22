package LeetCode.Sort;

import java.util.ArrayList;
import java.util.List;

public class CountPairs {
    
    public static void main(String[] args){
        List<Integer> num = new ArrayList<>();
        num.add(-1);
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(1);
        System.out.println(countPairs(num, 2));        
    }

    public static int countPairs(List<Integer> nums, int target){
        int count = 0;

        for(int i = 1; i <= nums.size() - 1; i++){
            for(int j = 0; j < i; j++){
                if(nums.get(j) + nums.get(i) < target){
                    count++;
                }
            }
        }

        return count;
    }
}
