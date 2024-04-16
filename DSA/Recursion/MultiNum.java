package DSA.Recursion;
import java.util.*;
public class MultiNum 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter value of n and k");
        int n=s.nextInt();
        int k=s.nextInt();
        multi(n,k);
        
    }
    public static void multi(int n,int k)
    {
        int result=0;
        
        if(k==1)
        {
            System.out.print(n+" ");    
        
        }
        else
        {
            multi(n, k-1);
            System.out.print(n*k+" ");
          
        }
    }
}
