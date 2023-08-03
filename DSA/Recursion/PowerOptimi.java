package DSA.Recursion;
import java.util.*;


public class PowerOptimi 
{
   public static void main(String[] args) 
   {
    Scanner s=new Scanner(System.in);
    System.out.println("enter base num");
    int a=s.nextInt();
    System.out.println("enter power num");
    int b=s.nextInt();
    long result=power(a,b);
    System.out.println("result: "+result);
   }
   public static long power(int a,int b)
   {
        long result=0; int mid=0; long finalResult=0;

        if(b==1)
        {
            return a;
        }
        else
        
        {
            mid=b/2;
            result=power(a, mid);
            finalResult=result*result;
            if(b%2!=0)
            {
                return a*finalResult;
            }
            
            else
            {
                return finalResult;
            }
        }
       
   }
}

