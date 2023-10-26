package Spoj;
import java.util.Scanner;

class TwoFactorial{

    public static void main(String[] args){
        int number = isPositive();
        int fact = factorial(number);
        System.out.println(fact);
        int n1 = fact % 10;
        int n2 = fact / 10 % 10;
        System.out.println(n1 + " " + n2);
        
    }

    public static int isPositive(){
        Scanner scan = new Scanner(System.in); 
        int number = -1;

        do{
            try{
                System.out.print("Get positive number: ");
                number = scan.nextInt();
            }
            catch(Exception e){
                System.out.println("Wrong value!");
                scan.next(); //Skip wrong value and use scanner again
            }

        }while(number < 0);
    
        return number;
    }

    public static int factorial(int n){
        
        if(n == 1 || n == 0){
            return 1;
        }

        return factorial(n - 1) * n;
    }
    
}

