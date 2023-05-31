package MultiThreading;

import java.util.Scanner;

public class LineOfExecution 
{
    public static void main(String[]args)
    {
        System.out.println("calculation starts");
        System.out.println("******************");
        System.out.println("enter 1st num");
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        System.out.println("enter 2nd num");
        int n2=s.nextInt();

        int res=n1+n2;
        System.out.println(res);

        System.out.println("task completed");
        System.out.println("******************");

        for(int i=0; i<4; i++)
        {
            System.out.println("*");
        }

        System.out.println("task completed");
        System.out.println("******************");

        for(int i=0; i<5; i++)
        {
            System.out.println("*");
        }

        System.out.println("task completed");
        System.out.println("******************");




    }

}
