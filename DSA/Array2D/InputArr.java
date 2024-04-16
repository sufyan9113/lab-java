
package DSA.Array2D;
import java.util.*;
class InputArr
{
    public static void main(String[] args)
    {
        int r=3; int c=4;
        int[][] ar=new int[r][c];
        InputArr.arraInput(ar,r,c);
    }

    static void arraInput(int[][] a,int r,int c)
    {
        Scanner s=new Scanner(System.in);

        for(int i=0; i<r;i++)
        {
            for(int j=0; j<c; j++)
            {
                System.out.println("enter value of : a["+i+"]["+j+"]");
                a[i][j]=s.nextInt();
            }
        }
        for(int[] m: a)
        {
            for(int n:m)
            {
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}