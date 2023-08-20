import java.util.*;

public class Sequence 
{
    public static void main(String[] args)
    {
        int[]a={1,2,3};
        printSq1(a, 0, new ArrayList<>());


    }
    public static void printSq1(int[]a,int i,ArrayList<Integer>temp)
    {
        if(i==a.length)
        {
            if(temp.size()>0)
            {
                System.out.println(temp);
                
            }
            return;
        }
        printSq1(a, i+1, temp);
        temp.add(a[i]);
        printSq1(a, i+1, temp);
        temp.remove(temp.size()-1);

    }
}
