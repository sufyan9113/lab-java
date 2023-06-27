package Practice.CoreJava;


public class Exception1
{
    public static void main(String[] args) 
    {
        int a=20;
        int b=10;
        int result=0;
        int[] ar={10,20,30};

        try
        {
         result=a/b;
         System.out.println(ar[3]);

        }
      

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("something is wrong in index exception "+e);
        }
        catch(Exception e)
        {
            System.out.println("something is wrong");
        }
        
        finally
        {
            System.out.println("in final block");
        }
        
        

        System.out.println("the division is "+ result);

    }
}