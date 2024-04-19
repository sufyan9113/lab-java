package Objects;

class Cal{
 /*   public void add(int a){
        System.out.println("int " +a);
    }
    */
   /* public void add(byte a){
        System.out.println("byte " +a);
    }
    */
  /*  public void add(short a){
        System.out.println("short " +a);
    }
    */
  /*   public void add(char a){
        System.out.println("char " +a);
    }
    */
    /*
    public void add(long a){
        System.out.println("long " +a);
    }
    */
   /* public void add(float a){
        System.out.println("float " +a);
    }*/
    public void add(double...a){
        System.out.println("Var-args "+a[0]+" "+a[1]);
    }
    public void add(int a, int b){
        System.out.println("int " +a +" "+b);
    }
    
    /*
    public void add(double a){
        System.out.println("double " +a);
    }
    */

}
class Overloading{
    public static void main(String[]args){
        Cal a1= new Cal();
      //  byte b=10;
       // double d=5.5;
   
        a1.add(10,15);
      //  a1.add();

        /* 
        int r1= a1.add('a','b');
        int r2=a1.add(4,5,6);
        int r3= a1.add(4,5,6,7);
        double r4=a1.add('c','a');
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

        */
    }
}

