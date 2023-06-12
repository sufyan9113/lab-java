package Programs.API;
import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;

public class ForEach 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> a=new ArrayList<Integer>();

        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);

       // System.out.println(a);

        List<Integer> b= Arrays.asList(10,20,30,40,50);

        Consumer<Integer> c=i->System.out.println(i);

        /*
         Consumer<Integer> c=new Consumer<Integer>()
         {
            public void accept(Integer i)
            {
                System.out.println(i);
            }
         };
         */
        
                
            
       

       /*  for(Integer i:b)
        {
            System.out.println(i);
        }
        */

       // b.forEach(i->System.out.println(i));

       b.forEach(c);



    }
}
