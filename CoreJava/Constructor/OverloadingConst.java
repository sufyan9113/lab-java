package Constructor;

class OverloadingConst{
public static void main(String[] args) 
{
    Student s1=new Student();
    s1.disp();
    Student s2=new Student("rohit");
    s2.disp();
    Student s3=new Student(18,"rohan");
    s3.disp();
}
}

class Student
{
private int age;
private String name;

Student()
{
    this.age=15;
    this.name="rahul";
}

Student (String name)
{
    this.name=name;
    this.age=10;
}

Student (int age, String name)
{
    this.age=age;
    this.name=name;
}

void disp()
{
    System.out.println(age);
    System.out.println(name);
}

}
