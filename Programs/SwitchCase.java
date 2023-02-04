 import java.util.Scanner;
 class SwitchCase {

        public static void main(String[]args){
            while(true){
            int menu;
            System.out.println("choose below menu");
            System.out.println("1.for addion");
            System.out.println("2.for subtraction");
            System.out.println("3.for multiplication");
            System.out.println("4.for average");
            Scanner in= new Scanner(System.in);
            menu= in. nextInt();
            
            switch(menu){

                case 1 : 
                int a,b,add;
                System.out.println("enter two number");
                a= in.nextInt();
                b= in.nextInt();
                add=a+b;
                System.out.println("the addition of "+a+" and "+b+ " = "+add);
                break;

                case 2 : 
                int c,d,sub;
                System.out.println("enter two number");
                c= in.nextInt();
                d= in.nextInt();
                sub=c-d;
                System.out.println("the subtraction of "+c+" and "+d+ " = "+sub);
                break;

                case 3 : 
                int e,f,mul;
                System.out.println("enter two number");
                e= in.nextInt();
                f= in.nextInt();
                mul=e*f;
                System.out.println("the multiplication of "+e+" and "+f+ " = "+mul);
                break;

                case 4 : 
                int g,h;
                float avg;
                System.out.println("enter two number");
                g= in.nextInt();
                h= in.nextInt();
                avg=(float)(g+h)/2;
                System.out.println("the avg of "+g+" and "+h+ " = "+avg);
                break;

                default:
                {
                    System.out.println("invalid enter num between 1 to 4");
                }
            }

            }
        
        }
    /*  public static void main(String[]args){
        int review=1;

        switch(review){
            case 1:
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2");
                break;
            case 3:
                System.out.println("case 3");
                break;
            case 4:
                System.out.println("case 4");
                break;
            case 5:
                System.out.println("case 5");
                break;

            default:
            System.out.println("not valid");
        }
        */
    
    
}
