package Practice.DSA;
public class TestNqueen
{
    public static void main(String[] args) 
    {
        int n=8;
        char[][]brd =new char[n][n];

        for(int i=0; i<n ;i++)
        {
            for(int j=0; j<n; j++)
            {
                brd[i][j]='X';
            }
        }

        printBrd(brd,0);

    }
    public static void printBrd(char[][]brd,int row)
    {
        int n=brd.length;

        if(row==n)
        {
            for(int i=0; i<n ;i++)
            {
                for(int j=0; j<n; j++)
                {
                    System.out.print(brd[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for(int j=0; j<n; j++)
        {
            if(isSafe(brd,row,j))
            {
                brd[row][j]='Q';
                printBrd(brd, row+1);
                brd[row][j]='X';

            }
        }
    }
    public static boolean isSafe(char[][]brd,int row,int col)
    {
        int n=brd.length;

        for(int i=0; i<n; i++)
        {
            if(brd[i][col]=='Q') return false;
        }
        for(int j=0; j<n; j++)
        {
            if(brd[row][j]=='Q') return false;
        }
        int i,j;

        i=row; j=col;

        while(i>=0 && j<n ){
        if(brd[i][j]=='Q')return false;
        i--;
        j++;
        }

        i=row; j=col;
        while(i<n && j<n)
        {
        if(brd[i][j]=='Q')return false;
        i++;
        j++;
        }

        i=row; j=col;
        while(i<n && j>=0)
        {
        if(brd[i][j]=='Q')return false;
        i++;
        j--;
        }

        i=row; j=col;
        while(i>=0 && j>=0)
        {
        if(brd[i][j]=='Q')return false;
        i--;
        j--;
        }


        return true;
    }
}
