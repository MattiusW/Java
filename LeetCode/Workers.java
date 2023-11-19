package LeetCode;

public class Workers {
    
    public static void main(String[] args){
        int[] hours = {0,1,2,3,4};
        int working = numberOfEmployeesWhoMetTarget(hours, 2);
        System.out.println(working);
    }

    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target){
        int workers = 0;

        for(int i = 0; i <= hours.length - 1; i++){
            if(hours[i] >= target){
                workers++;
            }
        }
        return workers;
    }

}
