package Practice.DSA;
import java.util.*;
public class Multiplier 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter value of n");
        int n=s.nextInt();
        System.out.println("enter value of k");
        int k=s.nextInt();
        multi(n,k);
    }
    public static void multi(int n,int k)
    {
        if(k==1)
        {
            System.out.print(n+" ");
            return;
        }
        multi(n, k-1);
        System.out.print(n*k+" ");

    }
}
