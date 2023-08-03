package DSA.Recursion;

import java.util.*;



public class Searching2DArr 
{
    public static void main(String[] args) 
    {
        int[][]a={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        int x=s.nextInt();
        boolean result=search(a,x);
        System.out.println(result);

    }
    public static boolean search(int[][]a,int x)
    {
        boolean result=false;
        int m=a.length;
        int n=a[0].length;
        int low=0; int high=m*n-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(a[mid/n][mid%n]==x)
            {
                return true;
            }
            else if(a[mid/n][mid%n]<x)
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
