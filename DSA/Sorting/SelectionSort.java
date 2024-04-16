package DSA.Sorting;

import java.util.Arrays;

public class SelectionSort 
{
    public static void main(String[] args) 
    {
        int[]a ={20,50,10,15,17,60,30};
        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void selectionSort(int[]a)
    {
        int n=a.length;
        for(int i=0; i<n; i++)
        {
            boolean swap=false;
            int min_ind=i;
            for(int j=i+1; j<n; j++)
            {
                if(a[j]<a[min_ind])
                {
                    min_ind=j;
                }
            }
            if(min_ind!=i)
            {
                int temp=a[min_ind];
                a[min_ind]=a[i];
                a[i]=temp;
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
