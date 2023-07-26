

interface  A
{
    void show();

    static class B 
    {
        public void abc()
        {
            System.out.println("in abc");
        }
    }
}

class C implements A
{
    public void show()
    {
        System.out.println("in show");
    }
}
public class InnerClass
{
    public static void main(String[] args) 
    {
        A obj= new C();
        obj.show();
       
    }
}
