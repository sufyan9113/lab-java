
import java.util.*;
public class CollectionsClass

{
    public static void main(String[] args) 
    {
        ArrayList a=new ArrayList();

        a.add(100);
        a.add(5);
        a.add(10);
        a.add(20);
        a.add(20);
        a.add(30);

        System.out.println(a);

        Collections.sort(a);
        System.out.println(a);

        ArrayList a1=new ArrayList();

        a1.add("pw");
        a1.add("skill");
        a1.add("java");
        

        System.out.println(a1);

        Collections.sort(a1);
        System.out.println(a1);

        int index=Collections.binarySearch(a, 100);
        System.out.println(index);

        Collections.reverse(a);
        System.out.println(a);

        Collections.rotate(a, 3);
        System.out.println(a);

        Collections.shuffle(a);
        System.out.println(a);

        System.out.println(Collections.frequency(a, 20));
    }
}
