package Algorithm;
import java.util.Arrays;

class InsertionSort
{
    public static void main(String[] args)
    {
        int tab[] = {8, 2, 10, 1, 9 ,5, 7, 3, 11};
        System.out.println("Not sorted: " + Arrays.toString(tab));

        int i = 1;
        while (i < tab.length)
        {
            int key = tab[i];
            int j = i - 1;
            while (j >= 0 && key < tab[j])
            {
                tab[j + 1] = tab[j];
                j--;
            }
            tab[j + 1] = key;
            i++;
            System.out.println(Arrays.toString(tab));
        }
    }
}