package Programs.IO;
import java.io.*;
public class FileRead2 
{
    public static void main(String[] args) throws IOException
    {
        File dir=new File("Test");
       // System.out.println(dir.isDirectory());
        File f=new File(dir,"PW.txt");
      //  System.out.println(f.isFile());

      FileReader fr=new FileReader(f);

      char[] c=new char[(int)f.length()];

      fr.read(c);

      for(char data:c)
      {
        System.out.print(data);
      }

      /*   int i=fr.read();
        while(i!=-1)
        {
            System.out.print(i+"--->");
            System.out.println((char)i);
            i=fr.read();    
        }

      */


    }
}
