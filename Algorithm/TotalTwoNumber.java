package Algorithm;

public class TotalTwoNumber{
    
    public static void pairs(int[] table, int key){

        for(int i = 1; i < table.length; i++){
            for(int j = 0; j < i; j++){
                if(table[j] + table[i] == key){
                    System.out.println("Pairs: " + table[j] + "," + table[i]);
                }
            }
        }
    }
}
