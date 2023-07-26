package Practice.DSA;

public class UniqueNum 
{
    public static void main(String[] args) 
    {
        int[] a={1,2,3,4,2,1,3};
        int n=a.length;
    

        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                
                if(a[i]==a[j])
                {
                    a[i]=0;
                    a[j]=0;
                  break;

                }
            }
            
        }
        
        for(int i=0; i<n; i++)
        {
            if(a[i]>0)
            {
                System.out.println(a[i]);
            }
        }


    }
}
