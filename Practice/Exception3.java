
import java.util.*;
public class Exception3

{
    public static void main(String[] args) 
    {
        int n=0;
        
        System.out.println("enter number");

        try(Scanner s=new Scanner(System.in);)
        {
            n=s.nextInt();
            
        }
        try
        {

        }

        catch(Exception e)
        {
            System.out.println("enter numbers only"+e);
            
        }
        /*finally
        {
            s.close();
            System.out.println("in finally block");
        }
*/
        System.out.println(n);


    }
}