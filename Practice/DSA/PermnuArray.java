package Practice.DSA;
import java.util.*;
public class PermnuArray 
{
    public static void main(String[] args) 
    {
        int[]a={1,2,3};
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        ArrayList<Integer>ds=new ArrayList<>();
        boolean[] isValid=new boolean[a.length];
        printPerArr(a, ds, isValid, al);

        for(int i=0; i<al.size();i++)
        {
            System.out.println(al.get(i));
        }



    }
    public static void printPerArr(int[]a,ArrayList<Integer>ds,boolean[] isValid,ArrayList<ArrayList<Integer>> al)
    {
        if(ds.size()==a.length)
        {
            ArrayList<Integer>temp=new ArrayList<>();
            for(int i=0; i<ds.size();i++)
            {
                temp.add(ds.get(i));
            }
           al.add(temp);
           return;
          
        }

        for(int i=0; i<a.length;i++)
        {
            if(isValid[i]==false)
            {
                ds.add(a[i]);
                isValid[i]=true;
                printPerArr(a, ds, isValid, al);
                isValid[i]=false;
                ds.remove(ds.size()-1);
                

            }
        }
    }
}

