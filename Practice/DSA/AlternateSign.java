package Practice.DSA;

import java.util.*;
public class AlternateSign 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter num of terms");
        int n=s.nextInt();
        int result=alterSign(n);
        System.out.println(result);
    }
    public static int alterSign(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else if(n%2==0)
        {
            return alterSign(n-1)-n;
        }
        else
        {
            return alterSign(n-1)+n;
        }

        
    }
}
