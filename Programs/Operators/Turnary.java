package Operators;
public class Turnary {

    public static void main(String[]args){

        int a=30;
        int b=10;
        int c=20;

        int r1=a>b?a:b;
        System.out.println(r1);
        String r2=a>b?"a is Greater":"b is Greater";
        System.out.println(r2);
        
        int r3=a>b? a>c?a:c : b>c? b:c;
        System.out.println(r3);
    
    if(a>b){
        if(a>c){
            System.out.println(a);
        }
        else{
            System.out.println(c);
        }
    }
    else{
        if(b>c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }

    }
}
}
