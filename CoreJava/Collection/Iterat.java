package Collection;
import java.util.*;
public class Iterat 
{
    public static void main(String[] args) 
    {
        ArrayList a=new ArrayList();

        a.add(10);
        a.add(20);
        a.add(100);
        a.add(500);
        a.add(40);

        Iterator i= a.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

        ListIterator i2= a.listIterator(a.size());

        while(i2.hasPrevious())
        {
            System.out.println(i2.previous());
        }
     


      /*   for(int i=0; i<a.size(); i++)
        {
            System.out.println(a.get(i));
        }

        for(Object o:a)
        {
            System.out.println(o);
       
      
    }
*/


        
        
    }
    
}
