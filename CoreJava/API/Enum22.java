package Programs.API;



enum Result
{
    PASS,FAIL,NR;

    int marks;

    Result()
    {
        System.out.println("in enum constructor");
    }

    public void setMarks(int marks)
    {
        this.marks=marks;
    }

    public int getMarks()
    {
        return marks;
    }
}
public class Enum22 
{

    public static void main(String[] args) 
    {
        Result r1=Result.PASS;

      //  r1.setMarks(10);

        System.out.println(r1+": "+r1.getMarks());

        Result r2=Result.FAIL;
       // r2.setMarks(5);
        System.out.println(r2+": "+r2.getMarks());

        Result r3=Result.NR;
        r3.setMarks(25);
        System.out.println(r3+": "+r3.getMarks());
        
    }
}
