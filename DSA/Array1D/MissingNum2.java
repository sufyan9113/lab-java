package DSA.Array1D;

public class MissingNum2 
{
    public static void main(String[] args) 
    {
       int[] a={1,2,3,5,6};
       int n=a.length;
       int total=1;
       
       
       for(int i=2; i<n+1; i++)
       {
        total+=i;
        total-=a[i-2];

       }
       System.out.println(total);


    }
}
