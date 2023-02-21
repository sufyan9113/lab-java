package String;

public class Pangram 
{
    public static void main(String[] args) 
    {
        String s= "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        
        boolean flag=false;

        s=s.replace(" ", "");

        char[] c= s.toCharArray();

        int[] a=new int[26];

        for(int i=0; i<c.length; i++){
            a[c[i]-65]++;
        }

        for( int i=0; i<a.length;i++)
        {
            if(a[i]==0)
            {
                System.out.println("Not Pangram");
                flag =true;
            }
        }
        if(flag==false)
        {
            System.out.println("Pangram");
        }

        
    }
}
