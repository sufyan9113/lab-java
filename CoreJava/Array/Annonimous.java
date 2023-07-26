package Array;

class Cal
 {
    public int add(int[]a)
    {
    int t=0;
    for(int x: a)
    {
    t=t+x;
    }
    return t;
}
}
public class Annonimous 
{
    public static void main(String[]args)
    {
        int sum;
        Cal c= new Cal();
        sum=c.add(new int[]{10,20,30,40,50,60});
        System.out.println(sum);



      /*   int[] b;
        Annonimous a= new Annonimous();
        a.print(new int[]{10,20,30,40});
    }

    public void print(int[] a)
    {
        for(int x: a)
        {
            System.out.println(x);
        }
        */
    }
}

