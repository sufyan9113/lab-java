package Static;

public class ObjectInd 
{
    public static void main(String[] args) 
    {
        Call.disp1();
        Call c= new Call();
        c.disp1();
        c.disp2();
       
    }
    
}

class Call
{
     static void disp1()
    {
        System.out.println("static method disp-1");
    }

    void disp2()
    {
        System.out.println("non static method disp-2");
    }



}
