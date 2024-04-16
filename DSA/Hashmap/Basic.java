package DSA.Hashmap;
import java.util.*;
public class Basic 
{
    public static void main(String[] args) 
    {
        HashMap<Integer,String> h=new HashMap<>();

        h.put(1, "sufyan");
        h.put(2, "sarthak");
        h.put(3, "rohit");

        System.out.println(h);

        System.out.println(h.containsKey(2));
        System.out.println(h.containsValue("sufyan"));
        System.out.println(h.get(1));
        System.out.println(h.get(2));
        System.out.println(h.get(3));

        h.remove(2);
        System.out.println(h);
        Set s=h.entrySet();
        
        Iterator i=s.iterator();

        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
