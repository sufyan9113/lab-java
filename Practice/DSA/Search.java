package Practice.DSA;
import java.util.*;

public class Search
{
    public static void main(String[] args) 
    {

        System.out.println("enter array size");
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int[]a =new int[n];
        System.out.println("eneter array elements");
        for(int i=0; i<n; i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("enter element to be search");
        int e=s.nextInt();
        System.out.println("linear search result");
        linearSearch(a,e);
       
        System.out.println("binary search result");
        int res=binarySearch(a,e);
        System.out.println(res);

        System.out.println("descending order array");
        int[] b={5,4,3,2,1};
        System.out.println("enter element to be search");
        int ele=s.nextInt();
        int res2=binarySearchDescend(b,ele);
        System.out.println(res2);
        
    }
    public static void linearSearch(int[] a,int x)
    {
        int n=a.length;
        int result=-1;

        for(int i=0; i<n; i++)
        {
            if(a[i]==x)
            {
                result=i;
                System.out.println(result);  
                break;
            }
        }
        if(result==-1)
        {
            System.out.println("element does not exists");
        }
    }
    public static int binarySearch(int[] a,int x)
    {
        int low=0; int high=a.length-1;
        

        while(low<=high)
        {
            int mid=(low+high)/2;
            if(a[mid]==x)
            {
                return mid;
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
        return -1;  
    }
    public static int binarySearchDescend(int[] a,int x)
    {
        int low=0; int high=a.length-1;
        

        while(low<=high)
        {
            int mid=(low+high)/2;
            if(a[mid]==x)
            {
                return mid;
            }
            else if(a[mid]>x)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return -1;  
    }
}
