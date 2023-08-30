package Files;
import java.io.File; //Import java input output files
import java.io.IOException; //Import Input output exception
import java.util.Date; //Import date to check last modification

class FirstFile
{
    public static void main(String[] args)
    {
        try
        {
            File sample = new File("Test.txt"); //Default path
            if (!sample.exists()) //Check file exists if not then create
            {
                sample.createNewFile(); //Create file
            }
            //Action on files
            System.out.println("Check file");
            System.out.println("1.Can I run this file?: " + sample.canExecute());
            System.out.println("2.Can I write in this file?: " + sample.canWrite());
            System.out.println("3.Can I read this file?: " + sample.canRead());
            System.out.println("4.Is this file hidden?: " + sample.isHidden());
            System.out.println("5.Is file?: " + sample.isFile());
            System.out.println("6.Last modification?: " + new Date(sample.lastModified()));
            System.out.println("7.How many characters?: " + sample.length());
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage()); //Catch exception
        }
    }
}