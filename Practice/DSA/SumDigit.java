package Practice.DSA;

import java.util.*;
public class SumDigit 
{
    public static void main(String[] args) 
    {
        System.out.println("enter num");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int result=sumDigit(n);
        System.out.println(result);
    }
    public static int sumDigit(int n)
    {
        int result=0;
        if(n==0)
        {
            return 0;
        }
        else
        {
            result=(n%10)+sumDigit(n/10);
        }
        return result;
    }
}
