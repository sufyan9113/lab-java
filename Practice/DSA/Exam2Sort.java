package Practice.DSA;
import java.util.Arrays;

public class Exam2Sort 
{
    public static void main(String[] args) 
    {
     
        String[] s={"kiwi","banana","apple","papaya","mango"};

        int n=s.length;

        for(int i=0; i<n; i++)
        {
            int min=i;
            for(int j=i+1; j<n; j++)
            {
                if(s[j].compareTo(s[min])<0)
                {
                    min=j;
                }
                if(min!=i)
                {
                    String temp=s[min];
                    s[min]=s[i];
                    s[i]=temp;
                }
            }
        }
        
        System.out.println(Arrays.toString(s));
    }
}
