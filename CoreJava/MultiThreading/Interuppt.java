package MultiThreading;


class Check implements Runnable
{
    public void run()
    {
        System.out.println("check thread");
        try{

        for(int i=0; i<5; i++)
        {
            System.out.println("****");
            Thread.sleep(1000);
        }
        }
        catch(Exception e)
        {
            System.out.println("thread interrupted");
        }
    }

}
public class Interuppt 
{
    public static void main(String[] args) 
    {
        Check c=new Check();

        Thread t1= new Thread(c);

        t1.start();
        t1.interrupt();
    }
}
