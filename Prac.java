public class Prac 
{
    static int age;
    int num;

static {
    System.out.println("static block");

}

static{
    age=18;
    System.out.println(age+ ": " + "static block initilization");
}

 void disp(){
    System.out.println(age);
}

    public static void main(String[] args) 
    {
    System.out.println("main method");
    System.out.println(age);
    Prac p= new Prac();
    p.disp();
   
    }
}


