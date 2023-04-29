
class MyException extends Exception
{
    MyException()
    {

    }
    MyException(String s)
    {
        super(s);
    }
}

public class CustomException
{
    public static void main(String[] args)
    {
        int a=10;
        int b=-3;
        try
        {
        if(b<0)
        {
            Exception e=new MyException("negative number");
            throw e;
        }
        else
        {
        int result=a/b;
        System.out.println(result);
        }
    }

        catch(Exception e)
        {
            System.out.println("enter valid number "+e);
        }

    }
   
    }

