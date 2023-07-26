package Practice.DSA;
import java.util.*;
class ExamSort
{
    public static void main(String[] args) 
    {
        int[] a={0,1,10,5,0,4};
        int n=a.length;

        for(int i=0; i<n; i++)
        {
            boolean swap=false;
            for(int j=0; j<n-i-1; j++)
            {
                if(a[j]==0 && a[j+1]!=0)
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swap=true;

                }
            }
            if(swap==false)
            {
                break;
            }
           
        }
        System.out.println(Arrays.toString(a));
    }
    
}