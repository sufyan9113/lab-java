package Practice.DSA;
import java.math.*;
import java.util.*;

public class Power2 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter value of a and b");
        BigInteger a=s.nextBigInteger();
        int b=s.nextInt();
        BigInteger result=power(a,b);
        System.out.println(result);
    }
    
    public static BigInteger power(BigInteger a,int b)
    {
        BigInteger result,finalResult;

        if(b==1)
        {
            return a;
        }
        else
        {
            result=power(a, b/2);
            finalResult=result.multiply(result);
            if(b%2==0)
            {
                return finalResult;
            }
            else
            {
                return a.multiply(finalResult);
            }
        }

    }
    
}
