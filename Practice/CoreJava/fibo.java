package Practice.CoreJava;
import java.util.*;

class Fibonachhi
{
    public int calFibo(int n)
    {
        
        int a=0;
        int b=1;
        int c=0;
        if(n==0|| n==1)
        {
            return 1;
        }
        else{
            for(int i=2; i<=n; i++)
            {
                c=a+b;
                a=b;
                b=c;
            }
        }

        return c;
    
}
}
public class fibo 

{
    public static void main(String[] args) 
    {
        int n,result;
        System.out.println("enter nth term of fibo");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();

        Fibonachhi f= new Fibonachhi();
        result=f.calFibo(n);
        System.out.println("fibo of "+ n+"th term is= "+result);



    }
    
}
