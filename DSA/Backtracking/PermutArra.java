package DSA.Backtracking;
import java.util.*;
public class PermutArra 
{
    public static void main(String[] args) 
    {
        int[]a={1,2,3};
        List<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> t=new ArrayList<>();
        boolean[] isValid=new boolean[a.length];
        printPermutation(a, t, ans, isValid);

        for(int i=0; i<ans.size(); i++)
        {
            System.out.println(ans.get(i));
        }
    }
        public static void printPermutation(int[]a, ArrayList<Integer>t,List<ArrayList<Integer>>ans,boolean[]isValid)
    {
        if(t.size()==a.length)
        {
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0; i<t.size(); i++)
            {
                list.add(t.get(i));
            }
            ans.add(list);
            return;
        }
        for(int i=0; i<a.length; i++)
        {
            if(isValid[i]==false)
            {
                t.add(a[i]);
                isValid[i]=true;
                printPermutation(a, t, ans, isValid);
                isValid[i]=false;
                t.remove(t.size()-1);
            }
        }
    }
    
}
