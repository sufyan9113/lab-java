package DSA.Array1D;

class PalindromAppro1 
{
    public static void main(String[] args) 
    {
        int[] a={1,2,3,2,1,};
        int n=a.length;
        int flag=0;

        int[] b= new int[n];

        for(int i=n-1; i>=0; i--)
        {
            b[i]=a[n-i-1];
        }

        for(int i=0; i<n; i++)
        {
            if(b[i]!=a[i])
            {
                flag=1;
                System.out.println("not palindrom");
                break;
            }
        }

        if(flag==0)
        {
            System.out.println("Palindrom");
        }
    }
}
