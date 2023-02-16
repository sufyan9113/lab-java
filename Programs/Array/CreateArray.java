package Array;
import java.util.*;

public class CreateArray {

    public static void main(String[]args)
    {
        int i,j,row,column;
        Scanner s=new Scanner(System.in);
        System.out.println("enter number of rows");
        row= s.nextInt();
        System.out.println("enter number of column");
        column= s.nextInt();


        int[][] a;
        a=new int[row][column];
        
       for( i=0; i<row; i++)
        {
            for( j=0; j<column; j++)
            {
                System.out.println("enter value of "+i+" "+j);
                a[i][j]=s.nextInt();
            
            }
        
        }

        for( i=0; i<row; i++)
        {
            for( j=0; j<column; j++)
            {
                System.out.println(" value of "+i+" "+j + " = "+ a[i][j]);
            }
            System.out.println();
        }


    }
    
}
