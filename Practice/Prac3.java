package Practice;
public class Prac3
{
    public static void main(String[] args) 
    {
       
        Student s2=new Student();
        System.out.println(s2.getAge()+" "+ s2.getName());

        Student s3=new Student(20);
        System.out.println(s3.getAge()+" "+ s3.getName());

        Student s4=new Student("sufyan3");
        System.out.println(s4.getAge()+" "+ s4.getName());

        Student s1=new Student(10,"sufyan");
        System.out.println(s1.getAge()+" "+ s1.getName());

    }
}

class Student
{
    private int age;
    private String name;
    
    
    Student(){

        this(10,"sufyan");
        age=15;
        name="sufyan1";
        System.out.println("this methhod call");

    }

    Student(int age){
        this(10,"sufyan");
        
        this.age=age;
        name="sufyan2";
    }

    Student(String name){
       
        
        this.name=name;
        age=30;
    }

        Student(int age,String name){
        this.age=age;
        this.name=name;
        System.out.println("overloading constructor");
        
     }
    
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }


}

   