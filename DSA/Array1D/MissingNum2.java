package DSA.Array1D;

public class MissingNum2 
{
    public static void main(String[] args) 
    {
       int[] a={1,2,3,4,5,7};
       int n=a.length;
       int total=1;

       for(int i=2; i<n; i++)
       {
        total=total-a[i-2];
       }
       System.out.println(total);
    }
}
