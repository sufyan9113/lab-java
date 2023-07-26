import java.util.*;
class Students
{
    private String name;
    private int id;
}

class Employees
{
    private String name;
    private int id;
}

public class GenericsObj 
{
    public static void main(String[] args) 
    {
        Students s1=new Students();
        Students s2=new Students();
        Employees e1=new Employees();
        // no type safety

        ArrayList a=new ArrayList();

        a.add(s1);
        a.add(s2);
        a.add(e1);

        System.out.println(a);

        ArrayList<Students> a2=new ArrayList<Students>();

        a2.add(s1);
        a2.add(s2);
       // a2.add(e1);

       System.out.println(a2);


    }
}
