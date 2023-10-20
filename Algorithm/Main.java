package Algorithm;
import java.util.ArrayList;
import java.util.Arrays;


class Main{
    public static void main(String[] args){
        int[] tab = {1,1,2,2,3,3,4,4,5,5};
        ArrayList<Integer> fib = Fibonacci.fibonacciSequence(tab);
        System.out.println("Tab: " + Arrays.toString(tab) + " Fibonacci: " + fib);
        int factorial = Factorial.factorialAmount(5);
        System.out.println("Factorial: " + factorial);
        int[] table = {1,2,3,4,5};
        TotalTwoNumber.pairs(table, 4);

    }
}