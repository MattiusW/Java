import java.util.Arrays;

class LongestSubsequence{

    public static void main(String[] args){
        int[] nums = {4,5,2,1};
        int[] quaries = {3,10,21};
        int[] anserw = answerQueries(nums, quaries);
        System.out.println(Arrays.toString(anserw));
    }

    public static int[] answerQueries(int[] nums, int[] queries){
        int[] anserw = new int[queries.length];
        int count = 0;
        
        for(int i = 1; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                if(nums[j] + nums[i] < queries[j]){
                    count++;
                    anserw[j] = count;
                }

            }
        }

        return anserw;
    }

}