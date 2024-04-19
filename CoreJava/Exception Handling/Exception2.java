

public class Exception2 
{
    public static void main(String[] args) 
    {
        int a=10;
        int b=5;
        int c=0;
        int[] ar=new int[3];
        String s=null;
        int result=0;

        try
        {
            System.out.println(ar[4]);
            result= a/s.length();
            result=a/b;
            result =a/c;
           

        }

        catch(ArithmeticException e)
        {
            System.out.println("cannot divided by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(ar[ar.length-1]);
            System.out.println("array limit exceed");
        }
        catch(ExceptionH e)
        {
            System.out.println("something went wrong");
        }

        System.out.println(result);
    }
    
}
