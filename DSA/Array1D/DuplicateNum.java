package DSA.Array1D;

public class DuplicateNum 
{
    public static void main(String[] args) {
        
    
    int[] a={1,2,2,3,2,4,5,8,9,4,5,8,6,7};

    int n=a.length;
    int count=0;

    for(int i=0; i<n; i++)
    {
        for(int j=i+1; j<n; j++)
        {
            if(a[i]==a[j])
            {
                System.out.println("duplicate element: "+a[i]);
                count++;
            }
            
        }
    }
    if(count==0)
    {
        System.out.println("no duplicates");
    }
}
}
