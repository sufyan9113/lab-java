package Programs.IO;
import java.io.*;




public class FileInDirectory 
{
    public static void main(String[] args) 
    {
        int count=0;
        File f=new File("Test");

        f.mkdir();
        System.out.println(f.isDirectory());

        File f1=new File(f,"test1.txt");
        File f2=new File(f,"test1.java");
        File f3=new File(f,"test1.c");
        System.out.println(f1.isFile()+" "+f2.isFile()+" "+f3.isFile());
        try
        {
            f1.createNewFile();
            f2.createNewFile();
            f3.createNewFile();
        }
        catch(IOException e)
        {
            System.out.println("io exception");
        }
        String[] list=f.list();

        for(String s:list)
        {
            count++;
            System.out.println(s);
        }
        System.out.println(count);
        






    }

    

    
}
