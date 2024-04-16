package Practice.CoreJava;


public class Prac 
{
    public static void main(String[] args) 
    {
        
       String s1 ="pwskill java";
       String s2= " ";
       String[] s= s1.split(" ");

       for(String s4: s)
       {
        for(int i=s4.length()-1; i>=0 ; i--)
        {
            s2=s2+s4.charAt(i);
        }
        s2=s2+" ";
       }
       System.out.println(s2);
     
       

    
     
    
       
    
}
}
    

