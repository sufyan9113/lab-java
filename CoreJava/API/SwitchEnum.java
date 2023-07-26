package Programs.API;

public class SwitchEnum 
{
    enum Result 
    {
        PASS,FAIL,NR;
    }
    public static void main(String[] args) 
    {
        Result r=Result.NR;

        switch(r)
        {
        case PASS: System.out.println(r);
        break;

        case FAIL: System.out.println(r);
        break;

        case NR: System.out.println(r);

        break;
        }

      

    }
}
