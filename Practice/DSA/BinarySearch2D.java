package Practice.DSA;
import java.util.*;
public class BinarySearch2D 
{
    public static void main(String[] args) 
    {
        int[][]a={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println("enter target");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        boolean result=binary(a,x);
        System.out.println(result);
    }
    public static boolean binary(int[][]a,int x)
    {
        int m=a.length;
        int n=a[0].length;
        int low=0;
        int high=m*n-1;

        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int midEle=a[mid/n][mid%n];
            if(midEle==x)
            {
                return true;
            }
            else if(midEle<x)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return false;
    }
}
