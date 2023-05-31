package Collection;
import java.util.*;

public class ArrayListBasic
{
    public static void main(String[] args)
    {
        ArrayList a1=new ArrayList();

        a1.add(100);
        a1.add(200);
        a1.add(300);
        a1.add(300);
        a1.add(4, 400);

        System.out.println(a1.indexOf(100));
        System.out.println(a1.indexOf(300));   
        System.out.println(a1.lastIndexOf(500));      
        System.out.println(a1.contains(100));
        System.out.println(a1.contains(30));
        System.out.println(a1.get(2));

        System.out.println(a1.size());
        a1.clear(); 
        System.out.println(a1);

        List a2=new ArrayList();


    }
}

/*public class ArrayListBasic 
{
    public static void main(String[] args) 
    {
        ArrayList a1=new ArrayList();

        a1.add(100);
        a1.add(200);
        a1.add(300);

        System.out.println(a1);
        System.out.println("************************");

        ArrayList a2=new ArrayList();

        a2.add(1);
        a2.add("sufyan");
        a2.add('s');
        a2.add(1.2);
        a2.add(true);

        System.out.println(a2);
        System.out.println("*************************");

        ArrayList a3=new ArrayList();

        a3.add(54);
        a3.add(54);
        a3.addAll(a2);

        System.out.println(a3);
        System.out.println("*************************");

        a3.add(1, "hiii");
        System.out.println(a3);
        System.out.println("*************************");


    }
}
*/