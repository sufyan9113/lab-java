
class ThreadPrac
{
    public static void main(String[] args) 
    {
        
    }
}


/*
class Lib implements Runnable
{
    String s1="book-1";
    String s2="book-2";
    String s3="book-3";

    public void run()
    {
        
    
            String s=Thread.currentThread().getName();
            if(s.equals("student-1"))
            {
            try{
            Thread.sleep(1000);
            synchronized(s1)
            {
                System.out.println(s+" acquires "+s1);
                Thread.sleep(1000);
                synchronized(s2)
                {
                    System.out.println(s+" acquires "+s2);
                    Thread.sleep(1000);

                    synchronized(s3)
                    {
                    System.out.println(s+" acquires "+s3);
                    Thread.sleep(1000);
                    }
                }
            }
        }
                    catch(Exception e)
                    {
                    System.out.println("something is wrong");
                    }
            }
            else
            {
                try{
                    Thread.sleep(1000);
                    synchronized(s3)
                    {
                        System.out.println(s+" acquires "+s3);
                        Thread.sleep(1000);
                        synchronized(s2)
                        {
                            System.out.println(s+" acquires "+s2);
                            Thread.sleep(1000);
        
                            synchronized(s1)
                            {
                            System.out.println(s+" acquires "+s1);
                            Thread.sleep(1000);
                            }
                        }
                    }
                }
                            catch(Exception e)
                            {
                            System.out.println("something is wrong");
                            }
            }


        }
        
       
    }

class ThreadPrac
{
    public static void main(String[] args) 
    {
        Lib a=new Lib();
        Thread t1=new Thread(a);
        Thread t2=new Thread(a);
        t1.setName("student-1");
        t2.setName("student-2");

        t1.start();
        t2.start();
    }
}


/*
class Car extends Thread
{
     public void run()
    {
        try{
        System.out.println(Thread.currentThread().getName()+" reached at parking");
        Thread.sleep(1000);
        synchronized(this)
        {
        System.out.println(Thread.currentThread().getName()+" started car");
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName()+" driving car");
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName()+" come back and parked car");
        Thread.sleep(1000);
        }
    }
        catch(Exception e)
        {
            System.out.println("something is wrong");
        }
    }
}

class ThreadPrac
{
    public static void main(String[] args) throws Exception
    {
        Car c=new Car();
        
        Thread t1=new Thread(c);
        Thread t2=new Thread(c);
        Thread t3=new Thread(c);
        t1.setName("son-1");
        t2.setName("son-2");
        t3.setName("son-3");

        t1.start();
        t2.start();
        t3.start();

        
    }
}
/*
class SingleRun extends Thread
{
    public void run()
    {
        String s=Thread.currentThread().getName();
        if(s.equals("cal thread"))
        {
            cal();
            
        }
        else
        {
            disp();
        }

    }

    public void cal()
    {
        System.out.println("in cal method");
        System.out.println("enter num");
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        System.out.println(n1);
    }

    public void disp()
    {
        System.out.println("in disp method");
        for(int i=0; i<5; i++)
        {
            System.out.println("*******");
            try{
            Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println("thread in sleep");
            }
        }
    }

}
class ThreadPrac
{
    public static void main(String[] args) throws Exception
    {
        SingleRun s1=new SingleRun();
        SingleRun s2=new SingleRun();
        System.out.println("main thread started");
        s1.setName("cal thread");
        s2.setName("disp thread");
        s1.start();
       // s2.join();  
        s2.start();
        s2.interrupt();

        System.out.println("main thread completed");
       // Thread t1= new Thread();
       // Thread t2= new Thread();
    }
}
/*
class ThreadPrac
{
    public static void main(String[] args) 
    {
        System.out.println("before");
        System.out.println(Thread.currentThread().getName());  
        System.out.println(Thread.currentThread().getPriority());

        Thread.currentThread().setName("new thread");
        Thread.currentThread().setPriority(1);
        System.out.println("after");
        System.out.println(Thread.currentThread().getName());  
        System.out.println(Thread.currentThread().getPriority());


       
    }
}

/* 
class Cal implements Runnable
{
    public void run()
    {
        System.out.println("Calculation started");
        Scanner s=new Scanner(System.in);
        System.out.println("enter 1st num");
        int n1=s.nextInt();
        System.out.println("enter 2nd num");
        int n2=s.nextInt();

        int res=n1+n2;
        System.out.println(res);

        System.out.println(Thread.currentThread().getName());  
        System.out.println(Thread.currentThread().getPriority());
    }
}
class Disp implements Runnable
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());  
        System.out.println(Thread.currentThread().getPriority());
        System.out.println("in disp");

        try{
        for(int i=0; i<5; i++)
        {
            System.out.println("disp*****");
            Thread.sleep(2000);
        }
    }
    catch(Exception e)
    {
        System.out.println("thread is sleeping");
    }

}
}
class ThreadPrac
{
    public static void main(String[] args) 
    {
        System.out.println("main thread");
        System.out.println(Thread.currentThread().getName());  
        System.out.println(Thread.currentThread().getPriority());

        Cal c=new Cal();
        Disp d=new Disp();
        Thread t1=new Thread(c);
        Thread t2=new Thread(d);
        t1.start();
        t2.start();
    }
}

/*
class Cal extends Thread
{
    public void run()
    {
        System.out.println("Calculation started");
        Scanner s=new Scanner(System.in);
        System.out.println("enter 1st num");
        int n1=s.nextInt();
        System.out.println("enter 2nd num");
        int n2=s.nextInt();

        int res=n1+n2;
        System.out.println(res);

        System.out.println(Thread.currentThread().getName());  
        System.out.println(Thread.currentThread().getPriority());
    }
}
class Disp extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());  
        System.out.println(Thread.currentThread().getPriority());
        System.out.println("in disp");

        try{
        for(int i=0; i<5; i++)
        {
            System.out.println("disp*****");
            Thread.sleep(2000);
        }
    }
    catch(Exception e)
    {
        System.out.println("thread is sleeping");
    }

}
}
class ThreadPrac
{
    public static void main(String[] args) 
    {
        System.out.println("main thread");
        System.out.println(Thread.currentThread().getName());  
        System.out.println(Thread.currentThread().getPriority());

        Cal t1=new Cal();
        Disp t2=new Disp();
        t1.start();
        t2.start();
    }
}
*/
