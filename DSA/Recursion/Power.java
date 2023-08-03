package DSA.Recursion;
import java.util.*;
public class Power 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter base num");
        int a=s.nextInt();
        System.out.println("enter power num");
        int b=s.nextInt();
        int result=power(a,b);
        System.out.println("result: "+result);
    }
    public static int power(int a,int b)
    {
        int result=0;
        if(b==1)
        {
            return a;
        }
        else
        {
            result=a*power(a, b-1);
        }
        return result;
    }
}
