
class Method
{
    int a,b,c,d,result1,result2;
    public void a() throws Exception
    {
        
       try 
        {
            b();
        }
        
        catch(Exception e)
        {
            
            System.out.println("something went wrong in a method");
           
        }
        
    }
    public void b() throws Exception
    {
        a=10;
        b=0;
        try
        {
        result1= a/b;
        }
        catch(Exception e)
        {
            System.out.println("something went wrong in b method");
           
        }
        
 
    }
    
}


public class Ducking 
{
    public static void main(String[] args) 
    {
        Method m= new Method();

        try
        {
        m.a();
        }
         catch(Exception e)
        {
            System.out.println("something went wrong in main method");
            
        }
        
    }

}
