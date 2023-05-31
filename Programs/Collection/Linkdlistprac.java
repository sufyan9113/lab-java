package Collection;
import java.util.*;

public class Linkdlistprac
{
    public static void main(String[] args) 
    {
        
        LinkedList a=new LinkedList();

        a.add(100);
        a.add(200);
        a.add(300);
        System.out.println(a);

       
        
        a.addFirst("gfjbgj");
        System.out.println(a);
        a.push(10);
        System.out.println(a);
        System.out.println(a.poll());
        System.out.println(a);
        
        System.out.println(a.peek());
        System.out.println(a);
        
        Deque d=new LinkedList();

        d.add(100);
        System.out.println(d);

        System.out.println(a.get(3));
        System.out.println(a.getFirst());
        
       
      




        
        


       
    }
}
