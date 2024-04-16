package DSA.Searching;
import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class BinarySearch 
{
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) 
    {
        int[] a=userInput();
        int result=binearSearch(a);

        if(result==0)
        {
            System.out.println("element not found");
        }
        else
        {
            System.out.println("element found at index "+result);
        }
        
    }

    public static int[] userInput()
    {
        System.out.println("enter size of array");
        int n=s.nextInt();
        int[]a=new int[n];
        System.out.println("enter array elements");

        for(int i=0; i<n; i++)
        {
            a[i]=s.nextInt();
        }
        return a;
    }

    public static int binearSearch(int[] a)
    {
        int n=a.length;
        int index=-1;
        System.out.println("enter element to find");
        int x=s.nextInt();
        
        int low=0; int high=n-1;

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
}
