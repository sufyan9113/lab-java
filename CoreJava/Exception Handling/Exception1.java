
public  class Exception1 
{
    public static void main(String[] args) 
    {
        int a=10;   // normal statement
        //int b=5;    // normal statement
        int b=0;
        int result=0;

      //  result = a/b; //critical statment
           try              
           {            //try to execute operation
            result =a/b;
            System.out.println("in try block");
            }

            catch(ExceptionH e)      // if exception occurs it throws exception objext
            {
                System.out.println("something went wrong "+e);
            }


            System.out.println(result);



       
    }
}
