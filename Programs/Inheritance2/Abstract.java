package Inheritance2;

// final abstract class Animals // if class is declared as final it can not be inherited
abstract class Animals // object of abstract class cannot be created as it has incomplete method
{
    //abstract final void sleep(); // if a method is declared as final it can be inherited by can not be ovverride
    final int age=10;
   // age=20; if a variable is declared as final and its value is initialised afterwards it cannot be changed it becomes constant variable

    abstract void sleep();
    abstract void eat();

    

}

class Tiger extends Animals
{
    void sleep()
    {
        System.out.println("tiger required sleep");
    }

    void eat()
    {
        System.out.println("tiger eat meat by hunting of animal");
    }

    void run()
    {
        System.out.println("tiger run at fast speed");
    }
}


class Abstract
{
    public static void main(String[] args) 
    {
        Animals t= new Tiger();
        t.eat();
        t.sleep();
        ((Tiger) t).run(); // specialised method cannot be access directly by parent class ref. so temp behaviour of parent class ref. is to be changed
    }
}