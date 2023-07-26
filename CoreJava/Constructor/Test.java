package Constructor;

public class Test 
{
    public static void main(String[] args) 
    {   
        Demo d1= new Demo();
        d1.disp();
        Demo d2=new Demo(10,20);
        d2.disp();

    }
    
}

class Demo
{
    private int a;
    private int b;

   /* Demo()
    {          defualt constructor by compiler with zero parameters

    }
*/
    Demo()
    {
        System.out.println("constructior by programmer with zero argumnets");
    }

    
    Demo(int a, int b)
    {
        this. a= a;
        this. b= b;
    }
    void disp()
    {
        System.out.println(a);
        System.out.println(b);

    }

}
