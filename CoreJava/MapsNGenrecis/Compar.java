import java.util.*;



 class Student5 implements Comparable<Student5>
{
        int marks;
        int age;
        String name;

    Student5(int marks,int age,String name)
    {
        this.marks=marks;
        this.age=age;
        this.name=name;
    }

    public int getMarks()
    {
        return marks;
    }
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }

    public String toString()
    {
        return marks+":"+age+":"+name;
    }

    public int compareTo(Student5 a)
    {
        if(this.marks>a.marks)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }

}
/*
class Check implements Comparator<Student5>
{
    public int compare(Student5 a1,Student5 a2)
    {
        if(a1.age>a2.age)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}
*/
public class Compar 
{
    public static void main(String[] args) 
    {
        Student5 s1=new Student5(30,23,"sufyan");
        Student5 s2=new Student5(35,20,"rohit");
        Student5 s3=new Student5(40,25,"rohan");

        System.out.println(s1+" "+s2+" "+s3);

        ArrayList<Student5> a=new ArrayList<Student5>();

       // Check c=new Check();

      /* Comparator<Student5> c=(Student5 a1, Student5 a2)->
        {
            if(a1.age>a2.age)
            {
                return 1;
            }
            else
            {
                return -1;
            }
        
       };
*/
       


        a.add(s1);
        a.add(s2);
        a.add(s3);

        Collections.sort(a);
        System.out.println(a);
    }
    

    
}
