package Practice.DSA;
import java.util.*;

public class Factorial 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter num to find facto");
        int n=s.nextInt();
        long result=factorial(n);
        System.out.println("factorial :"+result);
    }
    public static long factorial(int n)
    {
        long result=0;
        if(n==0 || n==1)
        {
            return 1;
        }
        else
        {
            result=n*factorial(n-1);
        }
        return result;
    }

}
