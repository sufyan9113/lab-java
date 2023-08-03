package DSA.Recursion;
import java.util.*;
public class Stairs 
{
 public static void main(String[] args) 
 {
    Scanner s=new Scanner(System.in);
    System.out.println("enter no of stairs");
    int n=s.nextInt();
    int result=countWays(n+1);
    System.out.println("no of ways: "+result);
 }
 public static int countWays(int n)
 {
    int result=0;
    if(n<=1)
    {
        return n;
    }
    else
    {
        result=countWays(n-1)+countWays(n-2);
    }
    
    return result;
    
 }   
}
