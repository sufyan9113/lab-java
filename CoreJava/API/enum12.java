package Programs.API;

enum Week
{
    MON,TUE,WED,THU,FRI,SAT,SUN;
}

public class enum12
{
    enum Direction
    {
        EAST,WEST,NORTH,SOUTH;
    }
    public static void main(String[] args) 
    {

        Week d1=Week.MON;

        System.out.println(d1);
        System.out.println(d1.ordinal());

        Week[]d=d1.values();

        for(Week w:d)
        {
            System.out.println(w+": "+w.ordinal());
        }

        Direction dr=Direction.NORTH;
        System.out.println(dr);
        System.out.println(dr.ordinal());

        Direction[] dar=dr.values();

        for(Direction dd:dar)
        {
            System.out.println(dd+"  :"+dd.ordinal());
        }

    }
}
