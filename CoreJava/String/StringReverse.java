package String;
import java.util.*;

public class StringReverse 
{
public static void main(String[] args) 
{
    //case 4
    String s1="pwskill java";
    String s2="";

    
    String[] s= s1.split(" ");

    for(String s3:s)
   
    {
    for(int i=s3.length()-1; i>=0;i--)
    {
        s2=s2+s3.charAt(i);
    }
    s2=s2+" ";
}
    System.out.println(s2);
    
    /*
    //case 3
    String s1="pwskill java";
    String s2="";
    

    for(int i=s1.length()-1; i>=0; i--)
    {
        s2=s2+s1.charAt(i);
    }
    System.out.println(s2);
    

    //case 2
 /* 
    String s1="pwskill java";
    String s2="";
    String[] s=s1.split(" ");
    for(int i=s.length-1; i>=0;i--)
    {
        s2=s2+s[i]+" ";
    }
    System.out.println(s2);
    //case 1 
    /*
    Scanner s= new Scanner(System.in);
    System.out.println("enter String name u wat to reverse");
    String s1=s.next();
    String s2="";

    for(int i=s1.length()-1; i>=0;i--)
    {
        s2=s2+s1.charAt(i);
    }
    System.out.println(s2);
    */
}
}