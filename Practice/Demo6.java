package Practice;

class Car
{
    private Engine e;
    void setE(Engine e)
    {
        this.e=e;
    }
    void call()
    {
        e.engineStart();
    }
}
class Engine
{
    void engineStart()
    {
        System.out.println("engine started");
    }
}

abstract class Abstr
{
    void show()
    {
        System.out.println("show");
    }
    void print()
    {
        System.out.println("print");
    }
}
class N extends Abstr
{

}

public class Demo6 
{
    public static void main(String[] args) 
    {
        /*Engine e=new Engine();
        Car c= new Car();
        c.setE(e);
        c.call();
*/
        Abstr obj=new N();
        obj.show();
        obj.print();


    }
    
   
}
