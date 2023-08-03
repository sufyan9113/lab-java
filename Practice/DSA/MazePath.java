package Practice.DSA;
public class MazePath 
{
    public static void main(String[] args) 
    {
        getPathMaze(0, 0, 2, 2, " ");
    }
    public static void getPathMaze(int cr,int cc, int dr,int dc,String ans)
    {
        if(cr==dr&& cc==dc)
        {
            System.out.println(ans);
            return;
        }
        if(cr>dr || cc>dc)
        {
            return;
        }
        getPathMaze(cr, cc+1, dr, dc, ans+"H ");
        getPathMaze(cr+1, cc, dr, dc, ans+"V ");
    }
}
