package Interface;

interface A1
{
    void print();
}

interface A2 extends A1
{
    void show();
}

class A3 implements A1,A2
{
    public void print()
    {
        System.out.println("in show");
    }
    public void show()
    {
        System.out.println("in print");
    }

}

public class MultiInterface 
{
    public static void main(String[] args) 
    {
        A1 obj=new A3();

        obj.print();
        ((A2)obj).show();

    }
}
