import java.security.KeyStore.Entry;
import java.util.*;

public class AccessHashMap 
{
    public static void main(String[] args) 
    {
        Map map=new HashMap();

        map.put(1,"rohit");
        map.put(2, "rohan");
        map.put(3, "mohit");
        map.put(4, "ramesh");

        System.out.println( map.get(1));
        System.out.println( map.get(2));
        System.out.println( map.get(3));
        System.out.println( map.get(4));

        System.out.println("******************************");

        Set set=map.keySet();

        Iterator itr1=set.iterator();

        while(itr1.hasNext())
        {
            //System.out.println(itr1.next());

            Integer i1=(Integer)itr1.next();
            System.out.println(i1);
        }

        System.out.println("******************************");

        Collection cl=map.values();

        Iterator itr2=cl.iterator();

        while(itr2.hasNext())
        {
           // System.out.println(itr2.next());
           String s1=(String)itr2.next();
           System.out.println(s1);
        }
        System.out.println("******************************");


        Set set2=map.entrySet();

        Iterator itr3=set2.iterator();

        while(itr3.hasNext())
        {
           //System.out.println(itr3.next());

           Map.Entry en= (java.util.Map.Entry) itr3.next();
           System.out.println(en.getKey()+" : "+en.getValue());
        }


        


    }
}
