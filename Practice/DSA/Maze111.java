package Practice.DSA;
public class Maze111 
{
    public static void main(String[] args) 
    {
        int[][]maze={{1,0,1,1},{1,1,1,1},{0,1,1,0},{0,1,1,1}};
        int n=maze.length;
        boolean[][]flag=new boolean[n][n];
        printP(maze,flag,0,0,3,3,"");
    }

    public static void printP(int[][]maze,boolean[][]flag,int sr,int sc,int er,int ec,String s)
    {
        if(sr>er || sc>ec ) return;
        if(sr<0 || sc<0) return;
        if(maze[sr][sc]==0) return;
        if(flag[sr][sc]==true) return;

        if(sr==er && sc==ec)
        {
            System.out.println(s);
            return;
        }
            flag[sr][sc]=true;
            printP(maze, flag, sr, sc+1, er, ec, s+"R");
            printP(maze, flag, sr+1, sc, er, ec, s+"D");
            printP(maze, flag, sr, sc-1, er, ec, s+"L");
            printP(maze, flag, sr-1, sc, er, ec, s+"U");
            flag[sr][sc]=false;
        
    }

  
}
