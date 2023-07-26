package Programs.IO;
import java.io.*;
public class BufferedReaderFile
{
    public static void main(String[] args) throws IOException
    {
        File dir=new File("Test");

        File file=new File(dir,"PW.txt");

        FileReader fr=new FileReader(file);

        BufferedReader br=new BufferedReader(fr);

        String s=br.readLine();

        while(s!=null)
        {
            System.out.println(s);
            s=br.readLine();
        }

    }
}
