package DSA.Recursion;
import java.util.*;
public class SumOfDigit 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        int n=s.nextInt();
        int result=sumOfDigit(n);
        System.out.println(result);
    }  
    public static int sumOfDigit(int n)
    {
        
        if(n==0)
        {
            return 0;
        }
        else
        {
           return (n%10)+sumOfDigit(n/10);
        }
         
    } 
}
