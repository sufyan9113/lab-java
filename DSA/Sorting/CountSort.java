package DSA.Sorting;

import java.util.Arrays;



public class CountSort 
{
    public static void main(String[] args) 
    {
        int[] a={4,3,1,5,3,1,3,5,3,48,4,4,89,8};
        int max=max(a);
        freq(a,max);
        
        disp(a);
       
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
    public static void freq(int[]a,int max)
    {
        int[]f=new int[max+1];
        for(int i=0; i<a.length; i++)
        {
            f[a[i]]++;
        }

        result(f,a);
    }

    public static void result(int[]f,int[]a)
    {
        int k=0;
        for(int i=0; i<f.length; i++)
        {
            for(int j=0; j<f[i]; j++)
            {
                a[k++]=i;
            }
        }
    }
    public static void disp(int[]a)
    {
        System.out.println(Arrays.toString(a));
    }
}
