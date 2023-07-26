package Programs.IO;
import java.io.*;

public class FileCreate 
{
    public static void main(String[] args) throws IOException
    {
       
    File f=new File("file check.txt");

    System.out.println(f.exists());

    f.createNewFile();
    System.out.println(f.exists());
    System.out.println("******************");

    File dr=new File("directory");

    System.out.println(dr.exists());

    dr.mkdir();

    System.out.println(dr.exists());






    }
}
