package Programs.IO;
import java.io.*;
public class BufferWriterFile 
{
    public static void main(String[] args) throws IOException
    {
        File dir=new File("Test");
       // System.out.println(dir.isDirectory());

        File file=new File(dir,"PW.txt");
        //System.out.println(file.isFile());

        FileWriter fw=new FileWriter(file);

        BufferedWriter bw=new BufferedWriter(fw);

        bw.write("sufyan");
        bw.newLine();
        bw.write(97);
        bw.newLine();
        char[] c={'a','b','c','d'};
        bw.write(c);
        bw.newLine();
        bw.write("java");
        bw.newLine();
        bw.write("vdfafddbf");

        bw.close();


        



    }
}
