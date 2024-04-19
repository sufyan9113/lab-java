package Programs.API;


import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer
{
    int age();
    String country();
    int num()default 9;
}

@CricketPlayer(age=28, country="india")
class ViratKohli
{
    private int inning;
    private int run;

    public void setInning(int inning)
    {
        this.inning=inning;
    }
    public void setRun(int run)
    {
        this.run=run;
    }
    public int getInning()
    {
        return inning;
    }
    public int getRun()
    {
        return run;
    }
}

class CustomeAnno
{
    public static void main(String[] args) 
    {
        ViratKohli v=new ViratKohli();
        v.setInning(100);
        v.setRun(5000);
        System.out.println(v.getInning());
        System.out.println(v.getRun());

        Class cl=v.getClass();

        Annotation an=cl.getAnnotation(CricketPlayer.class);

        CricketPlayer cp=(CricketPlayer)an;

        int age=cp.age();
        String country=cp.country();

        System.out.println(age);
        System.out.println(country);
    }
}
       


