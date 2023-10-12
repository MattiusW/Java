package Algorithm;
import java.util.ArrayList;


class Main{
    public static void main(String[] args){
        int[] tab = {1,1,2,2,3,3,4,4,5,5};
        ArrayList<Integer> fib = Fibonacci.fibonacciSequence(tab);
        System.out.println("Tab: " + tab + "Fibonacci: " + fib);
        int factorial = Factorial.factorialAmount(5);
        System.out.println("Factorial: " + factorial);
    }
}