package Practice.DSA;
import java.util.Arrays;

class BubbleSort
{
    public static void main(String[] args) 
    {
        int[] a={50,60,40,10,20,5};

        bubbleSort(a);
        System.out.println(Arrays.toString(a));
        
    }
    public static void bubbleSort(int[]a)

    {
        int n=a.length;
        for(int i=0; i<n; i++)
        {
            boolean swap=false;
            for(int j=0; j<n-i-1; j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swap=true;
                }
            }
            if(!swap)
            {
                break;
            }
        }
    }
}