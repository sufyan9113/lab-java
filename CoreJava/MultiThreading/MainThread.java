package MultiThreading;

public class MainThread 
{
    public static void main(String[]args)
    {
        System.out.println("before changing");

        String s=Thread.currentThread().getName();
        System.out.println("thread name: "+s);
        System.out.println("thread priority: "+Thread.currentThread().getPriority());

        System.out.println("after changing");

        Thread t=Thread.currentThread();
        t.setName("test");
        t.setPriority(1);

        System.out.println("thread name: "+Thread.currentThread().getName());
        System.out.println("thread priority: "+Thread.currentThread().getPriority());


        
        


        
    }
}
