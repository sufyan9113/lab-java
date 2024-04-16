package Programs.Inheritance2;



class Animals // extends Object
{
    int age=18;

    void show()
    {
        System.out.println(age);
    }
}

class Tiger extends Animals // single level inheritance
{

}
class Beer extends Tiger // multi level inheritance
{

}

class Monkey extends Animals // herarchical inheritance
{

}

class Elephant extends Animals  // herarchical inheritance
{
   void disp(){
    System.out.println("elephant class");
   }
}
class Dog extends Animals//extends ,Elephant multiple inheritance not allowed
{

}

public class TypesInheritance 
{
    public static void main(String[] args) 
    {
        Tiger t= new Tiger();
        t.show();
        
        Beer b=new Beer();
        b.show();

        Dog d=new Dog();
        d.show();
      

       
         
        
    }
}


