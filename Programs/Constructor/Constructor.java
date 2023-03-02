package Constructor;

public class Constructor
{
    public static void main(String[]args)
    {
        Student s1=new Student(18,"sgfag");
        Student s2=new Student(20,"gagfa");
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
}