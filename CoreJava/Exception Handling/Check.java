class Demo
{
    int a=10;
    int b=0;
    int c;
    public void test()
    {
    try 
    {
        c=a/b;
    } 
    catch (Exception e) 
    {
       System.out.println("enter valid number");
       throw e;
    }
    System.out.println("operation completed");
}

}

public class Check 
{
    public static void main(String[] args) 
    {
        Demo5 d= new Demo5();
        try
        {
        d.test();
        }
        catch (Exception e) 
    {
       System.out.println("enter valid number");
       
    }
    }
}
