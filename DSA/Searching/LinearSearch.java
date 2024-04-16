package DSA.Searching;
import java.util.*;
public class LinearSearch 
{
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) 
    {
        int[] a=userInput();
        linearSearch(a);
        
    }

    public static int[] userInput()
    {
        System.out.println("enter size of array");
        int n=s.nextInt();
        int[]a=new int[n];
        System.out.println("enter array elements");

        for(int i=0; i<n; i++)
        {
            a[i]=s.nextInt();
        }
        return a;
    }

    public static void linearSearch(int[] a)
    {
        int n=a.length;
        int index=-1;
        System.out.println("enter element to find");
        int x=s.nextInt();
        for(int i=0; i<n; i++)
        {
            if(a[i]==x)
            {
                index=i;
                break;
            }
        }
        if(index==-1)
        {
            System.out.println("element not found");
        }
        else
        {
            System.out.println("element found at index "+index);
        }
    }
}
