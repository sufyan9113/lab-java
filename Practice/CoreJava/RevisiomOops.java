package Practice.CoreJava;
import java.util.*;
class Rectangle
{
    float length;
    float breadth;
    float area;

    void Input()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Area of Reactanlge Calculation");

        System.out.println("enter length of Rectangle");
        length= s.nextFloat();

        System.out.println("enter breadth of Rectangle");
        breadth= s.nextFloat();

    }

    void Compute()
    {
        area= length*breadth;
    }

    void disp()
    {
        System.out.println("the area of rectangle is :"+area);
    }
}

class Square
{
    float length;
    float area;

    void Input()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Area of Square Calculation");

        System.out.println("enter length of Sqaure");
        length= s.nextFloat();


    }

    void Compute()
    {
        area= length*length;
    }

    void disp()
    {
        System.out.println("the area of square is :"+area);
    }
}

class Circle
{
    float radius;
    float area;

    void Input()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Area of Circle Calculation");

        System.out.println("enter raius of cirlce");
        radius= s.nextFloat();

    }

    void Compute()
    {
        area= 3.14f*radius*radius;
    }

    void disp()
    {
        System.out.println("the area of cirlce is :"+area);
    }
}

public class RevisiomOops 
{
    public static void main(String[] args) 
    {
        Rectangle a1=new Rectangle();
        a1.Input();
        a1.Compute();
        a1.disp();
        System.out.println("..............");

        Square a2= new Square();

        a2.Input();
        a2.Compute();
        a2.disp();
        System.out.println("..............");

        Circle a3= new Circle();

        a3.Input();
        a3.Compute();
        a3.disp();
        System.out.println("..............");
        
    }
}
