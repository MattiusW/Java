package Spoj;

class ReturnPointer {

    public static void main(String[] args){
        int[] table = {2,3,5,6,8,9,11};
        System.out.println(pointer(table, 1));
    }

    public static int pointer(int[] nums, int target){

        int pointer = 0;

        for(int i = 0; i <= nums.length - 1; i++){
            if(nums[i] == target){
                System.out.println("Jestem if");
                return pointer = i;
            }
            else if(nums[i] != target){
                if(nums[i] < target){
                    pointer = i + 1;
                }
            }
        }
        return pointer;
    }
    
}
