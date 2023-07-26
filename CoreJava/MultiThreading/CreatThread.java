package MultiThreading;


class MyThread extends Thread
{
    public void run()
    {
        System.out.println("child thread");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}

class MyThread2 extends Thread
{
    public void run()
    {
        System.out.println("child2 thread");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }

}
public class CreatThread 

{
    public static void main(String[] args) 
    {
        System.out.println("main thread");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());

        MyThread t= new MyThread();
        t.start();

        MyThread2 t2=new MyThread2();
        t2.start();
       
    }
}
