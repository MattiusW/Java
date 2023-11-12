package Algorithm;

public class FibbonacciTwo {

    public static void main(String[] args){

        int n1 = 0;
        int n2 = 1;
        int fib = 0;
        int n = 7;

        for(int i = 2; i <= n; i++){
            fib = n1 + n2; 
            n1 = n2; 
            n2 = fib;   
        }
        System.out.println(fib);
    }

}
