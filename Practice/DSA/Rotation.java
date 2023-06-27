package Practice.DSA;
import java.util.*;
public class Rotation
{
    
    public static void main(String[] args) 
    {
         
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        int n=a.length;
        int m=a[0].length;

        for(int i=0; i<n; i++)
        {
            for(int j=i; j<m ; j++)
            {
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        for(var ele:a)
        {
            System.out.println(Arrays.toString(ele));
        }
        System.out.println();

        for(int i=0; i<n; i++)
        {
            int li=0;
            int ri=n-1;

            while(li<ri)
            {
                int temp=a[i][li];
                a[i][li]=a[i][ri];
                a[i][ri]=temp;
                li++;
                ri--;
            }
        }
        for(var ele:a)
        {
            System.out.println(Arrays.toString(ele));
        }
       
    }
}
