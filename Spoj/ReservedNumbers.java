package Spoj;

import java.util.Scanner;
import java.util.Arrays;

class ReservedNumbers{
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("How many number you enter?: ");
        int howMany = scan.nextInt();
        int[] result = reserveTable(howMany);
        System.out.println(Arrays.toString(result));
    }

    public static int[] reserveTable(int n){
        int[] table = new int[n];
        Scanner scanner = new Scanner(System.in);
            
        for(int i = table.length - 1; i >= 0; i--){
            int number = scanner.nextInt();
            table[i] += number;
        }

        return table;
    }
        
}
