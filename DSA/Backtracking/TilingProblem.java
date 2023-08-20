package DSA.Backtracking;
import java.util.*;
public class TilingProblem 
{
    public static void main(String[] args) 
    {
      
        System.out.println("for n=1, total ways= "+getWays(1));
        System.out.println("for n=2, total ways= "+getWays(2));
        System.out.println("for n=3, total ways= "+getWays(3));
        System.out.println("for n=4, total ways= "+getWays(4));
        System.out.println("for n=5, total ways= "+getWays(5));
        System.out.println("for n=6, total ways= "+getWays(6));
    }
    public static int getWays(int n)
    {
        if(n<=3)
        {
            return n;
        }
        return getWays(n-1)+getWays(n-2);
    }
    
}
