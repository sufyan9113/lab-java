
import java.util.*;

import Practice.ExceptionH;

class MyException extends Exception
{

}
 class FaceBook
{
    String userName= "sufyan9113";
    int password=915791;

    String enteredUserName;
    int enteredPassword;


    public void input()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter user name");
        enteredUserName= s.next();

        System.out.println("enter password");
        enteredPassword=s.nextInt();
    }

    public void validate() throws Exception
    {
        if(userName.equalsIgnoreCase(enteredUserName) && password == enteredPassword )
        {
            System.out.println("Welcome to your Account");
        }

        else
        {
            System.out.println("wrong details");
            Exception e=new MyException();
            throw e;
        }
    }
}

class Run
{
    FaceBook fb=new FaceBook();

    public void run()
    {
        fb.input();
        try
        {
            
        fb.validate();
        }
        catch(Exception e)
        {
            try
            {
                fb.input();
                fb.validate();
            }
                catch(Exception re)
                {
                    try
                    {
                    fb.input();
                    fb.validate();
                    }
                    
                    catch(Exception  se)
                    {
                        System.out.println("Your Account is locked");
                    }
                }
            }
            
        }
        
    
    
}

public class Demo5 
{
    public static void main(String[] args) 
    {
        Run r= new Run();

        r.run();

       
        
    }
}
