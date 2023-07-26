package Static;



public class Method 
{
    static int age;
    static int num=10;

    

    static void display()
    {
        System.out.println("Static Method");
    }

    public static void main(String[]args)
    {
        System.out.println("Main Method");

        display();
    }

    static
    {
        age=18;
        num=20;
        System.out.println("Static Variable");
    }
    static
    {
        System.out.println("Static Block");
    }

    


}
