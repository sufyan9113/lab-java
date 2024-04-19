package DSA.Recursion;

public class BalancePara 
{
    public static void main(String[] args) 
    {
        int n=3;
        String s=" ";
        print(n,0,0,s);
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
