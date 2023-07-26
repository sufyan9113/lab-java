
import java.util.*;
class Map1
{
    public static void main(String[] args)
    {
        HashMap hm=new HashMap();

        hm.put(1, "sufyan1");
        hm.put(2, "test1");
        hm.put(3,"sufyan3");
        hm.put(3, "afgbg");

        

        System.out.println(hm);

        LinkedHashMap lhm=new LinkedHashMap();

        lhm.put(3, "fabga");
        lhm.put(4, "gggna");
        lhm.put("bgba", "gna");
        

        lhm.putAll(hm);

        System.out.println(lhm);
    }
}