package DSA.Recursion;

import java.util.*;

class Factorial 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter num to find factorial");
        int n=s.nextInt();
        long res=factorial(n);
        System.out.println("factorial of "+n+ " is: "+res);
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
        return  result;
    }

}
