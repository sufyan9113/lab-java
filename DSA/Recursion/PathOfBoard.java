package DSA.Recursion;

public class PathOfBoard 
{
    public static void main(String[] args) 
    {
        board(0,9," ");
    }
    public static void board(int cp,int des,String path)
    {
        if(cp==des)
        {
            System.out.println(path+" ");
            return;
        }
        if(cp>des)
        {
            return;
        }
        board(cp+1,des,path+1);
        board(cp+2,des,path+2);
        board(cp+3,des,path+3);
        board(cp+4,des,path+4);
        board(cp+5,des,path+5);
        board(cp+6,des,path+6);

    }
}
