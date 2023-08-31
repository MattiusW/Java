package Algorithm;
import java.util.Arrays;

class BubbleSortOne
{
    public static void main(String[] args)
    {
        int table[] = {8, 2, 1, 9 ,5};
        System.out.println("Before - " + Arrays.toString(table));
        System.out.println("Sorted - " + Arrays.toString(BubbleSort(table)));
    }

    private static int[] BubbleSort(int tab[])
    {   
        int pass = 1;
        for (int i = 0; i < tab.length - 1; i++)
        {
            for (int j = 0; j < tab.length - 1; j++)
            {   
                int temp;
                if (tab[j] > tab[j + 1])
                {   
                    temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
            System.out.println("Pass " + pass + ". - " + Arrays.toString(tab));
            pass++;
        }
        return tab;
    }
}
