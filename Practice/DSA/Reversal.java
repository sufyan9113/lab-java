package Practice.DSA;


class Reversal
{
    public static void main(String[] args) 
    {
        int[] a={1,2,3,4,5,6,7};
        int n=a.length;

        int temp=0;
        for(int i=0; i<n/2; i++)
        {   
            temp=a[i];
            a[i]=a[n-1-i];
            a[n-1-i]=temp;


        }

        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
}