package Practice.DSA;
import java.util.Arrays;

public class Rotate2D 
{
    public static void main(String[] args) 
    {
        int[] a={1,2,3,4,5,6};
        boolean result= true;
        for(int i=1; i<a.length; i++)
        {
            if(a[i]<a[i-1])
            {
                result=false;
                break;
            }
        }
        System.out.println(result);
        /* 
        int[] a={5,6,5,3,5,4};
        int x=5;
        int index=-1;

        for(int i=0; i<a.length; i++)
        {
            if(x==a[i])
            {
                index=i;
            }
        }
        System.out.println(index);


        /* 
        int[] a={5,6,5,1,5};
        int x=5;
        int count=0;
        for(int i=0; i<a.length;i++)
        {
            if(x==a[i])
            {
                count++;
            }
        }
        System.out.println(count);
        /* 
        int[] a={5,6,7,8,9};
        int[] b=Arrays.copyOfRange(a, 0,5);
        System.out.println("before");
        for(int ele:a)
        {
            System.out.print(ele+" ");
        }
        System.out.println();

        for(int ele:b)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
        b[0]=0;
        b[1]=0;
        System.out.println("after");
        for(int ele:a)
        {
            System.out.print(ele+" ");
        }
        System.out.println();

        for(int ele:b)
        {
            System.out.print(ele+" ");
        }
        System.out.println();

        /* 
        int[] a={5,6,7,8,9};
        int[] b=a;
        System.out.println("before");
        for(int ele:a)
        {
            System.out.print(ele+" ");
        }
        System.out.println();

        for(int ele:b)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
        b[0]=0;
        b[1]=0;
        System.out.println("after");
        for(int ele:a)
        {
            System.out.print(ele+" ");
        }
        System.out.println();

        for(int ele:b)
        {
            System.out.print(ele+" ");
        }
        System.out.println();

        /* 
        int[] a={1,5,3,4};
        int ans=-1;
        int x=4;

        for(int i=0; i<a.length; i++)
        {
            if(x==a[i])
            {
                ans=i;
                
                break;
            }
            
        }
        System.out.println(ans);
        
        

        /* 
        int[] a={5,6,7,8,1};
        int max=0;
        for(int i=0; i<a.length; i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println(max);

        

        
        /* 
        int[][] a={{10,20,30},{40,50},{60,70,80,90},{100}};

        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        for(int[] ar:a)
        {
            for(int ele:ar)
            {
            System.out.print(ele+" ");
            }
        System.out.println();
        }

        /*
        int[][]a={{1,2,2,1},{2,2,1,1},{1,2,1,1},{2,1,2,1}};
        int n=a.length;
        int m=a[0].length;
        
        
        Scanner s=new Scanner(System.in);

        for(int j=1; j<m; j++)
        {
            for(int i=0; i<n; i++)
            {
               a[i][j]+=a[i][j-1];
            }
        }
        for(var i:a)
        {
            System.out.println(Arrays.toString(i));
        }
        System.out.println();

        for(int i=1; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
               a[i][j]+=a[i-1][j];
            }
        }
        for(var i:a)
        {
            System.out.println(Arrays.toString(i));
        }
        System.out.println();

        int r1,r2,c1,c2,total,result,left,up,common=0;

        System.out.println("enter value of r1");
        r1=s.nextInt();
        System.out.println("enter value of c1");
        c1=s.nextInt();
        System.out.println("enter value of r2");
        r2=s.nextInt();
        System.out.println("enter value of c2");
        c2=s.nextInt();

        total=a[r2][c2];
        up=a[r1-1][c2];
        left=a[r2][c1-1];
        common=a[r1-1][c1-1];

        result=total-left-up+common;
        System.out.println(result);



        

       


        /* 
        System.out.println("enter value of r1");
        r1=s.nextInt();
        System.out.println("enter value of c1");
        c1=s.nextInt();
        System.out.println("enter value of r2");
        r2=s.nextInt();
        System.out.println("enter value of c2");
        c2=s.nextInt();

        for(int i=r1; i<=r2; i++)
        {
            for(int j=c1; j<=c2; j++)
            {
                sum+=a[i][j];
            }
        }
        
        System.out.println(sum);


/* 
        for(int i=0; i<n; i++)
        {
            for(int j=i; j<m; j++)
            {
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        for(var i:a)
        {
            System.out.println(Arrays.toString(i));
        }
        System.out.println();

        for(int i=0; i<n; i++)
        {
            int up=0;
            int down=n-1;

            while(up<down)
            {
                int temp=a[up][i];
                a[up][i]=a[down][i];
                a[down][i]=temp;
                up++;
                down--;
            }
        }
        for(var i:a)
        {
            System.out.println(Arrays.toString(i));
        }

        /* 
        int count=0;
        for(int i=0; i<n;i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                    System.out.println(a[i]);
                }
            }
        }
        if(count==0)
        {
            System.out.println("no duplicates");
        }


        /* 
        int count=0;

        int total=1;
        for(int i=2; i<n+1; i++)
        {
            total+=i;
            total-=a[i-2];

        }
        System.out.println(total);
        /* 
        int sumLoop=0;

        int sumNat=(n+1)*(n+2)/2;
       
        for(int i=0; i<n; i++)
        {
            sumLoop+=a[i];
        }

        int missingNum=sumNat-sumLoop;
        System.out.println(missingNum);
        /* 
     //   int []b=new int[n];

     for(int i=0; i<n/2; i++)
     {
        int temp=a[i];
        a[i]=a[n-1-i];
        a[n-1-i]=temp;
     }
     for(int ar:a)
     {
        System.out.println(ar);
     }
/* 
        //approch 2
        for(int i=0; i<n/2; i++)
        {
            if(a[i]!=a[n-1-i])
            {
                count++;
                System.out.println("not palindrom");
                break;
            }
        }
        /* approch 1
        for(int i=0; i<n; i++)
        {
            b[i]=a[n-1-i];
        }
        for(int i=0; i<n; i++)
        {
            if(a[i]!=b[i])
            {
                count++;
                System.out.println("not palindrom");
                break;
            }
        }
    
        if(count==0)
        {
            System.out.println("palindrom");
        }
*/

        
    }  
}
