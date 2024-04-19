package Practice.CoreJava;

import java.io.*;

 class Employee implements Serializable
{
    private int num;
    transient private int age;
    private String name;

    Employee(int num,int age,String name)
    {
        this.num=num;
        this.age=age;
        this.name=name;
    }

    public void show()
    {
        System.out.println(num);
        System.out.println(age);
        System.out.println(name);
    }
}


class IOSerialObject
{
    public static void main(String[] args) throws IOException
    {
       File f=new File("object.txt");
       FileOutputStream fos=new FileOutputStream(f);
       BufferedOutputStream bos=new BufferedOutputStream(fos);
       ObjectOutputStream oos=new ObjectOutputStream(bos);

       Employee e=new Employee(9,23, "sufyan");
       oos.writeObject(e);

       oos.flush();
       oos.close();


    }
}