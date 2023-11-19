package LeetCode.String;

import java.util.Arrays;

public class SortPeople {

    public static void main(String[] args){
        String[] name = {"Mary", "Jan", "Emma"};
        int[] height = {180, 165, 175};
        String[] sortedName = sortPeople(name, height);
        System.out.println(Arrays.toString(sortedName));
    }
    
    public static String[] sortPeople(String[] names, int[] heights) {
        
        for(int i = 1; i <= heights.length - 1; i++){
            for(int j = 0; j < i; j++){
                if(heights[j] < heights[i]){
                    int temp = heights[j];
                    heights[j] = heights[i];
                    heights[i] = temp; 
                    String tempTwo = names[j];
                    names[j] = names[i];
                    names[i] = tempTwo;
                }
            }
        }
        return names;
    }
}
