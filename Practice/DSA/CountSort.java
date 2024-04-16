package Practice.DSA;
import java.util.Arrays;

public class CountSort 
{
    public static void main(String[] args) 
    {
        int[]a={5,3,1,2,1,3,5,6};
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

        
        int k=0;

        for(int i=0; i<f.length; i++)
        {
            for(int j=0; j<f[i];j++)
            {
                a[k]=i;
                k++;

            }
        }
        System.out.println(Arrays.toString(a));
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
