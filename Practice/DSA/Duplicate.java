package Practice.DSA;
import java.util.Arrays;
import java.io.*;
class Duplicate 
{

    public static int[] arrayReverse(int[] a,int n)
    {
        for(int i=0; i<n/2; i++)
        {
            int temp=a[i];
            a[i]=a[n-1-i];
            a[n-1-i]=temp;
        }
        return a;
    }

    public static void main(String[] args) 
    {
        int[] a={1,2,3,4,5};

        int n=a.length;

        int[] revArr=arrayReverse(a,n);

        for(int ele:revArr)
        {
            System.out.print(ele+" ");
        }
        System.out.println();



        
    }
}
