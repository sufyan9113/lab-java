import java.util.Arrays;

public class InsertionSort 
{
    public static void main(String[] args) 
    {
        int[] a={20,40,11,19,27,45};
        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void insertionSort(int[]a)
    {
        int n=a.length;

        for(int i=1; i<n; i++)
        {
            
            int j=i;
            while(j>0 && a[j]<a[j-1])
            {
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j--;
               
            }
            
    }
}
}