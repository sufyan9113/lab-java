package Collection;
import java.util.*;
public class Hashset 
{
    public static void main(String[] args) 
    {
        HashSet a= new HashSet();

        a.add(10);
        a.add(50);
        a.add(25);
        a.add(100);
        a.add(100);

        System.out.println(a);

        LinkedHashSet b=new LinkedHashSet();

        b.add(10);
        b.add(50);
        b.add(25);
        b.add(100);
        b.add(100);


        System.out.println(b);

     
        
        
    }
}
