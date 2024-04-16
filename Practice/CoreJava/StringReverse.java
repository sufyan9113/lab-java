package Practice.CoreJava;

import java.util.*;
public class StringReverse 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        String s1;
        String s2="";

        System.out.println("enter string value u want to check for duplicate");
        s1=s.next();

        for(int i=0; i<s1.length(); i++)
        {
            boolean duplicate=false;
            for(int j=i+1; j<s1.length(); j++ )
            {
                if(s1.charAt(i)==s1.charAt(j))
                {
                    System.out.println(s1.charAt(i));
                    duplicate=true;
                    break;
                    
                }
            }
            if(!duplicate){
                s2=s2+s1.charAt(i);
            }
        }
        

       System.out.println(s2);
    }
}
