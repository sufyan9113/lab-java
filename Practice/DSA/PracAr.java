package Practice.DSA;
import java.util.*;
public class PracAr 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int[]a={1,2,3,2,3,4,5}; 
        int n=a.length;

        System.out.println("enter no of queries");
        int q=s.nextInt();
        int[] freq=new int[100005];

        for(int i=0; i<n; i++)
        {
            freq[a[i]]++;
        }

        while(q>=0)
        {
            System.out.println("enter element");
            int ele=s.nextInt();
            if(freq[ele]>0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }


            q--;
        }


/* 
        int[] a={1,2,3,4,5};
        int n=a.length;
        int k=4;

        reverse(a,0,n-k-1);
        reverse(a,n-k,n-1);
        reverse(a,0,n-1);

        for(int ele:a)
        {
            System.out.print(ele+" ");
        }

    }
    public static int[] reverse(int[] a,int i, int j)
    {
        while(i<=j)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        return a;
    
        

/* 

        int[] a={1,2,3,4,5};
        int n=a.length;
        int k=4;
        int j=0;
        int[] res=new int[n];

        for(int i=n-k; i<n; i++)
        {
            res[j++]=a[i];
        }
        for(int i=0; i<n-k; i++)
        {
            res[j++]=a[i];
        }
        for(int ele:res)
        {
            System.out.print(ele+" ");
        }
        */
    }
    
}
