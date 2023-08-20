package DSA.Recursion;
import java.util.*;
public class PermutationRec 
{
    public static void main(String[] args) 
    {
        String s="abc";
        List<String> l=new ArrayList<>();
        printp(s,"",l);
        System.out.println(l);
        for(int i=0; i<l.size(); i++)
        {
            System.out.println(l.get(i));
        }
    }
    public static void printp(String s, String r,List<String>l)
    {
        int n=s.length();

        if(s.equals(""))
        {
            l.add(r);
            return;
        }

        for(int i=0; i<n; i++)
        {
            char c=s.charAt(i);
            String left=s.substring(0,i);
            String right=s.substring(i+1);
            String t= left+right;
            printp(t, r+c,l);

            

        }
    }
}

