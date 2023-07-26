package Objects;
import java.util.Scanner;

public class Test {
    public static void main(String[]args){
        int a,b,sum,sub,mul,remain;
        float div;

        Calculator cal=new Calculator();
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter number 1");
        a= scan.nextInt();
        System.out.println("Enter number 2");
        b= scan.nextInt();

        sum=cal.sum(a, b);
        sub=cal.sub(a, b);
        mul=cal.mul(a, b);
        div=cal.div(a, b);
        remain=cal.remain(a,b);
        System.out.println("sum a+b = "+sum);
        System.out.println("subtraction a-b = "+sub);
        System.out.println("multiplication a*b = "+mul);
        System.out.println("division a/b = "+ div);
        System.out.println("remainder a%b = "+remain);


    }
    
}

class Calculator
{
    int result;
    float result1;
    int sum(int a, int b)
    {
        result=a+b;
        return result;
    }

    int sub(int a, int b)
    {
        result =a-b;
        return result;
    }

    int mul(int a, int b)
    {
        result =a*b;
        return result;
    }
    float div(int a, int b)
    {
        result1 = (float) a/b;
        return result1;
    }
    int remain(int a, int b)
    {
        result =a%b;
        return result;
    }
}
