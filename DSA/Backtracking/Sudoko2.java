package DSA.Backtracking;

public class Sudoko2 
{
    public static void main(String[] args) 
    {
        int[][]a={{3,0,6,5,0,8,4,0,0},
                  {5,2,0,0,0,0,0,0,0},
                  {0,8,7,0,0,0,0,3,1},
                  {0,0,3,0,1,0,0,8,0}, 
                  {9,0,0,8,6,3,0,0,5},
                  {0,5,0,0,9,0,6,0,0},
                  {1,3,0,0,0,0,2,5,0},
                  {0,0,0,0,0,0,0,7,4},
                  {0,0,5,2,0,6,3,0,0}};

                  if(solSudo(a))
                  {
                    printRes(a);
                  }
                  else
                  {
                    System.out.println("result not available");
                  }


        
    } 
    public static boolean solSudo(int[][]a)
    {
        int n=a.length;
        int row=-1; int col=-1;
        boolean isEmpty=true;

        for(int i=0; i<n;i++)
        {
            for(int j=0; j<n ;j++)
            {
                if(a[i][j]==0)
                {
                    row=i;
                    col=j;

                    isEmpty=false;

                    break;
                }

            }
            if(!isEmpty)
            {
                break;
            }
        }
            if(isEmpty)
            {
                return true;
            }

            for(int num=1; num<=9;num++)
            {

            if(Safe(a, row, col, num))
            {
                a[row][col] = num;

                if(solSudo(a))
                {
                return true;
                }
            else
            {
                a[row][col]=0;
            }
        }
          
    }
        return false;
    }
    public static boolean Safe(int[][]a,int row,int col, int num)
    {
        int n=a.length;

        for(int i=0 ;i<n ; i++)
        {
            if(a[i][col]==num)return false;
        }
        for(int j=0 ;j<n ; j++)
        {
            if(a[row][j]==num)return false;
        }
        int sqrt=(int) Math.sqrt(n);

        int sR= row-row%sqrt;
        int sC= col-col%sqrt;

        for(int i=sR; i<sR+sqrt; i++)
        {
            for(int j=sC; j<sC+sqrt; j++)
            {
                if(a[i][j]==num) return false;
            }
        }
        return true;

    }

    public static void printRes(int[][]a)
    {
        int n=a.length;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

}
