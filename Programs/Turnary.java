public class Turnary {

    public static void main(String[]args){

        int a=10;
        int b=5;
        int c=2;
       
       int d= a<b?a:b;
        System.out.println(d);
        String result= a<b?"a is less": "b is less";
        System.out.println(result);

        int num= a<b? (a<c? a:c) : b<c? b:c;
        System.out.println(num);

        if(a<b){
            if(a<c){
                System.out.println(a);
            }
            else{
                System.out.println(c);
            }

        }
        else{
            if(b<c){
                System.out.println(b);

            }
            else{
                System.out.println(c);
            }

        }
    
    }
}
