import java.util.*;
class Test
{
    public static void main(String[] args) 
    {
        int num=0;
        
        

        try(Scanner s=new Scanner(System.in);)
        {
             num= s.nextInt();

        }
        

        catch(ArithmeticException e)
        {
            System.out.println("divide by zero exception "+e);
            
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("enter in array limit");
        }
        catch(ExceptionH e)
        {
            System.out.println("something is wrong");
        }
        finally
        {
            System.out.println("in finally block");
        }
      
        

        System.out.println(num);
        System.out.println("hello");

    }
}