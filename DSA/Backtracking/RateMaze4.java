package DSA.Backtracking;

public class RateMaze4 
{
    public static void main(String[] args) 
    {
        int[][]maze={{1,0,1,0},{1,0,1,1},{1,1,0,1},{0,1,1,0}};
        int n=maze.length;
        int[][]output=new int[n][n];

        if(solMaze(maze,output,0,0,n)==true)
        {
            print(output);
        }
        else
        {
            System.out.println("sol not avlb");
        }



    }
    public static void print(int[][]output)
    {
        for(int[]a:output)
        {
            for(int o:a)
            {
                System.out.print(o+" ");
            }
            System.out.println();
        }
    }
    
    public static boolean isSafe(int[][]maze,int i,int j,int n)
    {
        if(i>=0 && i<n && j>=0 && j<n && maze[i][j]==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean solMaze(int[][]maze,int[][]output,int i,int j,int n)
    {
        if(i==n-1 && j==n-1)
        {
            output[i][j]=1;
            return true;
        }

        if(isSafe(maze,i,j,n)==true)
        {
            if(output[i][j]==1)
            {
            return false;
            }

            output[i][j]=1;
            if(solMaze(maze, output, i+1, j, n)==true)
            {
                return true;
            }
            if( solMaze(maze, output, i, j+1, n)==true)
            {
                return true;
            }
            output[i][j]=0;
            return true;
        }
        return false;
    }
}
