package DSA.Array2D;

import java.util.*;

public class PerfixSumOpti 
{
    public static void main(String[] args)
    {
        int n,m;
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

        for(int i=1; i<n; i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=a[i][j]+ a[i-1][j];
            }
        }

        for(var mar: a)
        {
            System.out.println(Arrays.toString(mar));
        }
        System.out.println();
        prefixSumArr(a,r1,c1,r2,c2);
        
    }

    public static void prefixSumArr(int[][]a,int r1,int c1,int r2,int c2)
    {
        int total,up,left,lower,repreat_region,result;

        total=a[r2][c2];
        up=a[r1-1][c2];
        

       

        result=total-up;
        System.out.println(result);
    }

    
        
    }

