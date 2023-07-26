package Practice.DSA;
import java.util.Arrays;

public class SelectSort 
{
    public static void main(String[] args) 
    {
        int[]a ={20,50,10,15,17};
        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void selectionSort(int[]a)
    {
        int n=a.length;
        
        for(int i=0; i<n; i++)
        {
            int minInd=i;
            for(int j=i+1; j<n; j++)
            {
                if(a[j]<a[minInd])
                {
                    minInd=j;
                }
            }
            if(minInd!=i)
            {
                int temp=a[minInd];
                a[minInd]=a[i];
                a[i]=temp;
            }
        }
    }

    
    
}


