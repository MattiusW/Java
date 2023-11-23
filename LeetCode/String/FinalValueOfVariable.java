package LeetCode.String;

public class FinalValueOfVariable {
    
    public static void main(String[] args){
        String[] operation = {"++X", "++X", "X++"};
        System.out.println(finalValueAfterOperations(operation));
    
    }

    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(int i = 0; i <= operations.length -  1; i++){
            if(operations[i].equals("++X")){
                ++x; 
            }
            else if(operations[i].equals("X++")){
                x++;
            }
            else if(operations[i].equals("--X")){
                --x;
            }
            else if(operations[i].equals("X--")){
                x--;
            }
        }

        return x;
    }
}
