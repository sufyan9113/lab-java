public class Pangram 
{
    public static void main(String[] args) 
    {
        boolean flag=false;
        String s1="THE QUICK BROWN FOX JUMPS OVER THE LZY DOG";

        s1=s1.replace(" ", "");
   

        char[] c=s1.toCharArray();

        int[] a=new int[26];

        for(int i=0; i<c.length; i++){

            a[c[i]-65]++;
        }
        for(int i=0; i<a.length; i++)
        {
            if(a[i]==0)
            {
                System.out.println("Not Pangram");
                flag=true;

            }
        }

        if(flag==false){
            System.out.println(" Pangram");
        }
        
    }
    
}
