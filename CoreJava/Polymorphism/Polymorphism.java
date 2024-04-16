
class Animals
{
    public void eat()
    {
        System.out.println("Animals eat vegetable food and meat");
    }

    public void sleep()
    {
        System.out.println("Animals needs sleep");
    }
}

class Tiger extends Animals
{
    public void eat()
    {
        System.out.println("Tiger eat meat only");
    }

    public void sleep()
    {
        System.out.println("Tiger needs more sleep");
    }
}

class Elephant extends Animals
{
    public void eat()
    {
        System.out.println("Elelphant eat vegeterian food only");
    }

    public void sleep()
    {
        System.out.println("Elephant needs less sleep comparatively");
    }
}

class Disp 
{
    public void disp(Animals a)
    {
        a.eat();
        a.sleep();
        System.out.println("...................");
    }
}
public class Polymorphism 
{
    public static void main(String[] args) 
    {
        Tiger t= new Tiger();
        Elephant e= new Elephant();

        Disp d= new Disp();

        d.disp(t);
        d.disp(e);


        
    }
}
