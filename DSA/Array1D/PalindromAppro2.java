package DSA.Array1D;

public class PalindromAppro2 
{
    public static void main(String[] args) 
    {
        int[] a={1,2,3,2,1};
        int n=a.length;
        int flag=0;

        for(int i=0; i<n/2; i++)
        {
            if(a[i]!=a[n-1-i])
            {
                flag=1;
                System.out.println("not palindrom");
                break;
            }
        }

        if(flag==0)
        {
            System.out.println("palindrom");
        }
    }
}
