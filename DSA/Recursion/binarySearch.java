package DSA.Recursion;
import java.util.*;
public class binarySearch 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int[]a={1,5,6,8,25,50,60,75};
        System.out.println("enter num");
        int n=s.nextInt();
       
        int result=binary(a,n,0,a.length-1);
        System.out.println(result);
    }
    public static int binary(int[]a,int n,int low,int high)
    {
        int result=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(a[mid]==n)
            {
                return mid;
                
            }
            else if(a[mid]<n)
            {
                return binary(a, n, mid+1, high);
            }
            else
            {
                return binary(a, n, low, mid-1);
            }
        }
        return result;
    }
}
