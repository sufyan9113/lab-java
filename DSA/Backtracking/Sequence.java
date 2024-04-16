package DSA.Backtracking;
import java.util.ArrayList;
import java.util.Arrays;

public class Sequence 
{
    public static void main(String[] args) 
    {
        int[] a={1,2,3};
        System.out.println("for array :"+ Arrays.toString(a));
        printSequence(a, 0,new ArrayList<>());
        System.out.println();
        
    }
    public static void printSequence(int[]a,int ind, ArrayList<Integer> temp)
    {
        if(ind==a.length)
        {
            if(temp.size()>0)
            {
                System.out.print(temp+" ");
            }
            return;
        }
        printSequence(a, ind+1, temp);
        temp.add(a[ind]);

        printSequence(a, ind+1, temp);
        temp.remove(temp.size()-1);

        
    }
}
