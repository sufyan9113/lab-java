package MultiThreading;
import java.util.*;


class Cal extends Thread
{
    public void run()
    {
        System.out.println("calculation is started");
        Scanner s=new Scanner(System.in);

        System.out.println("enter 1st num");
        int n1=s.nextInt();

        System.out.println("enter 2nd num");
        int n2=s.nextInt();

        int res= n1+n2;

        System.out.println(res);
    }
}
class Disp extends Thread
{
    public void run()
    {
        System.out.println("display is started");
        try
        {
            for(int i=0; i<4; i++)
            {
                System.out.println("printing*******");
                Thread.sleep(2000);
            }
        }
        catch(Exception e)
        {
            System.out.println("thread is sleeping");
        }
       
    }
}
public class MultipleThread 
{    
    public static void main(String[] args) 
    {
        System.out.println("main thread");
        
        Cal  t1= new Cal();
        Disp t2= new Disp();

        t1.start();
        t2.start();

    }
}
