package Constructor;

public class Prac {
    public static void main(String[] args) 
    {
        Student s1=new Student(10,"sufyan");
        Student s2=new Student();
        Student s3=new Student(20);
        Student s4=new Student("sufyan3");
        System.out.println(s1.getAge()+" "+ s1.getName());
        System.out.println(s2.getAge()+" "+ s2.getName());
        System.out.println(s3.getAge()+" "+ s3.getName());
        System.out.println(s4.getAge()+" "+ s4.getName());


    }
}

class Student
{
    private int age;
    private String name;
    Student(int age,String name){
        this.age=age;
        this.name=name;
    }
    Student(){
        age=15;
        name="sufyan1";

    }

    Student(int age){
        this.age=age;
        name="sufyan2";
    }

    Student(String name){
        this.name=name;
        age=30;
    }

    
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }


}

        
    

