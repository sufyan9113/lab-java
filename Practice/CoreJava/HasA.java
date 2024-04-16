package Practice.CoreJava;

class Student
{
    private RollNo r;

    public Student(RollNo r)
    {
        this.r=r;
    }

    public void callRollNo()
    {
        r.RollNo();
    }
}

class RollNo
{
    void RollNo()
    {
        System.out.println("the roll no of student is: "+113);
    }

}

public class HasA
{
    public static void main(String[] args) 
    {
        RollNo r=new RollNo();
        Student s= new Student(r);
        s.callRollNo();

    }
}