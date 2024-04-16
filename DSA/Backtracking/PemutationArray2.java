package DSA.Backtracking;
import java.util.*;
public class PemutationArray2 
{
    public static void main(String[] args) 
    {
        int[]a={1,2,3};
        List<List<Integer>>ans=new ArrayList<>();
        printPerm(a,0,ans);
        for(int i=0; i<ans.size();i++)
        {
            System.out.println(ans.get(i));
        }
    }
    public static void printPerm(int[]a,int ind,List<List<Integer>>ans )
    {
        if(ind==a.length-1)
        {
            ArrayList<Integer>al=new ArrayList<>();
            for(int i=0; i<a.length;i++)
            {
                al.add(a[i]);
            }
            ans.add(al);
            return;
        }

        for(int i=ind; i<a.length;i++)
        {
            swap(a,i,ind);
            printPerm(a, ind+1, ans);
            swap(a,i,ind);

        }
    }
    public static void swap(int[]a,int i, int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
