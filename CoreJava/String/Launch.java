package String;
import java.util.*;


public class Launch 
{
    public static void main(String[] args) 
    {
        String input;
        int alphabet=0;
        int nums=0; 
        int specialCharacter=0;

        Scanner s=new Scanner(System.in);
        System.out.println("enter your input");
        
        input=s.next();

        for(int i=0; i<input.length(); i++)
        {
            if(input.charAt(i)>='a' && input.charAt(i)<='z')
            {
                alphabet++;
            }
            else if(input.charAt(i)>='0' && input.charAt(i)<='9')
            {
                nums++;
            }
            else
            {
                specialCharacter++;
            }

            }
            System.out.println("alphabet = "+ alphabet+ " nums = "+nums+" special character= "+specialCharacter);
        }


    }

