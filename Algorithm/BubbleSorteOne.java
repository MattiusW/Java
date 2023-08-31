package Algorithm;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

class BubbleSortOne
{
    public static void main(String[] args)
    {   
        Scanner scan = new Scanner(System.in);
        System.out.print("Take table length: ");
        
        try
        {
            int howLong = scan.nextInt();
            int table[] = dynamicTable(howLong);
            System.out.println("Before - " + Arrays.toString(table));
            System.out.println("Sorted - " + Arrays.toString(BubbleSort(table)));
        }
        catch(NegativeArraySizeException l)
        {
            System.err.println("Wrong size!");
        }
        catch(InputMismatchException input)
        {
            System.err.println("Wrong inupt!");
        }
    }

    private static int[] BubbleSort(int tab[])
    {   
        int pass = 1;
        for (int i = 0; i < tab.length - 1; i++)
        {
            for (int j = 0; j < tab.length - 1 - i; j++) //Loop optimization
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

    private static int[] dynamicTable(int sizeTable)
    {   
        int tab[] = new int[sizeTable];
        for (int i = 0; i < sizeTable; i++)
        {   
            Scanner scan = new Scanner(System.in);
            int numbers = scan.nextInt();
            tab[i] = numbers;     
        }
        return tab;
    }
}
