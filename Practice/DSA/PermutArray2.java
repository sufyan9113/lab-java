package Practice.DSA;
import java.util.*;

public class PermutArray2 
{
    public static void main(String[] args) 
    {
        int[]a={1,2,3};
       // ArrayList<Integer>ds=new ArrayList<>();
        ArrayList<ArrayList<Integer>>al=new ArrayList<>();
        call(a, 0, al);
        for(int i=0; i<al.size();i++)
        {
            System.out.println(al.get(i));
        }

    }
    public static void call(int[]a,int ind,ArrayList<ArrayList<Integer>>al)
    {
        if(ind==a.length-1)
        {
            ArrayList<Integer>temp=new ArrayList<>();
            for(int i=0; i<a.length;i++)
            {
                temp.add(a[i]);
            }
            al.add(temp);
            return;
        }

        for(int i=ind; i<a.length;i++)
        {
            swap(a,i,ind);
            call(a, ind+1, al);
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

    


