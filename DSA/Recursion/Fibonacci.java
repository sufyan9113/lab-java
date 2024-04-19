package DSA.Recursion;
import java.util.*;
public class Fibonacci 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number to find fibo series num");
        int n=s.nextInt();
        int result=fiboFind(n);
        System.out.println("result: "+result);
    }
    public static int fiboFind(int n)
    {
        int result=0;
        if(n==0 || n==1)
        {
            return n;
        }
        else
        {
            result=fiboFind(n-1)+fiboFind(n-2);
        }
        return result;
    }
}
