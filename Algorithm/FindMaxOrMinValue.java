package Algorithm;
import java.util.IntSummaryStatistics;
import java.util.Scanner;
import java.util.Arrays;

class FindMaxOrMinValue
{   
    static int[] table = new int[5];
    public static void main(String[] args)
    {   
        Scanner scan = new Scanner(System.in);
        
        for (int i = 0; i < table.length; i++)
        {   
            System.out.print("Get number " + i + ": ");
            int number = scan.nextInt();
            table[i] = number;
        }

        showTable(table);
        System.out.println("Max value: " + maxValue(table)); //max value
        showTable(table);
        System.out.println("Min value: " + minValue(table)); //min value

        System.out.print("Max and Min value with java library ");
        IntSummaryStatistics stats = Arrays.stream(table).summaryStatistics();
        System.out.print("Max: " + stats.getMax());
        System.out.print(" Min: " + stats.getMin());
    }

    static void showTable(int tab[])
    {
        System.out.print("Table: ");
        for (int i : table)
        {   
            System.out.print(i + " ");
        }
    }

    static int maxValue(int tab[])
    {
        int max = tab[0];

        for (int i = 0; i < tab.length; i++)
        {
            if (max < tab[i])
            {
                max = tab[i];
            }      
        }
        return max;
    }

    static int minValue(int tab[])
    {
        int min = tab[0];

        for (int i = 0; i < tab.length; i++)
        {
            if (min > tab[i])
            {
                min = tab[i];
            }      
        }
        return min;
    }
}
