package Practice.DSA;
import java.util.*;

public class PrefixSum 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter row and coloumn");
        int n=s.nextInt();
        int m=s.nextInt();

        int[][] a=new int[n][m];
        System.out.println("enter "+n*m+" element for array");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                a[i][j]=s.nextInt();
            }
        }

        for(int j=1; j<m; j++)
        {
            for(int i=0; i<n; i++)
            {
                a[i][j]=a[i][j-i];
            }
        }

        for(var ele:a)
        {
            System.out.println(Arrays.toString(ele));
        }

        for(int i=1; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                a[i][j]=a[i-1][j];
            }
        }

        for(var ele:a)
        {
            System.out.println(Arrays.toString(ele));
        }


        System.out.println("enter coordinate of r1");
        int r1=s.nextInt();
        System.out.println("enter coordinate of c1");
        int c1=s.nextInt();
        System.out.println("enter coordinate of r2");
        int r2=s.nextInt();
        System.out.println("enter coordinate of c2");
        int c2=s.nextInt();


        int total,up,left,repeat1,result;

        total=a[r2][c2];
        left=a[r2][c1-1];
        up=a[r1][c2];
        repeat1=[r1][c-1];

        
        


    }
}

