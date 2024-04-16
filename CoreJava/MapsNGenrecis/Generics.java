
import java.util.*;
public class Generics 

{
    public static void main(String[] args) 
    {
        //type safety in array

       /* String[] s=new String[3];
        s[0]="sufyan";
        s[1]="rohit";
        s[2]=10;
        */
        //no type safety
        ArrayList a=new ArrayList();

        a.add("sufyan");
        a.add("rohan");
        a.add(10);

        try
        {
            String s1=(String)a.get(0);
            String s2=(String)a.get(1);
            String s3=(String)a.get(2);
        }

        catch(ClassCastException e)
        {
            System.out.println("class mismatch");
        }

        // type safety.
        ArrayList<String> a1=new ArrayList<String>();
        
        a1.add("rohit");
        a1.add("ramesh");
       // a1.add(10); CE

       //no requirement of downcasting
       String s4=a1.get(0);
       String s5=a1.get(1);





        
    }
}
