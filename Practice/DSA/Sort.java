package Practice;
import java.util.Arrays;

import Practice.DSA.SelectSort;

class Sort
{
    public static void main(String[] args) 
    {
        int[] a={10,50,20,25,30,15};
        int n=a.length;
        //bubbleSort(a);
       // System.out.println(Arrays.toString(a));
        //insertion(a);
        //System.out.println(Arrays.toString(a));
        selection(a);
         System.out.println(Arrays.toString(a)); 
    }
    public static void bubbleSort(int[]a)
    {
        int n=a.length;

        
        for(int i=0; i<n; i++)
        {
            boolean swap=false;
            for(int j=0; j<n-i-1; j++)
            {
                if(a[j+1]<a[j])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swap=true;
                }
            }
            if(swap==false)
            {
                break;
            }
            System.out.println(Arrays.toString(a));
        }

       

    }
    public static void insertion(int[]a)
    {
        int n=a.length;

        for(int i=1; i<n; i++)
        {
            int j=i;
            while(j>0 && a[j]<a[j-1])
            {
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j--;

            }
            System.out.println(Arrays.toString(a));
        }

        
    }
    public static void selection(int[]a)
    {
        int n=a.length;

        for(int i=0; i<n; i++)
        {
            boolean swap=false;
            int min=i;
            for(int j=i+1; j<n; j++)
            {
                if(a[min]>a[j])
                {
                    min=j;
                }
            }
            if(min!=i)
            {
                int temp=a[i];
                a[i]=a[min];
                a[min]=temp;
                swap=true;

            }
            if(swap==false)
            {
                break;
            }
            System.out.println(Arrays.toString(a));
        }
        
    }

}