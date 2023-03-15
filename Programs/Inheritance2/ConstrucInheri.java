package Programs.Inheritance2;

class Demo1
{
    int a,b;

    Demo1()
    {
        System.out.println("parent class constructor");
    }

    Demo1(int x, int y)
    {
        System.out.println("parameterised parent class constructor");
        a=x;
        b=y;
    }
}

class Demo2 extends Demo1
{
    int c,d;

    Demo2()
    {
        System.out.println("child class constructor");
    }

    Demo2(int x, int y)
    {
        System.out.println("parameterised child class constructor");
        c=x;
        d=y;
    }

}
public class ConstrucInheri 
{
    Demo2 d= new Demo2();
}
