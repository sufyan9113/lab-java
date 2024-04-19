package Practice.DSA;
import java.util.*;
public class BalanceParan 
{
    public static void main(String[] args) 
    {
        System.out.println("enter value of n");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String res=" ";
        print(n,0,0,res);
    }
    public static void print(int n,int ob,int cb,String s)
    {
        if(ob==n && cb==n)
        {
            System.out.print(s+" ");
            return;
        }
        
        if(ob<n)
        {
            print(n, ob+1, cb, s+"(");
        }
         if(ob>cb)
        {
            print(n, ob, cb+1, s+")");
        }

        }
    }

