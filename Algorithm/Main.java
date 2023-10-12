package Algorithm;
import java.util.Arrays;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        
        int number = 5;
        int tab[] = {1,1,2,2,3,3,7,7};
        String word = "Potop";
        boolean palindrome = Palindrome.isPalindrome(word);
        System.out.println(palindrome);
        ArrayList<Integer> fib = Fibonacci.fibonacciSequence(tab);
        System.out.println("Tab: " + Arrays.toString(tab) + " Fibonacci: " + fib);
        int fact = Factorial.factorialAmount(number);
        System.out.println("Factorial: " + fact);
    }
}