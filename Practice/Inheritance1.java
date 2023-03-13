package Practice;


/*class Human{
    int age=18;

    void sleep(){
        System.out.println("sleep");
        System.out.println(age);
    }
}

class Student extends Human{

}


public class Inheritance 
{
    public static void main(String[] args) 
{
    Student s= new Student();

    s.age=20;
    s.sleep();

}
}
*/
class Human 
{
    int age;
    private String name;
    Human()
    {
      
      System.out.println("human class constructor");
    }

    void sleep()
    {
        age=15;
        System.out.println("sleep Human class method");
        System.out.println(age);
    }
  
}
class Student extends Human{

    Student(){
        super();
    }
     
    void show()
    {
        System.out.println("the age is : " +age );
       // System.out.println(name);
    }
    
}

class Inheritance1
{
    public static void main(String[] args) 
    {
        Student s=new Student();
        s.sleep();
        s.show();
      
        
    }
}
