package Practice.DSA;
public class RepeatNum 
{
    public static void main(String[] args) 
    {
        int[] a={1,5,3,4,6,3,4};
        int ans=repeatNum(a);
        System.out.println(ans);
    } 

    static int repeatNum(int[]a)
    {
       
        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    return a[i];
                    
                } 
            }
        }
        return -1;
        
       
    }
}
