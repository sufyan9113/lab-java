
abstract class Animals1
{
    abstract void eat();
    abstract void sleep();

    void run()
    {
        System.out.println("animal is ruunig");
    }
}

class Tiger1 extends Animals1
{
    void eat()
    {
        System.out.println("tiger eat meat");
    }

    void sleep()
    {
        System.out.println("tiger required more sleep");
    }

    void hunt()
    {
        System.out.println("tiger eat by hunting animals");
    }
}

class Elephant1 extends Animals1
{
    void eat()
    {
        System.out.println("Elephant eat grass");
    }

    void sleep()
    {
        System.out.println("elephant required  sleep");
    }
}
public class Abstract 
{
    public static void main(String[] args) 
    {
        Animals1 t= new Tiger1();
        t.eat();
        t.sleep();
        t.run();
        ((Tiger1)t).hunt(); // specialised method achived by downcasting of parent class reference

        Animals1 e= new Elephant1();
        e.eat();
        e.sleep();
        e.run();


    }
}
