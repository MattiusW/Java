package Hello;
import java.util.Scanner;

class HelloYou
{
   public static void main(String[] args)
   {    
        Scanner scan = new Scanner(System.in);
        System.out.print("Hi. Tell me you'r name: ");
        String name = scan.nextLine();
        System.out.println("Nice to meet you " + name + "!");
   }
} 