package Programs.IO;
import java.io.*;

public class PrintWt 
{
    public static void main(String[] args) throws IOException
    {
        File dir=new File("Test");
        File file=new File(dir,"PW.txt");
        FileWriter fw=new FileWriter(file);
        PrintWriter pw=new PrintWriter(fw);

        pw.println("sufyan");
        pw.println(true);
        pw.println(10);
        pw.println(10.1);
        pw.println('c');
        pw.close();



    }
}
