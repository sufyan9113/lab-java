package Programs.API;

public class DateTime
{
    public static void main(String[] args) 
    {
        
        java.util.Date d1=new java.util.Date();

        System.out.println(d1);

        long time=d1.getTime();

        java.sql.Date d2=new java.sql.Date(time);
        System.out.println(d2);

    }    
}
