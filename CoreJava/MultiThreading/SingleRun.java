package MultiThreading;
import java.util.*;

class TestThread extends Thread
{
    public void run()
    {
        String tname= Thread.currentThread().getName();
        if(tname.equals("cal"))
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
        System.out.println("Calculation stared");
        Scanner s=new Scanner(System.in);
        System.out.println("enter 1st num");
        int n1=s.nextInt();
        System.out.println("enter 2nd num");
        int n2=s.nextInt();

        int res=n1+n2;
        System.out.println(res);
        System.out.println("calculatin completed");
    }
    
    public void disp()
    {
        System.out.println("in disp method");
        try{
        for(int i=0; i<5; i++)
        {
            System.out.println("*************");
            Thread.sleep(2000);
        }
        }
    catch(Exception e)
    {
        System.out.println("something went wrong");
    }
    }
}
public class SingleRun 
{
    public static void main(String[] args) 
    
    {
        TestThread t1= new TestThread();
        TestThread t2= new TestThread();

        t1.setName("cal");
        t2.setName("disp");

        t1.start();
        t2.start();
        
    }
}
