package UserInput;
import java.util.Scanner;

public class UserInput {
    public static void main(String[]args){
    int num;
    double d;
    String name;
    char c;
    Scanner in=new Scanner(System.in);
    System.out.println ("enter number");
    num= in.nextInt();
    System.out.println ("entered number is "+num);

    System.out.println ("enter double number");
    d= in.nextDouble();
    System.out.println ("entered number is "+d);

    System.out.println ("enter name");
    name= in.next();
    System.out.println ("entered name is "+name);

    System.out.println ("enter character");
    c= in.next(). charAt(0);
    System.out.println ("entered character is "+c);





   

    }
    
}
