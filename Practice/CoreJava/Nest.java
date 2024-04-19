package Practice.CoreJava;


public class Nest
{
    public static void main(String[] args) 
    {
        
        try
        {
            int a=10/0;
            try
            {
                int b=10/10;
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("in try2 catch");
            }
            finally
            {
                System.out.println("in try2 finally");
            }

        }
        catch(Exception e)
        {
            System.out.println("in try1 catch");
        }
        finally
        {
            System.out.println("in try1 finally");
        }
        System.out.println("closed");
    }
}
