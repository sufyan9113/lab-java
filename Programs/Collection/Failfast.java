package Collection;
import java.util.*;
import java.util.concurrent.*;
public class Failfast 
{
    public static void main(String[] args) 
    {
        ArrayList a=new ArrayList();

        a.add(10);
        a.add(50);
        a.add(30);

        /*for(int i=0; i<a.size(); i++)
        {
    
        System.out.println(a.get(i));
        a.add(100);

        }
*/
       /*  Iterator i= a.iterator(); // failfast

        while(i.hasNext())
        {
            System.out.println(i.next());
          //  a.add(100);
        }
*/
       CopyOnWriteArrayList b=new CopyOnWriteArrayList(); // fail safe

        b.add(10);
        b.add(20);
        b.add(30);
        b.add(40);

        Iterator i2= b.iterator();

        while(i2.hasNext())
        {
            System.out.println(i2.next());
            b.add(10);
        }
        


        
    }
}
