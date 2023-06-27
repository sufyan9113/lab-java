package Practice.DSA;

public class MissingNum
{
    public static void main(String[] args)
    {
        int[] a={1,2,3,4,6};

        int n=a.length;
        int loopSum=0;


        int naturalSum=(n+1)*(n+2)/2;

        for(int i=0;i<n;i++)
        {
            loopSum+=a[i];
        }

        int misNum=naturalSum-loopSum;
        System.out.println(misNum +" : missing num");
    }
    
}
