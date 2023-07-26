package Programs.IO;
import java.io.*;

class Cricketer implements Serializable
{
    private String name;
    private int age;
    private int runs;
    transient private int num;

    Cricketer(String name,int age,int runs,int num)
    {
        this.name=name;
        this.age=age;
        this.runs=runs;
        this.num=num;
    }
    public void print()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(runs);
        System.out.println(num);
    }
   

}

class Serial
{
    public static void main(String[] args) throws IOException
    {
        Cricketer c=new Cricketer("virat",29,10000,9);
        FileOutputStream fos=new FileOutputStream("object.txt");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        ObjectOutputStream oos=new ObjectOutputStream(bos);

        oos.writeObject(c);
        oos.flush();
        oos.close();

        c.print();


    }
}