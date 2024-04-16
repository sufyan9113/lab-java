package Practice.DSA;
import java.util.Arrays;

public class ExamSort4 
{
    public static void main(String[] args) 
    {
        int[]a={3,8,6,7,5,9,10};

        sort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void sort(int[]a)
    {
        int x=-1, y=-1;

        for(int i=1; i<a.length;i++)
        {
            if(a[i-1]>a[i])
            {
                if(x==-1)
                {
                    x=i-1;
                    y=i;
                }
                else
                {
                    y=i;
                }
            }
        }

        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }
}
