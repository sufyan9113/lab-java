 package Loops;
 import java.util.Scanner;

public class Triangle {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter size of square");
        int n= s.nextInt();
       int k;
       
        for(int i=1; i<=n; i++){
           
         k=i<=(n+1)/2?i: n+1-i;
            for(int j=1; j<=n; j++){
                if(j>=(n+1)/2+1-k && j<=(n+1)/2-1+k ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
