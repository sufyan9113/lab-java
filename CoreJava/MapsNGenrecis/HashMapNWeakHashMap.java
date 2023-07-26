import java.util.*;



class Employee
{
    private int empId;
    private String name;

    Employee(String name, int empId)
    {
        this.name=name;
        this.empId=empId;
    }

    public String getName()
    {
        return name; 
    }

    public int getEmpId()
    {
        return empId; 
    }

    public String toString()
    {
        return name+" : "+ empId;
    }

    public void finalize()
    {
        System.out.println("gc done its work");
    }
}
public class HashMapNWeakHashMap 
{
   public static void main(String[] args) 
   {

    Employee e=new Employee("sufyan", 904588);

    System.out.println(e);

    //HashMap hm=new HashMap();
    
    WeakHashMap hm=new WeakHashMap();

    hm.put(e,"check");

    System.out.println(hm);

    e=null;

    System.gc();

    System.out.println("task completed");


   }
    
   
}
