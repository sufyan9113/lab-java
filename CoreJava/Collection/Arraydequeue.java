package Collection;

import java.util.ArrayDeque;

public class Arraydequeue 
{
    public static void main(String[] args) 
    {
        ArrayDeque a=new ArrayDeque();

        a.add(10);
        a.add(20);
        a.offer(15);
        a.offerLast(25);
        a.offerFirst("gubgfd");

        System.out.println(a);
    }
}
