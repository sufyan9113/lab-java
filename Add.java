import java.util.*;
public class Add 
{
    public static void main(String[] args) 
    {
        int[]a={1,2,3};
        boolean[] isValid=new boolean[a.length];
        ArrayList<Integer>ds=new ArrayList<>();
        List<List<Integer>>l=new ArrayList<>();
        call(a, ds, isValid, l);
        for(int i=0; i<l.size();i++)
        {
            System.out.println(l.get(i));
        }


    }
    public static void call(int[]a,ArrayList<Integer>ds, boolean[] isValid,List<List<Integer>>l)
    {
       if(ds.size()==a.length)
       {
        ArrayList<Integer>temp=new ArrayList<>();

        for(int i=0; i<ds.size();i++)
        {
            temp.add(temp.get(i));
        }
            l.add(temp);
        return;
       }

       for(int i=0; i<a.length;i++)
       {
        if(isValid[i]==false)
        {
            ds.add(i);
            isValid[i]=true;
            call(a, ds, isValid, l);
            isValid[i]=false;
            ds.remove(ds.size()-1);
        }
       }

    }
    public static String swap(String  s,int i,int j)
    {
        char[]c=s.toCharArray();
        char temp=c[i];
        c[i]=c[j];
        c[j]=temp;

        return s.valueOf(c);
    }
        
}
