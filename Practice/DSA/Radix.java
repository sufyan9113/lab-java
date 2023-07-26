package Practice.DSA;
import java.util.Arrays;

public class Radix 
{
    public static void main(String[] args) 
    {
        int[]a={113,23,192,2,165,75,96,898,10};
        radixSort(a);
        
    }
    public static void radixSort(int[]a)
    {
        int max=max(a);

        for(int place=1; (max/place)>0; place*=10)
        {
            countSort(a,place);
        }
        System.out.println(Arrays.toString(a));
        
    }
    
    public static void countSort(int[]a,int place)
    {
        int[]f=new int[10];

        for(int i=0; i<a.length;i++)
        {
            f[(a[i]/place)%10]++;
        }

        for(int i=1; i<f.length; i++)
        {
            f[i]+=f[i-1];
        }

        int[]o=new int[a.length];

        for(int i=a.length-1; i>=0; i--)
        {
            int ind=f[(a[i]/place)%10]-1;
            o[ind]=a[i];
            f[(a[i]/place)%10]--;
        }
        copy(a,o);
    }
    public static void copy(int[]a,int[]o)
    {
        for(int i=0; i<a.length;i++)
        {
            a[i]=o[i];
        }
    }
    public static int max(int[]a)
    {
        int max=Integer.MIN_VALUE;

        for(int i=0; i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        return max;
    }
  
    
}