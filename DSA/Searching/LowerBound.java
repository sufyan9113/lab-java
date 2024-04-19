package DSA.Searching;
import java.util.*;


public class LowerBound 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter array element");
        int n=s.nextInt();
        int[] a=new int[n];
        System.out.println("enter array elements");
        for(int i=0; i<n ;i++)
        {
            a[i]=s.nextInt();
        }

        System.out.println("enter target value");
        int x=s.nextInt();

        int result=findLowerBound(a,x);
        if(result==-1)
        {
            System.out.println("element not found");
        }
        else
        {
            System.out.println("element present at index: "+result);
        }
    }

    public static int findLowerBound(int[]a,int x)
    {
        int result=-1;
        int low=0; int high=a.length-1;

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
                high=mid-1;
            }
        }
        return result;
    }
}
