package Algorithm;
import java.util.Arrays;
import java.util.Scanner;

class BubbleSortOne
{
    public static void main(String[] args)
    {   
        Scanner scan = new Scanner(System.in);
        System.out.print("Take table length: ");
        int howLong = scan.nextInt();
        int table[] = dynamicTable(howLong);
        
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

    public static int[] dynamicTable(int sizeTable)
    {   
        int tableWrong[] = {0};
        int tab[] = new int[sizeTable];
        
        if (sizeTable > 0)
        {
            for (int i = 0; i < sizeTable; i++)
            {   
                Scanner scan = new Scanner(System.in);
                int numbers = scan.nextInt();
                tab[i] = numbers;     
            }
            return tab;
        }
        else
        {
            System.out.println("Wrong!");
            return tableWrong;
        }
    }
}
