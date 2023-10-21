package Algorithm;
import java.util.Arrays;

class Insertion{
    public static void main(String[] args){
        int[] table = {3,2,4,1};
        int[] tab = insertion(table);
        System.out.println(Arrays.toString(tab));
    }

    public static int[] insertion(int tab[]){
        int i = 1;
        int key;

        while(i <= tab.length - 1)
        {
            key = tab[i];
            int j = i - 1;

            while(j >= 0 && key < tab[j]){
                tab[j + 1] = tab[j];
                j--;
                System.out.println(Arrays.toString(tab));
            }
            tab[j + 1] = key;
       
            i++;
        }

        return tab;
    }
}
