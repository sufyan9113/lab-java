package Practice.DSA;
import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class LowerBound 
{
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println("enter array size");
        int n=s.nextInt();
        int[] a=new int[n];
        System.out.println("enter array elements");
        for(int i=0; i<n; i++)
        {
            a[i]=s.nextInt();
        }

        int r2=lowerSearch(a);
        System.out.println(r2);
    } 

    public static int lowerSearch(int[]a)
    {
        System.out.println("enter element to be searched");
        int x=s.nextInt();
        int low=0; int high=a.length-1;
        int result=-1;

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(a[mid]==x)
            {
                result=mid;
                high=mid-1;
            }
            else if(a[mid]<x)
            {
                low=mid+1;
            }
            else
            {
                high=mid+1;
            }
        }
        return result;
        
    }
}
