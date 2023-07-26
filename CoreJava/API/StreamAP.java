package Programs.API;
import java.util.*;
import java.util.stream.*;

public class StreamAP 
{
    public static void main(String[] args) 
    {
        List<Integer> a=Arrays.asList(1,2,3,4,5);

        Stream<Integer>s=a.stream();
       System.out.println(s.count());

        s.forEach(i->System.out.println(i));
    }
}
