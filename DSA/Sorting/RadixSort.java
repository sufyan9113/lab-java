package DSA.Sorting;

import java.util.Arrays;

public class RadixSort 
{
    public static void main(String[] args) 
    {
        int[]a={170,45,75,90,802,2};
        radixSort(a);
        System.out.println(Arrays.toString(a));
    }  
    public static void radixSort(int[]a)
    {
        int max=max(a);

        for(int place=1; (max/place)>0; place*=10)
        {
            countSort(a,place);
        }
    }

   
    public static void countSort(int[]a,int place)
    {
      //  int max=max(a);
        int[]f=new int[10];
        for(int i=0; i<a.length; i++)
        {
            f[(a[i]/place)%10]++;
        }
        for(int i=1; i<f.length; i++)
        {
            f[i]=f[i]+f[i-1];
        }
      
        int[]o=new int[a.length];

        for(int i=a.length-1; i>=0; i--)
        {
            int ind=f[(a[i]/place)%10]-1;
            o[ind]=a[i];
            f[(a[i]/place)%10]--;
        }
        copyArray(o,a);
       
    }
    public static void copyArray(int[]o,int[]a)
    {
        for(int i=0; i<a.length ;i++)
        {
           a[i]=o[i];
        }
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
