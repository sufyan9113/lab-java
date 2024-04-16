package Programs.API;
import java.util.*;
import java.util.stream.*;
import java.util.function.*;


public class StreamMethod 

{
    public static void main(String[] args) 
    {
        List<Integer> a=Arrays.asList(8,1,5,2,4,6,10);

        Stream<Integer> s=a.stream().filter(n->n%2==0).sorted().map(n->n*2);
        s.forEach(n->System.out.println(n));
/* 
        Predicate<Integer> p=new Predicate<Integer>()
        {
            public boolean test(Integer i)
            {
                if(i%2==0)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        };
        
        Stream<Integer>filter=s.filter(p);

        Stream<Integer>sort=filter.sorted();

        Function<Integer,Integer> f=new Function<Integer,Integer>()
        {
            public Integer apply(Integer i)
            {
                return i*2;
            }
        };

        Stream<Integer> map=sort.map(f);

        Consumer<Integer> c=new Consumer<Integer>()
        {
            public void accept(Integer i)
            {
                System.out.println(i);
            }
        };
        map.forEach(c);

*/
    }
}
