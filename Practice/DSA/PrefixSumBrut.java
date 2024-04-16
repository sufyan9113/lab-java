package Practice.DSA;
import java.util.*;
public class PrefixSumBrut 
{
    public static void main(String[] args) 
    {
        int[][] a={{1,1,1},{1,1,1},{1,1,1}};
        int n=a.length;
        int m=a[0].length;

        Scanner s=new Scanner(System.in);
        int sum=0;
        int r1,r2,c1,c2;

        System.out.println("enter value of r1");
        r1=s.nextInt();
        System.out.println("enter value of c1");
        c1=s.nextInt();
        System.out.println("enter value of r2");
        r2=s.nextInt();
        System.out.println("enter value of c2");
        c2=s.nextInt();

        for(int i=r1; i<=r2; i++)
        {
            for(int j=c1; j<=c2; j++)
            {
                sum+=a[i][j];
            }
        }
        System.out.println(sum);
    }
    
}
