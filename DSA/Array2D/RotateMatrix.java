package DSA.Array2D;
import java.util.*;

public class RotateMatrix 
{
    public static void main(String[] args) 
    {
        
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        int n=a.length;
        int m=a[0].length;

        for(int i=0; i<n; i++)
        {
            for(int j=i; j<m; j++)
            {
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }

        for(int i=0; i<m; i++)
        {
            int li=0;
            int ri=m-1;

            while(li<ri)
            {
                int temp=a[i][li];
                a[i][li]=a[i][ri];
                a[i][ri]=temp;
                li++;
                ri--;
            }
        }
        
        for(var ele: a)
        {
            System.out.println(Arrays.toString(ele));
        }
        
    }
}

/*
 * import java.util.*;
public class Rotation
{
    
    public static void main(String[] args) 
    {
         
       int[][] a= userInput();
       System.out.println("user input array");
       printarr(a);
       int[][] transArray=transposeArray(a);
       System.out.println("transpose array");
       printarr(transArray);
       int[][] resArray=colSwap(transArray);
       System.out.println("final result");
       printarr(resArray);
    }

    public static int[][] userInput()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("ente size of row");
        int m=s.nextInt();
        System.out.println("ente size of column");
        int n=s.nextInt();
        int[][] a=new int[n][m];

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                System.out.println("enter value of a["+i+"]["+j+"]");
                a[i][j]=s.nextInt();
            }
        }
            return a;
    }

    public static int[][] transposeArray(int[][] a)
    {
        int n=a.length;
        int m=a[0].length;
        
        for(int i=0; i<n; i++)
        {
            for(int j=i; j<m; j++)
            {
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        return a;
    }

    public static int[][] colSwap(int[][]a)
    {
        int n=a.length;
        int m=a[0].length;

        for(int i=0; i<n; i++)
        {
            int li=0;
            int ri=n-1;
            while(li<ri)
            {
                int temp=a[i][li];
                a[i][li]=a[i][ri];
                a[i][ri]=temp;
                li++;
                ri--;
            }
        }
        return a;
    }

    public static void printarr(int[][]a)
    {
        for(var ele:a)
        {
            System.out.println(Arrays.toString(ele));
        }
    }
}

 */
