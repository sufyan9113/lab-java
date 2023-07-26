package Interface;

interface X
{
    void show(int age,int num);
   //void disp();
}

public class Lambda 
{
    public static void main(String[] args) 
    {
        X obj= (age,num) -> 
        {
        System.out.println("in show ");
        System.out.println(age);
        System.out.println(num);
        };
        obj.show(10,113);
    }
    
}
