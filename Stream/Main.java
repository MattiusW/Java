package Stream;

import java.io.*;

class Main
{
    public static void main(String[] args) throws IOException
    {   
        //Token
        Article good = new Article(200, "BG3", 2023, 11, 7);
        System.out.println(good);

        //Write and read
        InputStream inS;
        OutputStream outS;

        File text = new File("TestStream.txt");
        BufferedReader reader = new BufferedReader(new FileReader("Test.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter(text)); //Create file

        writer.write("Hi my name is Mateusz!"); //Write file
        writer.newLine();
        writer.write("Buffered Writer is fast then usually writer");
        writer.close(); //Close file

        //PrinterWriter
        try
        {
            PrintWriter printer = new PrintWriter(new FileWriter("Test.txt", true));
            printer.println("Test you'r mind"); //Write to end text
            printer.append("New line"); //Write under text
            printer.println();
            printer.printf("Matt %d", 777);
            printer.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("Many arguments:");
        Main.test(1,10, 15.0, "Matt", 120, 777);
        
        System.out.println("ASCII: " + reader.read()); //ASCII
        System.out.println("Char: " + (char)reader.read());
        System.out.println("Read line: " + reader.readLine()); //Read line
        
        //Read all text
        String fileText = "";
        while((fileText = reader.readLine()) != null)
        {
            System.out.println(fileText);
        }

        //Save date to new file
        BufferedWriter writered = new BufferedWriter(new FileWriter("Date.txt"));
        reader = new BufferedReader(new FileReader("Test.txt")); //Again open to read file since start

        String saveText = "";
        while((saveText = reader.readLine()) != null)
        {
            writered.write(saveText);
            writered.newLine();
        }
        writered.close(); //Need close file to save read text
    }
    
    static void test(Object... a) //Many arguments
    {
        for (var i : a)
        {
            System.out.println(i);
        }
    }
}
