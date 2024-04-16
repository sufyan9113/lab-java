package DSA.Searching;
import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class SquareRoot
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter num to find square root");
        int n=s.nextInt();

        int result=findSquareRoot(n);
        System.out.println(result);

    }

    public static int findSquareRoot(int n)
    {
        int low=0, high=n, result=-1;

        while(low<=high)
        {
            int mid=(low+high)/2;
            long val=mid*mid;

            if(val==n)
            {
                return mid;
            }
            else if(val>n)
            {
                high=mid-1;
               
            }
            else 
            {
                low=mid+1;
                result=mid;
            }
        }
        return result;
        
    }
}
