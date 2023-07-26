package Programs.IO;
import java.io.*;

public class FileWrite 
{
    public static void main(String[] args) throws IOException
    {
        File f=new File("Test");
      //  File f1=new File(f,"test1.txt");
      //  File f2=new File(f,"test2.txt");

        System.out.println(f.isDirectory());
   //     f.mkdir();

        File f1=new File(f,"test1.txt");
        File f2=new File(f,"test2.txt");
        try
        {

        f1.createNewFile();
        f2.createNewFile();

        }
        catch(IOException e)
        {
            System.out.println("IOException");
        }
        

    
            FileWriter fw=new FileWriter(f1);
            FileWriter fw1=new FileWriter(f2);

            fw.write("java");
            fw.write("\n");
            fw.write("lab");
            fw.write("\n");
            fw.write(97);
            fw.write("\n");
            fw.write(97);
            fw.write("\n");
            char[] c={'a','b','c'};
            fw.write(c);

            fw.close();


            fw1.write("test2");
            fw1.write("\n");
            fw1.write("lab2");
            fw1.write("\n");
            fw1.write(97);
            fw1.write("\n");
            fw1.write(98);
            fw1.write("\n");
            char[] c1={'d','e','f'};
            fw1.write(c1);
            fw1.write("\n");

            fw1.close();

            System.out.println("open file to see output");
            


        
       
           
        


        
        

    }
}
