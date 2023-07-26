package Interface;

interface A
{
    int num=10;
    void show();

    default void print()
    {
        System.out.println("in default method");
    }

    public static void config(){
        System.out.println("in static method");
    }
}

class B implements A
{
    public void show()
    {
        System.out.println("in show");
    }
}
public class Demo1 
{
    public static void main(String[] args) 
    {
        System.out.println(A.num);

        A obj=new B();
        obj.show();
        obj.print();
        A.config();
        
    }
}
