package Practice.DSA;
public class Board1D 
{
    public static void main(String[] args) 
    {
        getPath1(0, 9, " ");
    }

    public static void getPath1(int cp,int ds,String ans)
    {
        if(cp==ds)
        {
            System.out.println(ans);
            return;
        }
        if(cp>ds)
        {
            return;
        }
        getPath1(cp+1, ds, ans+1);
        getPath1(cp+2, ds, ans+2);
        getPath1(cp+3, ds, ans+3);
        getPath1(cp+4, ds, ans+4);
        getPath1(cp+5, ds, ans+5);
        getPath1(cp+6, ds, ans+6);
    }
}
