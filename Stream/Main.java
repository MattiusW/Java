package Stream;

import java.io.*;

class Main
{
    public static void main(String[] args) throws IOException
    {
        InputStream inS;
        OutputStream outS;

        Reader reader;
        Writer writer = new FileWriter("TestStream.txt"); //Create file

        writer.write("Hi my name is Mateusz!"); //Write file

        writer.close(); //Close file
    }
}
