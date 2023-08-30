package Algorithm;
import java.util.Arrays;

class BubbleSort
{
    public static void main(String[] args)
    {
        int[] sampleArray = {2, 4, 3, 0, 21, 7, 54, 11, 777, 23, 1, 27, 7, 100};
        System.out.println(Arrays.toString(bubbleSort(sampleArray)));
    }

    private static int[] bubbleSort(int table[])
    {   
        boolean changed = false;
        for (int i = 0; i < table.length - 1; i++)
        {
            int currentNumber = table[i];
            int nextNumber = table[i + 1];
            if (currentNumber > nextNumber)
            {
                table[i] = nextNumber;
                table[i + 1] = currentNumber;
                changed = true;
            }
        }
        return changed ? bubbleSort(table) : table;
    }
}
