package DSA.Array2D;

import java.util.*;
public class PrefixApp3 
{
    public static void main(String[] args)
    {
        int n,m,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("emter raw and colom");
        n=s.nextInt();
        m=s.nextInt();
        int[][] a=new int[n][m];

        System.out.println("enter "+n*m+" elements");
        for(int i=0; i<n;i++)
        {
            for(int j=0; j<m; j++)
            {
                a[i][j]=s.nextInt();
            }
            System.out.println();
        }
        
        

        int r1,c1,r2,c2;

       

        System.out.println("enter coordinate of r1");
        r1=s.nextInt();
        System.out.println("enter coordinate of c1");
        c1=s.nextInt();
        System.out.println("enter coordinate of r2");
        r2=s.nextInt();
        System.out.println("enter coordinate of c2");
        c2=s.nextInt();
        

        for(int j=1; j<n; j++ )
        {
            for(int i=0; i<n; i++)
            {
                a[i][j]=a[i][j]+ a[i][j-1];
            }
        }
        for(var mar: a)
        {
            System.out.println(Arrays.toString(mar));
        }
        System.out.println();

       

        for(var mar: a)
        {
            System.out.println(Arrays.toString(mar));
        }
        System.out.println();
        
        for(int i=r1; i<=r2; i++)
        {
            sum+=a[i][c2]-a[i][c1-1];
        }
        
        System.out.println(sum);
    }

   
}
