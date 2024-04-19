package DSA.Backtracking;

public class Permutation 
{
    public static void main(String[] args) 
    {
        String s="ABC";
        
        permutation(s, 0);
    }

    public static void permutation(String s, int ind)
    {
        int n=s.length();
        if(ind==n-1)
        {
            System.out.println(s);
        }

        for(int i=ind; i<n; i++)
        {
            s=swap(s,ind,i);
            permutation(s, ind+1);
            swap(s, ind, i);
            
        }
        
    }

    public static String swap(String s,int i,int j)
    {
        char[] c=s.toCharArray();
        char temp=c[i];
        c[i]=c[j];
        c[j]=temp;

        return s.valueOf(c);

    }
}
