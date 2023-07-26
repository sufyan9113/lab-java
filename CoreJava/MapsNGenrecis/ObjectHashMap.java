
import java.util.*;
import java.util.Map.*;


class Student
{
    private String name;
    private int age;
    private String city;

    Student(String name,int age,String city)
    {
        this.name=name;
        this.age=age;
        this.city=city;
    }

    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getCity()
    {
        return city;
    }

    public String toString()
    {
        return name+" "+age+" "+city;
    }
}
public class ObjectHashMap
{
    public static void main(String[] args) 
    {
        Student s1=new Student("sufyan",23,"mumbai");
        Student s2=new Student("rohan",25,"kolakata");
        Student s3=new Student("rohit",28,"delhi");

        HashMap map=new HashMap();

        map.put(1,s1);
        map.put(2,s2);
        map.put(3,s3);

        System.out.println(map);

        Set s=map.entrySet();
        Iterator i=s.iterator();

        while(i.hasNext())
        {
           // System.out.println(i.next());

           Map.Entry en=(Entry)i.next();

           System.out.println(en.getKey()+" : "+ en.getValue());
        }
    }
}
