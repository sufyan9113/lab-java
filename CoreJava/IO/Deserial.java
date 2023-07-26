package Programs.IO;

import java.io.FileInputStream;
import java.io.*;
public class Deserial 
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        FileInputStream fis=new FileInputStream("object.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);

        ObjectInputStream ois=new ObjectInputStream(bis);

        Cricketer c=(Cricketer)ois.readObject();
        c.print();

        ois.close();



    }
}
