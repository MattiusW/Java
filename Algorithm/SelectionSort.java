package Algorithm;
import java.util.Arrays;

class SelectionSort
{
    public static void main(String[] args)
    {
        int tab[] = {8, 2, 1, 9, 5};
        System.out.println(Arrays.toString(tab));

        for (int i = 0; i < tab.length - 1; i++)
        {
            int minIndex = i;
            int temp;
            for (int j = i + 1; j < tab.length; j++)
            {
                if (tab[minIndex] > tab[j])
                {
                    minIndex = j;
                }
            }
            temp = tab[i];
            tab[i] = tab[minIndex];
            tab[minIndex] = temp;
            System.out.println(Arrays.toString(tab));
        }
    }
}