package Practice.DSA;
import java.util.*;
public class Fibonacci 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter num of fibo element");
        int n=s.nextInt();
        int result=fibonacci(n);
        System.out.println("fibonacci element: "+result);
    }   
    public static int fibonacci(int n)
    {
        int result=0;

        if(n==0|| n==1)
        {
            return n;
        }
        else
        {
           result= fibonacci(n-1)+fibonacci(n-2);
        }
        return result;

    }    
}
