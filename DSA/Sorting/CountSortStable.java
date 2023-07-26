package DSA.Sorting;

import java.util.Arrays;

public class CountSortStable 
{
    public static void main(String[] args) 
    {
        int[]a={4,3,1,5,3,1,3,5};
        int max=max(a);
        freq(a,max);
        


    }
    public static void freq(int[]a,int max)
    {
        int[] f=new int[max+1];
        for(int  i=0; i<a.length;i++)
        {
            f[a[i]]++;
        }

        //prefix sum of freq array

        for(int i=1; i<f.length; i++)
        {
            f[i]+=f[i-1];
        }
        System.out.println(Arrays.toString(f));
        output(f, a);


    }

    public static void output(int[]f,int[]a)
    {
        int[]output=new int[a.length];

        for(int i=a.length-1; i>=0; i--)
        {
            int ind=f[a[i]]-1;
            output[ind]=a[i];
            f[a[i]]--;
        }
        
        System.out.println(Arrays.toString(output));
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

