package Practice;

import java.util.*;

class Check implements Runnable
{
    String s;
    public void run()
    {
        s=Thread.currentThread().getName();
        if(s=="thread-1")
        {
            System.out.println("thread-1");

            disp();
        }
        else
        {
            System.out.println("thread-2");

            show();
        }

    }
    public void disp()
    {
        System.out.println("in disp");

        for(int i=0; i<5; i++)
        {
            System.out.println("*******");
        }
    }

    public void show()
    {
        System.out.println("in show");

    }
}


class SingleRun
{
    public static void main(String[] args) 
    {
        Check c=new Check();

        Thread t1=new Thread(c);
        Thread t2=new Thread(c);

        t1.setName("thread-1");
        t2.setName("thread-2");

        t1.start();
        t2.start();
    }
}