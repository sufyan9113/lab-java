package MultiThreading;
import java.util.*;


class Cal implements Runnable
{
    public void run()
    {
        System.out.println("calculation is started");
        Scanner s=new Scanner(System.in);

        System.out.println("enter 1st num");
        int n1=s.nextInt();
        System.out.println("enter 2nd num");
        int n2=s.nextInt();

        int res=n1+n2;
        System.out.println(res);
    }
}

class Disp implements Runnable
{
    public void run(){
    System.out.println("disp is started");

        try{
        for(int i=0; i<4; i++)
        {
            System.out.println("in disp*****");
            Thread.sleep(2000);
        }
    }
    catch(Exception e)
    {
        System.out.println("something went wrong");
    }
    }
}
public class ThreadRunnable 
{
    public static void main(String[] args) 
    {
        System.out.println("main thread");

        Cal c= new Cal();
        Disp d=new Disp();

        Thread t1=new Thread(c);
        Thread t2=new Thread(d);

        t1.start();
        t2.start();
     

        
    }
}
