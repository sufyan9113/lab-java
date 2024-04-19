package Practice.DSA;
import java.util.*;



public class SqRt 
{
    public static void main(String[] args) 
    {
        System.out.println("enter number to find square root");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int result=sqRt(n);
        System.out.println(result);
    }
    public static int sqRt(int n)
    {
        int high=n; int low=0; int result=-1;

        while(low<=high)
        {
            int mid=(low+high)/2;
            int val=mid*mid;
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
