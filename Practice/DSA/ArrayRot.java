package Practice.DSA;
import java.util.*;
public class ArrayRot 
{
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) 
    {
        int[] a =inputArray();
        int n=a.length;
        System.out.println("enter num of element to be rotate");
        int k=s.nextInt();
       rotateInPlace(a,k);
        print(a);
       

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
    public static int[] reverse(int[]a,int i,int j)
    {
      while(i<j)
      {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        i++;
        j--;
      }
      return a;
                      
    }
    public static int[] rotateInPlace(int[] a,int k)
    {
      int n=a.length;
      k=k%n;

      reverse(a,0,n-k-1);
      reverse(a, n-k, n-1);
      reverse(a,0,n-1);
      
      return a;
    }

    public static int[] rotate(int[] a, int k)
    {
      int n=a.length;
      k=k%n;
      int[] ans=new int[n];
      int j=0;

      for(int i=n-k; i<n;i++)
      {
        ans[j]=a[i];
        j++;
      }
      for(int i=0; i<n-k; i++)
      {
        ans[j]=a[i];
        j++;
      }
      return ans;

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
