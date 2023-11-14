package Spoj;

public class SingleNumber {
    
    public static void main(String[] args){
        int[] tab = {4,1,2,1,2};
        System.out.println(singleNumber(tab));
    }

    public static int singleNumber(int[] nums) {
        int number = 0;
        
        for(int num : nums){
            number ^= num;
        }
      
        return number;
    }

}
