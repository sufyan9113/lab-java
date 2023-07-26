package Constructor;

public class Constructor
{
    public static void main(String[]args)
    {
        Student s1=new Student(18,"sufyan");
        Student s2=new Student(20,"navin");

        System.out.println(s1.getAge()+" "+s1.getName());

        
    }

    
}

class Student{
   private int age;
    private String name;
    Student(int age,String name)
    {
        this.age=age;
        this.name=name;
    }
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
}