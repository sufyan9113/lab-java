package Practice.DSA;
import java.util.*;
public class Power 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter num value of a and b");
        int a=s.nextInt();
        int b=s.nextInt();
        long result=power(a,b);
        long result2=optiPower(a,b);
        System.out.println(result);
        System.out.println(result2);
    }
    public static long optiPower(int a,int b)
    {
        long result=0;
        long finalResult=0;

        if(b==1)
        {
            return a;
        }
        else
        {
            int mid=b/2;
            result=optiPower(a, mid);
            finalResult=result*result;
        }
        if(b%2!=0)
        {
            return a*finalResult;
        }
        else
        {
            return finalResult;
        }
        
    }
    public static long power(int a, int b)
    {
        long result=0;
        if(b==1)
        {
            return a;
        }
        else
        {
            result=a*power(a,b-1);
        }
        return result;
    }
}
