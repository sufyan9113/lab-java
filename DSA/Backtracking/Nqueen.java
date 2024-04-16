package DSA.Backtracking;

public class Nqueen 
{
    public static void main(String[] args) 
    {
        int n=4;
        char[][]board=new char[n][n];

        for(int i=0; i<n; i++)
        {
           for(int j=0; j<n; j++)
           {
                board[i][j]='X';
           }
        }

        nqueen(board,0);
    }
    public static void print(char[][]board)
    {
        for(char[]c:board)
        {
            for(char i:c)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void nqueen(char[][]board,int row)
    {
        int n=board.length;
        if(row==n)
        {
            print(board);
            return;
        }
        
        for(int j=0; j<n;j++)
        {
            if(isSafe(board,row,j))
            {
                board[row][j]='Q';
                nqueen(board,row+1);
                board[row][j]='X';
                
            }
        }
    }

    public static boolean isSafe(char[][]board,int row,int col)
    {
        int n=board.length;

        for(int j=0; j<n; j++) //row check E to W
        {
            if(board[row][j]=='Q')
            return false;
        }

        for(int i=0; i<n; i++) //col check N to S
        {
            if(board[i][col]=='Q')
            return false;
        }
        

        int i=row; int j=col;
        while(i>=0 && j<n)         // NE check
        {
            if(board[i][j]=='Q')
            {
            return false;
            }
            i--;
            j++;
        }

         i=row; 
         j=col;
        while(i<n && j<n)         // SE check
        {
            if(board[i][j]=='Q')
            {
            return false;
            }
            i++;
            j++;
        }
        i=row; 
        j=col;
        while(i<n && j>=0)         // SW check
        {
            if(board[i][j]=='Q')
            {
            return false;
            }
            i++;
            j--;
        }
        i=row; 
        j=col;
        while(i>=0 && j>=0)         // NW check
        {
            if(board[i][j]=='Q')
            {
            return false;
            }
            i--;
            j--;
        }
        return true;
    }
}
