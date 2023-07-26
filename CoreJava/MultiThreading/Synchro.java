package MultiThreading;

class Car implements Runnable
{
        /*synchronized*/ public void run()
    {
        try{
        synchronized(this)
        {
        System.out.println(Thread.currentThread().getName()+" entered in parking");
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName()+" statred car");
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName()+" driving car");
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName()+" comeback at parking");
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName()+" parked the car");
        Thread.sleep(1000);
        }
    }
        catch(Exception e)
        {
            System.out.println("some problem");
        }
        
    }
}
public class Synchro 
{
    public static void main(String[] args) 
    {
        Car c= new Car();
        Thread t1=new Thread(c);
        Thread t2=new Thread(c);
        Thread t3=new Thread(c);

        t1.setName("son -1");
        t2.setName("son -2");
        t3.setName("son -3");

        t1.start();
        t2.start();
        t3.start();
    }
}
