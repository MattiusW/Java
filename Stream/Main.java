package Stream;

import java.io.*;

class Main
{
    public static void main(String[] args) throws IOException
    {
        InputStream inS;
        OutputStream outS;

        File text = new File("TestStream.txt");
        Reader reader;
        BufferedWriter writer = new BufferedWriter(new FileWriter(text)); //Create file

        writer.write("Hi my name is Mateusz!"); //Write file
        writer.newLine();
        writer.write("Buffered Writer is fast then usually writer");
        writer.close(); //Close file
    }
}
