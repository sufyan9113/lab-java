package MultiThreading;
import java.util.*;


class Cal2 implements Runnable
{
    public void run()
    {
        System.out.println("in Test thread");
       
        
    }
}
class Disp2 implements Runnable
{
    public void run()
    {
        System.out.println("in Disp thread");
        try{
        for(int i=0; i<5; i++)
        {
            System.out.println("**********");
            Thread.sleep(2000);
        }
        }
        catch(Exception e)
        {
            System.out.println("exception");
        }
    }
}

public class JoinIsAlive 
{
    public static void main(String[] args) 
    {   
        System.out.println("main thread started");

        Cal2 t=new Cal2();
        Disp2 d= new Disp2();

        Thread t1=new Thread(t);
        Thread t2=new Thread(d);
        
        System.out.println(t1.isAlive());
        t1.start();
        System.out.println(t1.isAlive());
        t2.start();
        try{
        t2.join();
        
        }
        catch(Exception e)
        {
            System.out.println("exception");
        }

        System.out.println("main thread ended");
    }
}
