package Practice.DSA;
import java.util.*;
public class RecurPermu 
{
    public static void main(String[] args) 
    {
        String s="ABC";
        ArrayList<String>l=new ArrayList<>();
        permuRec(s,"",l);

        for(int i=0; i<l.size(); i++)
        {
            System.out.println(l.get(i));
        }

    }
    public static void permuRec(String s,String t,ArrayList<String>ds)
    {
        if(s.equals(""))
        {
            ds.add(t);
            return;
        }

        for(int i=0; i<s.length(); i++)
        {
            char c= s.charAt(i);
            String left=s.substring(0,i);
            String right=s.substring(i+1);
            String r=left+right;
            permuRec(r, t+c,ds);
        }
        
       
    }

        
        

}
