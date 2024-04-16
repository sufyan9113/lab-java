package DSA.Recursion;

public class MazePath 
{
    public static void main(String[] args) 
    {
        getPath(0,0,2,2," ");
    }
    public static void getPath(int cr, int cc, int dr,int dc,String ans)
    {
        if(cr==dr && cc==dc)
        {
            System.out.println(ans);
            return;
        }
        if(cr>dr || cc>dc)
        {
            return;
        }
        getPath(cr, cc+1, dr, dc, ans+'H'+" ");
        getPath(cr+1,cc, dr, dc, ans+'V'+" ");
    }
}
