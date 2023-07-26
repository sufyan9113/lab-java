import java.util.*;

public class HashTableNTreeMap
{
    public static void main(String[] args) 
    {
        Hashtable ht=new Hashtable();

        ht.put(1,"rohit");
        ht.put(2,"rohan");
        ht.put(3, "ramesh");
        ht.putIfAbsent(4, "sufyan");
       // ht.put(null, "gffdgg");

        System.out.println(ht);

        TreeMap tm=new TreeMap();

        tm.put(1, "faifdn");
      //  tm.put(null,"gf");
        tm.put(2,"gmso ");
        tm.put(4, "nduab");
        tm.put(3, "gvbniugb");
        System.out.println(tm);

    }
}
