package Practice.DSA;
public class NQueen 
{
    public static void main(String[] args) 
    {
        int n=4;
        char[][]brd=new char[n][n];

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                brd[i][j]='X';
            }
        }
        queen(brd,0);
    }
    public static void queen(char[][]brd,int row)
    {
        int n=brd.length;

        if(row==n)
        {
            for(int i=0; i<n;i++)
            {
                for(int j=0; j<n;j++)
                {
                    System.out.print(brd[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for(int j=0; j<n;j++)
        {
            if(isSafe(brd,row,j))
            {
            brd[row][j]='Q';
            queen(brd, row+1);
            brd[row][j]='X';

            }
        }
    }

    public static boolean isSafe(char[][]brd,int row,int col)
    {
        int n=brd.length;

        for(int i=0; i<n; i++ )           // ns check row
        {
            if(brd[i][col]=='Q') return false;
        }

        for(int j=0; j<n; j++ )           // ew check col
        {
            if(brd[row][j]=='Q') return false;
        }

        int i=row; int j=col;
        while(i>=0 && j<n)         // ne check
        {
            if(brd[i][j]=='Q') return false;
            i--;
            j++;
        }

         i=row;  j=col;
        while(i<n && j<n)         // se check
        {
            if(brd[i][j]=='Q') return false;
            i++;
            j++;
        }

        i=row;  j=col;
        while(i<n && j>=0)         // sw check
        {
            if(brd[i][j]=='Q') return false;
            i++;
            j--;
        }
        i=row;  j=col;
        while(i>=0 && j>=0)         // nw check
        {
            if(brd[i][j]=='Q') return false;
            i--;
            j--;
        }

        return true;
    }
}
