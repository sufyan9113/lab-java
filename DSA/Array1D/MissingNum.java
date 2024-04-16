package DSA.Array1D;

public class MissingNum 
{
    public static void main(String[] args) 
    {
        int[] a={1,2,3,4,5,7};
        int n=a.length;
        int sumOfNaturalNum=0;
        int sumOfArrayElement=0;
        int missingNum=0;

        sumOfNaturalNum=((n+1)*(n+2))/2;

        for(int i=0; i<n; i++)
        {
            sumOfArrayElement+=a[i];
        }

        missingNum=sumOfNaturalNum-sumOfArrayElement;

        System.out.println("Missing num is = "+missingNum);



}
}

