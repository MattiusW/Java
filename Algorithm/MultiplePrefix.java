import java.util.ArrayList;

public class MultiplePrefix {
    
    public static void main(String[] args) {
        int[] table = {2,2,4,6,7,8,11,13,14,15};
        ArrayList evenNumbers = new ArrayList<>();
        int count = 0;
        int l = 2;
        int r = 9;

        for(int i = 0; i < table.length; i++) {
            if(table[i] % 2 == 0){
                evenNumbers.add(1);
            }
            else{
                evenNumbers.add(0);
            }
        }

        System.out.println(evenNumbers);

        for(int i = l; i <= r; i++) {
            if(l == 0 || l == 1) {
                if((int)evenNumbers.get(i) == 1) {
                    count++;
                } 
            }
            else if((int)evenNumbers.get(i) == 1) {
                count++;
            }
        }

        System.out.println(count);
    }

}
