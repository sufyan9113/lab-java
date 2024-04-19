package Practice.DSA;
import java.util.*;
public class FreqArr 
{
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) 
    {
        int[] a =inputArray();
        int n=a.length;
        int[]freq=makeFreqArr(a);
        query(freq);

        
       
       

    }

    public static int[] inputArray()
    {
        System.out.println("enter size of array");
        int n;
        
        n=s.nextInt();
        int[] a=new int[n];

        System.out.println("enter "+n+ " element of array");
        for(int i=0; i<n; i++)
        {
            a[i]=s.nextInt();
        }
        return a;
    }

    public static int[] makeFreqArr(int[]a)
    {
        int[]freq=new int[1000005];

        for(int i=0; i<a.length; i++)
        {
            freq[a[i]]++;
        }
        return freq;
    }
    
    public static void query(int[]a)
    {
        System.out.println("enter num of query");
        int q=s.nextInt();

        while(q>0)
        {
            System.out.println("enter element to be searched");
            int val=s.nextInt();

            if(a[q]>0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
            q--;
        }


    }
   

    

    public static void print(int[]a)
    {
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");   
        }
        System.out.println();
    }
   
}
