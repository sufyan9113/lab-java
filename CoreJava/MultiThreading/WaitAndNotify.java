package MultiThreading;

class Queue
{
    int x;
    boolean flag=false;

    synchronized public void put(int a)
    {
        try
        {
            if(flag==true)
            {
                wait();
            }
            else
            {
                 x=a;
                System.out.println("produced "+x);
                flag=true;
                notify();
            }


       
        }
        catch(Exception e)
        {
            System.out.println("something is wrong");
        }
        
    }

    synchronized public void get()
    {
        try
        {
            if(flag==false)
            {
                wait();
            }
            else
            {
                System.out.println("consumed "+x);
                flag=false;
                notify();
            }
            
        }

        catch(Exception e)
        {
            System.out.println("something is wrong");
        }
        
    }
}
class Producer extends Thread
{
    Queue q;
    Producer(Queue b)
    {
        q=b;
    }
    public void run()
    {
        
        int x=1;
        while(true)
        {
        q.put(x++);
        }
    }
}

class Consumer extends Thread
{
    Queue q;

    Consumer(Queue b)
    {
        q=b;
    }

    public void run()
    {
        while(true)
        {
        q.get();
        }
    }
   
}


 class WaitAndNotify 
{
    public static void main(String[] args) 
    {
        Queue q=new Queue();
        Producer p=new Producer(q);
        Consumer c=new Consumer(q);

        p.start();
        c.start();
        
    }
}
