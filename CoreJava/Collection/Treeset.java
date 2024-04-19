package Collection;
import java.util.*;
public class Treeset
{
    public static void main(String[] args) 
    {
        TreeSet a=new TreeSet();

        a.add(100);
        a.add(25);
        a.add(160);
        a.add(70);
        a.add(180);
        a.add(140);
        a.add(120);
        a.add(150);
        a.add(50);
       // a.add(1.1);
        

        System.out.println(a);

        System.out.println(a.higher(50));
        System.out.println(a.lower(50));

        System.out.println(a.ceiling(50));
        System.out.println(a.floor(50));



    
        
    }
}
