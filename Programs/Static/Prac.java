public class Prac 
{
    static int age;

static {
    System.out.println("static block");

}

static{
    age=18;
    System.out.println(age+ ": " + "static block initilization");

}



    public static void main(String[] args) 
    {
    System.out.println("main method");
    Disp.disp();
    }
}

class Disp{
     static void disp(){
        System.out.println("static method");
    }
}
