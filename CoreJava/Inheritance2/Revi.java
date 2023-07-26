import java.util.*;

abstract class Area1
{
    float area;

    abstract void input();
    abstract void compute();

     void disp()
     {
     System.out.println("the area is :"+area);
     }
}

class Rectangle1 extends Area1
{
    float length;
    float breadth;


    void input()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Area of Reactanlge Calculation");

        System.out.println("enter length of Rectangle");
        length= s.nextFloat();

        System.out.println("enter breadth of Rectangle");
        breadth= s.nextFloat();

    }

    void compute()
    {
        area= length*breadth;
    }

    
}

class Square1 extends Area1
{
    float length;

    void input()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Area of Square Calculation");

        System.out.println("enter length of Sqaure");
        length= s.nextFloat();


    }

    void compute()
    {
        area= length*length;
    }

}

class Circle1 extends Area1
{
    float radius;

    void input()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Area of Circle Calculation");

        System.out.println("enter radius of cirlce");
        radius= s.nextFloat();

    }

    void compute()
    {
        area= 3.14f*radius*radius;
    }

    
}

class Cal
{
    void cal(Area1 a)
    {
        a.input();
        a.compute();
        a.disp();
        System.out.println("..............");
    }
}

public class Revi 
{
    public static void main(String[] args) 
    {
        Rectangle1 a1=new Rectangle1();
        Square1 a2= new Square1();
        Circle1 a3= new Circle1();

        Cal c=new Cal();

        c.cal(a1);
        c.cal(a2);
        c.cal(a3);

       
        
    }
}
