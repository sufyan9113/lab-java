package DSA.Backtracking;

public class RateInMaze1 
{
    public static void main(String[] args) 
    {
        int r=3;
        int c=3;
        int ways=countWays(0,0,r-1,c-1);
        System.out.println(ways);
    } 
    public static int countWays(int cr,int cc,int dr,int dc)
    {
        if(cr>dr|| cc>dc) return 0;
        if(cr==dr&& cc==dc) return 1;

        int rightWays=countWays(cr, cc+1, dr, dc);
        int downWays=countWays(cr+1, cc, dr, dc);
        int ways=rightWays+downWays;
        return ways;
    }
}
