package MultiThreading;


class Library implements Runnable
{
    String s1=new String("java");
    String s2=new String("DSA");
    String s3=new String("SQL");

    public void run()
    {
        String s=Thread.currentThread().getName();
        if(s.equals("student 1"))
        {
            try
            {
                Thread.sleep(1000);

                synchronized(s1)
                {
                    System.out.println(s+" acquired "+s1);
                    Thread.sleep(1000);
                    
                    synchronized(s2)
                    {
                        System.out.println(s+" acquired "+s2);
                        Thread.sleep(1000);
                    
                    
                    synchronized(s3)
                    {
                        System.out.println(s+" acquired "+s3);
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
            try
            {
                Thread.sleep(1000);

                synchronized(s3)
                {
                    System.out.println(s+" acquired "+s3);
                    Thread.sleep(1000);
                    
                    synchronized(s2)
                    {
                        System.out.println(s+" acquired "+s2);
                        Thread.sleep(1000);
                    
                    
                    synchronized(s1)
                    {
                        System.out.println(s+" acquired "+s1);
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

class Deadlock
{
    public static void main(String[] args) 
    {
        Library l=new Library();
        Thread t1=new Thread(l);
        Thread t2=new Thread(l);

        t1.setName("student 1");
        t2.setName("student 2");

        t1.start();
        t2.start();
    } 
}