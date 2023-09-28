package Practice.DSA;
import java.util.*;
import java.util.concurrent.CountDownLatch;
public class TestPer 
{
    public static void main(String[] args) 
    {
        int[]a={1,2,3};
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer>temp=new ArrayList<>();
        backtrack(a,ans,temp);

        System.out.println(ans);

    }
    public static void backtrack(int[]a,List<List<Integer>> ans, ArrayList<Integer>temp)
    {
        if(temp.size()==a.length)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0; i<a.length; i++)
        {
            if(temp.contains(a[i]))
            continue;
            temp.add(a[i]);
            backtrack(a, ans, temp);
            temp.remove(temp.size()-1);
        }
    }
}
