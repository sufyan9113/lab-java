
import java.util.*;
public class ExceptionH
{
    public static void main(String[] args) 
    {
        Scanner s= new Scanner(System.in);
        int num=0;
        System.out.println("enter number");

        try
        {
            num=s.nextInt();
        }

        catch(InputMismatchException e)
        {
            System.out.println("enter valid number input mismatch");
        }
        catch(Exception e)
        {
            System.out.println("enter valid number "+e);
        }

         finally
        {
            s.close();
            System.out.println("in final block");
        }

        System.out.println(num);

    }
}