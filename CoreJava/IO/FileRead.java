package Programs.IO;
import java.io.*;
public class FileRead 
{
    public static void main(String[] args) throws IOException
    {
        File dir=new File("Test");
    //    System.out.println(dir.isDirectory());
        File file=new File(dir,"PW.txt");
      //  System.out.println(file.isFile());

      FileReader fr=new FileReader(file);

      int i=fr.read();
     

      //System.out.println(i);

     // System.out.println((char)i);

      while(i!=-1)
      {

        System.out.print(i+"----->");
        System.out.println((char)i);
        i=fr.read();
      }

        

    }
}
