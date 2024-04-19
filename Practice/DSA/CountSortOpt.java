package Practice.DSA;
import java.util.Arrays;

public class CountSortOpt 
{
    public static void main(String[] args) 
    {
        int[]a={8,6,1,3,6,4,3,8,5};
        int max=max(a);
        countSort(a,max);
       
    }
    public static void countSort(int[]a,int max)
    {
        int[]f=new int[max+1];

        for(int i=0; i<a.length; i++)
        {
            f[a[i]]++;
        }

        for(int i=1; i<f.length; i++)
        {
            f[i]+=f[i-1];
        }
        int[] o=new int[a.length];

        for(int i=a.length-1 ; i>=0; i--)
        {
            int ind=f[a[i]]-1;
            o[ind]=a[i];
            f[a[i]]--;
        }
        System.out.println(Arrays.toString(o));
    }
    public static int max(int[]a)
    {
        int max=Integer.MIN_VALUE;
        
        for(int i=0; i<a.length; i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        return max;
    }
    
}
