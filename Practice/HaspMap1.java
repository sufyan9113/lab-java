package Practice;
import java.util.*;

class Student1 implements Comparable<Student1>
{
     int marks;
     int num;
     String name;

    Student1(int marks,int num,String name)
    {
        this.marks=marks;
        this.num=num;
        this.name=name;
    }

    public int getMarks()
    {
        return marks;
    }

    public int getNum()
    {
        return num;
    }

    public String getName()
    {
        return name;
    }

    public String toString()
    {
        return marks+": "+num+": "+name;
    }

    public int compareTo(Student1 a)
    {
        if(this.marks>a.marks)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }

}

/*class Comp implements Comparator<Student1>
{
    public int compare(Student1 o1,Student1 o2)
    {
        if(o1.num>o2.num)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}
*/

class HaspMap1
{
    public static void main(String[] args) 
    {
        Student1 s1=new Student1(25,113,"sufyan");
        Student1 s2=new Student1(22,110,"rahul");
        Student1 s3=new Student1(18,115,"rohit");

        ArrayList<Student1> a=new ArrayList<Student1>();

        a.add(s1);
        a.add(s2);
        a.add(s3);

        Comparator<Student1> c= (Student1 o1,Student1 o2)->
            {
                if(o1.num>o2.num)
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
            };

            System.out.println(a);
            Collections.sort(a,c);
            System.out.println(a);
            Collections.sort(a);
        
            System.out.println(a);
    }
}

/* 
class Gen1<T>
{
    T num;

    Gen1 (T num)
    {
        this.num=num;
    }

    public T getNum()
    {
        return num;
    }

    public void show()
    {
        System.out.println(num.getClass().getName());
    }
}
class HashMap1
{
    public static void main(String[] args)
    {
        Gen1<Integer> g=new Gen1<Integer>(18);

        System.out.println(g.getNum());

        g.show();


    }
}

        /* 
        ArrayList<String> a=new ArrayList<String>();

        a.add("sufyan");
        a.add("rohit");
        a.add("ramesh");

        String s1=(String) a.get(0);
        String s2=(String) a.get(1);
        String s3=(String) a.get(2);

        System.out.println(a);
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        Iterator i=a.iterator();

        while(i.hasNext())
        {
            String s=(String)i.next();
            System.out.println(s);
        }

    }
}

/*class Emp
{
    private String name;
    private int num;
    
    Emp(String name, int num)
    {
        this.name=name;
        this.num=num;
    }
    public String getName()
    {
        return name;
    }

    public int getNum()
    {
        return num;
    }

    public String toString()
    {
        return name+" : "+num;
        
    }

    public void finalize()
    {
        System.out.println("garbage collection done");
    }

}

class HashMap1
{
    public static void main(String[] args) 
    {
        Emp e=new Emp("sufyan",23);
        System.out.println(e);

        WeakHashMap hm=new WeakHashMap();
        
        hm.put(e,"check");

        System.out.println(hm);

        e=null;
        System.gc();
        System.out.println("task completed");
        
      /*  
        HashMap map= new HashMap();

        map.put(1, "rohit");
        map.put(2, "ramesh");
        map.put(3, "rohan");

        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));
        System.out.println("*************************");

        Collection c=map.values();

        Iterator i1= c.iterator();

        while(i1.hasNext())
        {
            //System.out.println(i1.next());
            String s=(String) i1.next();
            System.out.println(s);
        }

        Set s=map.keySet();

        Iterator i2=s.iterator();
        
        while(i2.hasNext())
        {
            //System.out.println(i2.next());
            Integer i=(Integer) i2.next();
            System.out.println(i);
        }

        Set s2=map.entrySet();

        Iterator i3=s2.iterator();

        while(i3.hasNext())
        {
            //System.out.println(i3.next());
            Map.Entry en= (Map.Entry)i3.next();

           System.out.println(en.getKey()+" : "+en.getValue());
        }


    }
}
*/



