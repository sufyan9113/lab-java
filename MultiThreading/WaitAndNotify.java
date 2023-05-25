package MultiThreading;

class Queue
{
    int x;
    public void put(int a)
    {
        x=a;
        System.out.println("number is put in x "+x);
    }

    public void get()
    {
        System.out.println("the number is consumed "+x);
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
