package Programs.API;
import java.time.*;


public class JodaAPI 
{
    public static void main(String[] args)
    {
        LocalDate d=LocalDate.now();

        int day=d.getDayOfMonth();
        int month=d.getMonthValue();
        int year=d.getYear();

        System.out.println(day+"/"+month+"/"+year);

        LocalTime t=LocalTime.now();
        int hour=t.getHour();
        int minute=t.getMinute();
        int second=t.getSecond();
        int nano=t.getNano();

        System.out.println(hour+":"+minute+":"+second+":"+nano);
       
    } 
}
