package Practice;
import java.util.*;

class Arraylistprac
{
    public static void main(String[] args)
    {
        TreeSet ad=new TreeSet();

        ad.add(100);
        ad.add(50);
        ad.add(102);
        ad.add(120);
        ad.add(35);
        ad.add(60);
        ad.add(20);

        System.out.println(ad);
    }
}

       /*  Vector v= new Vector();

        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);

        System.out.println(v);

        Iterator i=v.iterator();

        while(i.hasNext())
        {
            System.out.println(i.next());
        }

        Enumeration e=v.elements();

        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }


    }
}
        /*

         ArrayList a1=new ArrayList();

        a1.add(100);
        a1.add(200);
        a1.add(300);

        System.out.println(a1.indexOf(100));
        System.out.println(a1.indexOf(200));
        System.out.println(a1.indexOf(300));
        System.out.println(a1.contains(100));
        System.out.println("*****************");

        System.out.println(a1.size());

        a1.ensureCapacity(100);
        System.out.println(a1.size());
        a1.trimToSize();
        System.out.println(a1.size());

      
    }
}


/* 
class Arraylistprac
{
    public static void main(String[] args) 
    {
        ArrayList a1=new ArrayList();

        a1.add(1);
        a1.add(10);
        a1.add(100);

        System.out.println(a1);

        ArrayList a2=new ArrayList();

        a2.add("hihi");
        a2.add(10);
        a2.add(10.1);
        System.out.println(a2);


        a2.addAll(a1);
        System.out.println(a2);

        a2.add(1,50000);
        System.out.println(a2);
        
        

    }
}*/