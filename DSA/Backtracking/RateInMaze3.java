package DSA.Backtracking;

public class RateInMaze3 
{
    public static void main(String[] args) 
    {
        int[][]maze={{1,0,1,1},{1,1,1,1},{1,1,0,1},};
        
        printPath(0,0,2,3,maze,"");
    }
    public static void printPath(int cr,int cc,int dr,int dc,int[][]maze,String s)
    {
        if(cr>dr || cc>dc) return;
        if(cr<0 ||cc<0)return;
        if(maze[cr][cc]==0)return;
        if(maze[cr][cc]==-1)return;
        if(cr==dr && cc==dc)
        {
            System.out.println(s);
            return;
        }
        maze[cr][cc]=-1;

        printPath(cr, cc+1, dr, dc, maze,s+"R");
        printPath(cr+1, cc, dr, dc, maze,s+"D");
        printPath(cr, cc-1, dr, dc, maze,s+"L");
        printPath(cr-1, cc, dr, dc, maze,s+"U");
        
        maze[cr][cc]=1;
    }
}
