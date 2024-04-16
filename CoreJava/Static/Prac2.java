package Static;
public class Prac2 
{
    public static void main(String[] args) 
    {
        Demo.disp1();
        Demo d=new Demo();
        d.disp1();
        d.disp2();
    }
}

class Demo
{
    static void disp1()
    {
        System.out.println("static method disp1");
    }

    void disp2(){
        System.out.println("non static method disp2");
    }
}
public static void main(String[] args) {
       
    Demo d =new Demo();
    Demo.disp1();
    d.disp2();
    
}
/*
}

class Demo{
int a;
static int b;

static void disp1(){
    
    System.out.println(a);
}

void disp2(){
    System.out.println(a);
}
}