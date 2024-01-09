import java.util.Arrays;

class Prefix {

    public static void main(String[] args) {
        int[] table = {2,2,3,1,1,2,1,4,3,1,2,3,2};
        System.out.println(prefix(table, 0, 5));
    }

    public static int prefix(int[] table, int l, int r) {
        int sum = 0;
        int[] pref = new int[table.length];
        pref[0] = table[0];
        for(int i = 1; i < table.length; i++) {
            pref[i] = pref[i - 1] + table[i];
        }

        System.out.print("Pref table: ");
        System.out.println(Arrays.toString(pref));

        if (l == 1 || l == 0){
            sum = pref[r];
        }
        else {
            sum = pref[r] - pref[l - 1]; 
        }
        return sum;
    }
}