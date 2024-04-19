package DSA.Backtracking;

public class Sudoko 
{
    //static int f=0;
    public static void main(String[] args) 
    {
        int[][]s={{3,0,6,5,0,8,4,0,0},
                  {5,2,0,0,0,0,0,0,0},
                  {0,8,7,0,0,0,0,3,1},
                  {0,0,3,0,1,0,0,8,0}, 
                  {9,0,0,8,6,3,0,0,5},
                  {0,5,0,0,9,0,6,0,0},
                  {1,3,0,0,0,0,2,5,0},
                  {0,0,0,0,0,0,0,7,4},
                  {0,0,5,2,0,6,3,0,0}};


                  solve(s, 0, 0);

    }
    public static void solve(int[][]s,int row,int col)
    {
        int n=s.length;
        if(row==9)
        { 
           // int f=1;
            for(int i=0; i<n; i++)
            {
                for(int j=0; j<n;j++)
                {
                    System.out.print(s[i][j]+" ");
                }
                System.out.println();
            }
            return;
        }
        else if(s[row][col]!=0)
        {
            if(col!=8)
            {
                solve(s, row, col+1);
            }
            else
            {
                solve(s, row+1, 0);
            }
        }
        else
        {
           for(int i=1; i<=9 ;i++)
           {
            if(isSafe(s, row, col, i))
            {
                s[row][col]=i;

                if(col!=8)
            {
                solve(s, row, col+1);
            }
            else
            {
                solve(s, row+1, 0);
            }
          //  if(f==1) return;
            s[row][col]=0;
            }
           }
        }
    }
    public static boolean isSafe(int[][]s,int row,int col,int num)
    {
        int n=s.length;
        for(int i=0; i<n; i++) // row check 
        {
            if(s[i][col]==num) return false;
        }
        for(int j=0; j<n; j++) // col check
        {
            if(s[row][j]==num) return false;
        }
        int sRow=row/3*3;
        int sCol=col/3*3;

        for(int i=sRow; i<sRow+3 ;i++)
        {
            for(int j=sCol; j<sCol+3 ;j++)
            {
                if(s[i][j]==num)return false;
            }
        }
        return true;
    }
}
