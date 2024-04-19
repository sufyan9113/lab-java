package DSA.Array2D;
import java.util.Arrays;

public class Rotate2
{
  public static void main(String[] args) 
  {
    int[][] a={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

    int n=a.length;
    int m=a[0].length;

    for(int i=0; i<n; i++)
    {
        for(int j=i; j<m; j++)
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
        int up=0;
        int down=n-1;

        while(up<down)
        {
            int temp=a[i][up];
            a[i][up]=a[i][down];
            a[i][down]=temp;
            up++;
            down--;
        }
    }

    for(var ele:a)
    {
        System.out.println(Arrays.toString(ele));
    }
  }  
}
