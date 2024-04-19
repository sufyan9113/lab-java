package Practice.DSA;
import java.util.Arrays;

public class SecondMax 
{
    public static void main(String[] args) 
    {
    int[]a={1,2,3,4,5};
    int j=a.length-1;
    int i=0;
    int n=2;
    

    while(n>0)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        i++;
        j--;
        n--;

        
    }
    for(var ele:a)
    {
        System.out.print(ele+" ");
    }
    System.out.println();
    
    }
        
}

    /*
    for(int i=0; i<n; i++)
    {
        b[i]=a[n-1-i];
    }
    for(var ele:b)
    {
        System.out.print(ele+" ");
    }
    System.out.println();
    
        
    }
}
    /*   
    public static void main(String[] args) 
    {
        int a=5,b=6;
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(a+" "+b);
    }
/* 
        int[][] a={{1,2,3,1},{2,1,3,1},{3,1,2,3},{1,1,2,3}};
        prefixSumRow(a);
        print(a);
        prefixSumCol(a);
        print(a);
       
        int result=finalSum(a);
        System.out.println(result);
        

    }
    static void prefixSumRow(int[][]a)
    {
        int n=a.length;
        int m=a[0].length;

        for(int j=1; j<m; j++)
        {
            for(int i=0; i<n; i++)
            {
                a[i][j]+=a[i][j-1];
            }
        }
    }

    static void prefixSumCol(int[][]a)
    {
        int n=a.length;
        int m=a[0].length;

        for(int i=1; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                a[i][j]+=a[i-1][j];
            }
        }
        
    }

    static int finalSum(int[][]a)
    {
        int r1=1; int c1=1; int r2=2; int c2=2;
        int total,up,left,common,result;

        total=a[r2][c2];
        up=a[r1-1][c2];
        left=a[r2][c1-1];
        common=a[r1-1][c1-1];

        result=total-up-left+common;

        return result;
    }



    static void print(int[][]a)
    {
        for(var ele:a)
        {
            System.out.println(Arrays.toString(ele));
        }
        System.out.println();
    }
        /* 
        int[] a={1,2,3,4,5,6,6};

        int secondMax=secondMax(a);
        System.out.println(secondMax);

    }

    static int maxArray(int[] a)
    {
        int max=Integer.MIN_VALUE;

        for(int i=0; i<a.length; i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        return max;

    }

    static int secondMax(int[] a)
    {
        int max=maxArray(a);

        for(int i=0; i<a.length; i++)
        {
            if(max==a[i])
            {
                a[i]=Integer.MIN_VALUE;
            }
        }

        int secondMax=maxArray(a);

        return secondMax;


*/
    

