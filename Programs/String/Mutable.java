package String;

public class Mutable 
{
    public static void main(String[] args) 
    {
        StringBuffer s1= new StringBuffer("java");
        System.out.println(s1.charAt(1));
        System.out.println(s1.indexOf("v"));
        s1.setCharAt(1, 'A');;
        System.out.println(s1);
        System.out.println(s1.reverse());
        /*StringBuilder s1= new StringBuilder(100);
        System.out.println(s1.capacity());
        s1.append("java");
        s1.trimToSize();
        System.out.println(s1.capacity());

       /* StringBuffer s1= new StringBuffer();
        System.out.println(s1.capacity());
        s1.append("abcdefghijklmnop");
        System.out.println(s1.capacity());
        s1.append("a");
        System.out.println(s1.capacity());

        /*StringBuffer s1= new StringBuffer("java");
        System.out.println(s1.capacity());

        StringBuilder s2= new StringBuilder("java");
        System.out.println(s2.capacity());
      /*
        StringBuffer s1= new StringBuffer();
        System.out.println(s1.capacity());

        StringBuilder s2= new StringBuilder();
        System.out.println(s2.capacity());
      

      /* final StringBuffer s= new StringBuffer("java");
        s.append("skill");
        System.out.println(s);

        s= new StringBuffer("pw");
        System.out.println(s);

       /* StringBuilder s1= new StringBuilder("java");
        s1.append("PW SKILL");
        System.out.println(s1);

        StringBuffer s2= new StringBuffer("java");
        s2.append("PW SKILL");

        System.out.println(s2);
        */
    }
   

}
