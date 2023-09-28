import java.util.*;

public class TargetSumCom 
{
    public static void main(String[] args) 
    {
        int[]a={2,3,5};
        List<List<Integer>> ans=new ArrayList<>();
        int target=8;
        getCombi(a,ans,new ArrayList<>(),target,0);
        System.out.println(ans);
    }
    public static void getCombi(int[]a,List<List<Integer>> ans,ArrayList<Integer>temp,int target,int st)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        else if(target<0)
        {
            return;
        }

        for(int i=st; i<a.length;i++)
        {
            temp.add(a[i]);
            getCombi(a, ans, temp, target-a[i], i);
            temp.remove(temp.size()-1);

        }


    }
}
