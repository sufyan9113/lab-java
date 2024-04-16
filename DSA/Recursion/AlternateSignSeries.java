package DSA.Recursion;
import java.util.*;

public class AlternateSignSeries 
{
    public static void main(String[] args)
{
    System.out.println("enter num of alternate sign series");
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int result=alternateSeries(n);
    System.out.println(result);
}
    public static int alternateSeries(int n)
    {
        int result=0;
        if(n==0)
        {
            return 0;
        }
        else if(n%2==0)
        {
           result=  alternateSeries(n-1)-n;
        }
        else
        {
            result= alternateSeries(n-1)+n;
        }
        return result;
      
    }
}
