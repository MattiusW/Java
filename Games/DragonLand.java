package Games;
import java.util.InputMismatchException;
import java.util.Scanner;

class DragonLand
{
    public static void main(String[] args) throws InterruptedException
    {   
        Scanner scan = new Scanner(System.in);
        System.out.println("Dragon Land Game");
        Thread.sleep(5000); //Delay time
        System.out.println("Greetings Traveler!");
        Thread.sleep(5000);
        System.out.println("Welcome to Dragon Land!");
        Thread.sleep(5000);
        System.out.println("Please choose your destiny, press 1 or 2 or 3");
        
        try
        {
            int choose = scan.nextInt();
            switch (choose)
            {
                case 1:
                    System.out.println("Wrong choice. You'r die!");
                    break;
                case 2:
                    System.out.println("Good you'r win life!");
                    break;
                case 3:
                    System.out.println("Neutral choice. You'r not die and not win today!");
                    break;
                default:
                    System.out.println("This is not choice!");
                    break;
            }   
        }
        catch(InputMismatchException e)
        {
            System.out.println("Bye!");
            return;
        }
    }
}
