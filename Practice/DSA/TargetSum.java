package Practice.DSA;
import java.util.*;



public class TargetSum 
{
    public static void main(String[] args) 
    {
        int n,target;
        Scanner s=new Scanner(System.in);

        System.out.println("enter array size");
        n=s.nextInt();

        int[] a=new int[n];
    
        System.out.println("enter "+n+" array elemets");
        
        for(int i=0; i<n; i++)
        {
            a[i]=s.nextInt();
        }

        System.out.println("enter target sum");
        target=s.nextInt();

        int ans=targetSum(a,target);
        System.out.println(ans);
    }

    static int targetSum(int[] a,int x)
    {
        int sum=0;
        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
                for(int k=j+1; k<a.length; k++)
                {
                    if(x==a[i]+a[j]+a[k])
                    {
                        sum++;
                    }
                }
            }
        }
        return sum;
    }
    /* 
    static int targetSum(int[] b, int x)
    {
        int count=0;
        for(int i=0; i<b.length; i++)
        {
            for(int j=i+1; j<b.length; j++)
            {
                if(x==b[i]+b[j])
                {
                    count++;
                }
            }
        }
        return count;
       
    }
    */
}
