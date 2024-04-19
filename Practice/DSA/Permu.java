package Practice.DSA;
public class Permu 
{
    public static void main(String[] args) 
    {
        String s="abc";
        permut(s,0);
    }
    public static void permut(String s,int ind)
    {
        if(ind==s.length()-1)
        {
            System.out.println(s);
            
        }

        for(int i=ind; i<s.length(); i++)
        {
            s=swap(s,i,ind);
            permut(s, ind+1);
            s=swap(s,i,ind);
            
        }
    }
    public static String swap(String s,int i, int j)
    {
        char[] c=s.toCharArray();
        char temp=c[i];
        c[i]=c[j];
        c[j]=temp;

        return s.valueOf(c);

    }
}
