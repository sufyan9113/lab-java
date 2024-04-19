package Practice.CoreJava;

interface A2
{
   // void show();
     // void show(int age);
    void show(int age,int num,int code);

}

public class Lambda 
{
    public static void main(String[] args) 
    {
        //A2 obj=() -> System.out.println("in show");
        //obj.show();

        /*A2 obj= age -> {
            System.out.println("in show"); 
            System.out.println(age);
        };
        obj.show(18);
        */

         A2 obj= (age,num,code) ->
        {
            System.out.println(age);
            System.out.println(num);
            System.out.println(code);
        };
        obj.show(18,113,4588);
        
    }
}
