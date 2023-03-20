package Practice;

interface A
{
   
    public void show();

    default void disp()
    {
        System.out.println("in disp");
    }
    public static void print()
    {
        System.out.println("in print");
    }
}
interface X
{
    void config();
}

class B implements A,X
{
    public void show()
    {
        System.out.println("in show");
    }
    public void config()
    {
        System.out.println("in config");
    }
}
public class Demo 
{
    public static void main(String[] args) 
    {
        B obj=new B();
        
        obj.show();
        obj.disp();
        A.print();
        obj.config();
       
      


    }
}
