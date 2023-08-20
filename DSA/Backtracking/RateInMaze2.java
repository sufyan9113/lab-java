package DSA.Backtracking;

public class RateInMaze2 
{
    public static void main(String[] args) 
    {
        boolean[][] isVisited=new boolean[3][3];
        printWays(0, 0, 2, 2, "",isVisited);
        
    }
    public static void printWays(int cr,int cc,int dr, int dc,String s,boolean[][]isVisited)
    {
        if(cr>dr ||cc>dc) return;
        if(cr<0 || cc<0)return;
        if(isVisited[cr][cc]==true) return;
        if(cr==dr && cc==dc)
        {
            System.out.println(s);
            return;
        }
        
        isVisited[cr][cc]=true;
        printWays(cr+1, cc, dr, dc, s+"D",isVisited);
        printWays(cr, cc+1, dr, dc, s+"R",isVisited);
        printWays(cr-1, cc, dr, dc, s+"U",isVisited);
        printWays(cr, cc-1, dr, dc, s+"L",isVisited);
        isVisited[cr][cc]=false;
    }
}
