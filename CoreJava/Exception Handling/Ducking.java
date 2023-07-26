
class Method
{
    int a,b,c,d,result1,result2;
    public void a() 
    {
        
           
            b();
            
        
    }
    public void b() 
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
            throw e;
           
        }
        
 
    }
    
}


public class Ducking 
{
    public static void main(String[] args) 
    {
        Method m= new Method();

        
        m.a();
    

        
       
        
    }

}
