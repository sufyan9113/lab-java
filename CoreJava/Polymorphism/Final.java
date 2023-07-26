
/*final class Animals // if declare as final then it can not be inherited to child class
{
    void eat()
    {
        System.out.println("animals required food");
    }
}
*/
class Animals 
{   
    final int age=20;
    final void eat() // if declare as final then it can be inherited but cannot be override by child class
    {   
       // age=30; if declared as final it will be treated as constant it cannot be changed
        System.out.println("animals required food");
    }
}

class Tiger3 extends Animals
{
    void eat()
    {
        System.out.println("tiger required food");
    }
}
public class Final 
{
    public static void main(String[] args) 
    {
        Tiger3 t= new Tiger3();
        t.eat();
    }
}
