package Practice.DSA;

public class RateMaze 
{
    public static void main(String[] args) 
    {
        int[][]maze={{1,1,0,1},{1,1,1,1},{0,1,1,1}};
       
        count(maze,0, 0, 2 ,3,"");
    }
    public static void count(int[][]maze,int sr,int sc,int er,int ec,String s)
    {
        if(sr>er || sc>ec)return ;
        if(sr<0 || sc<0)return;
        if(maze[sr][sc]==-1)return;
        if(maze[sr][sc]==0)return;
        if(sr==er && sc==ec)
        {
            System.out.println(s);
            return;
        }
        maze[sr][sc]=-1;
        count(maze,sr, sc+1, er, ec,s+"R");
        count(maze,sr+1, sc, er, ec,s+"D");
        count(maze,sr, sc-1, er, ec,s+"L");
        count(maze,sr-1, sc, er, ec,s+"U");
        maze[sr][sc]=1;
    }
}
