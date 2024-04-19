package DSA.Backtracking;

import java.util.Arrays;
public class RateMazePrac 
{
    public static void main(String[] args) 
    {
        int[][]maze={{1,0,1,0},{1,0,1,1},{1,1,1,1},{0,1,1,0}};
        int n=maze.length;
        int[][]output=new int[n][n];
        print(maze, 0, 0, n, output);
    }  
    public static void print(int[][] maze,int i,int j,int n,int[][]output)
    {
        if(i==n-1 && j==n-1)
        {
            output[i][j]=1;
            for(int[]a:output)
            {
            System.out.println(Arrays.toString(a));
            
            }
            System.out.println();
            
            return;
        }
        if(i<0 || i>=n || j<0 || j>=n || maze[i][j]==0 || output[i][j]==1)return;

        output[i][j]=1;
        print(maze, i+1, j, n, output);
        print(maze, i, j+1, n, output);
        print(maze, i-1, j, n, output);
        print(maze, i, j-1, n, output);
        output[i][j]=0;
        
    }
}
