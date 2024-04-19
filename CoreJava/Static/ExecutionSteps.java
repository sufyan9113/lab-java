package Static;

public class ExecutionSteps 
{
    public static void main(String[] args) {
        Test t=new Test();
        Test.disp1();
        t.disp2();
        
    }
}

class Test
{
    static int a;
    static int b;

    int x;
    int y;

    static {
        a=10;
        b=20;
        System.out.println("Static block");
    }

    {
        x=50;
        y=60;
        System.out.println("non Static block");
    }

    static void disp1(){
        System.out.println("static method disp1 " +a);
        System.out.println("static method disp1 " +b);
    }

    void disp2(){
        System.out.println("non static method disp2 " +x);
        System.out.println("non static method disp2 " +y);
    }
}
