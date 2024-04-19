package Practice.DSA;
import java.util.Arrays;

class TestMaze
{
    public static void main(String[] args) 
    {
        int[][]in={{1,0,1,0},{1,0,1,1},{1,1,1,1},{0,1,1,1}};
        

        print(in, 0, 0, 3, 3,"");
    }
    public static void print(int[][]in,int sr,int sc,int er,int ec,String s)
    {
        if(sr>er || sc>ec)return;
        if(sr<0 || sc<0)return;
        if(in[sr][sc]==-1)return;
        if(in[sr][sc]==0)return;
        if(sr==er && sc==ec)
        {
            System.out.println(s);
            return;   
        }
        
        in[sr][sc]=-1;
        print(in, sr, sc+1, er, ec, s+"R");
        print(in, sr+1, sc, er, ec, s+"D");
        print(in, sr, sc-1, er, ec, s+"L");
        print(in, sr-1, sc, er, ec, s+"U");

        in[sr][sc]=1;

    }
}