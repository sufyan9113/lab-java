package Practice.CoreJava;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
class APIPrac
{
   public static void main(String[]args)
   {   

    List<Integer> l=Arrays.asList(1,2,5,3,56,24,25,34,89);

   
    

    Stream<Integer>s1=l.stream();
    Predicate<Integer>p=new Predicate<Integer>() {
      public boolean test(Integer i)
      {
        if(i%2==0)
        {
          return true;
        }
        else
        {
          return false;
        }
      }
    };
    
    Stream<Integer>s2=s1.filter(p);

    Function f=new Function<Integer,Integer>()
    {
      public Integer apply(Integer i)
      {
        return i*2;
      }

    };
    
    Stream<Integer>s3=s2.map(f);
    Stream<Integer>s4=s3.sorted();

    Consumer<Integer>c=new Consumer<Integer>()
    {
      public void accept(Integer i)
      {
        System.out.println(i);
      }
    };
    
   s4.forEach(c);


/* 
import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface Cricket_Player
{
  int age();
  String country()default"india";
}

@Cricket_Player(age=28)
class SachinTendulkar
{
  private int inn;
  private int run;

  public void setInn(int inn)
  {
    this.inn=inn;
  }
  public void setRun(int run)
  {
    this.run=run;
  }
  public int getInn()
  {
    return inn;
  }
  public int getRun()
  {
    return run;
  }
}
     

  class APIPrac
{
   public static void main(String[]args)
   {   
    SachinTendulkar s=new SachinTendulkar();

    Class c=s.getClass();

    Annotation a=c.getAnnotation(Cricket_Player.class);

    Cricket_Player st=(Cricket_Player)a;

    int age=st.age();
    String country=st.country();

    System.out.println(age);
    System.out.println(country);
    

/* 
class Aero
{
    public void flying()
    {
      System.out.println("Aeroplane is flying");
    }
}
class Cargo extends Aero
{ 

  @Override
  public void flying()
    {
      System.out.println("cargo is flying");
    }

}
class APIPrac
{
   public static void main(String[]args)
   {
      Aero a= new Cargo();

      a.flying();

/*
class APIPrac
{
  enum Result
  {
    PASS,FAIL,ABSENT,NO_RESULT;
  }
   public static void main(String[]args)
   {

      Result r=Result.NO_RESULT;

    switch(r)
    {
      case PASS: System.out.println("PASS");
      break;
      case FAIL: System.out.println("FAIL");
      break;
      case ABSENT:System.out.println("ABSENT");
      break;
      default : System.out.println("NO RESULT");
      

    }
    
/* 
 enum Result
 {
   
   PASS,FAIL,ABSENT;
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
class APIPrac
{
 
   public static void main(String[]args)
   {

    Result r1=Result.PASS;
    Result r2=Result.FAIL;
    Result r3=Result.ABSENT;

    r1.setMarks(50);
    System.out.println(r1.getMarks());

    System.out.println(r2.getMarks());
    System.out.println(r3.getMarks());

    r2.setMarks(15);
    r3.setMarks(0);

    System.out.println(r2.getMarks());
    System.out.println(r3.getMarks());


    

/* 
enum Days
{
    MON,TUE,WED,THU,FRI,SAT,SUN;
}
 lass APIPrac
{

  enum Colour
  {
    RED,BLUE,GREEN,BLACK;
  }
   public static void main(String[]args)
   {

    Colour c=Colour.RED;
    System.out.println(c);
   
      Days d=Days.MON;

      System.out.println(d);

      Days[] ar=d.values();

      for(Days d1:ar)
      {
        System.out.println(d1+": "+d1.ordinal());
      }


      /*
      List<Integer>l=Arrays.asList(2,3,4,5,8,9,10,6);

      Stream<Integer>s=l.stream().filter(i->i%2==0).sorted().map(i->i*2);

      s.forEach(i->System.out.println(i));

/* 
      Predicate<Integer>p=new Predicate<Integer>() 
      {
        public boolean test(Integer i)
        {
          if(i%2==0)
          {
            return true;
          }
          else
          {
            return false;
          }
        }
      };

      Stream<Integer>filt=s.filter(i->i%2==0);

      Stream<Integer>sort=filt.sorted();

      Function<Integer,Integer>func=new Function<Integer,Integer>()
      {
        public Integer apply(Integer i)
        {
          return i*2;
        }
      };
      Stream<Integer>map=sort.map(i->i*2);

       Consumer<Integer>c=new Consumer<Integer>()
      {
        public void accept(Integer i)
        {
          System.out.println(i);
        }
      };

        map.forEach(i->System.out.println(i));
      
/* 
      List<Integer>l=Arrays.asList(1,2,3,4,5,6);

      Stream<Integer>s=l.stream();

      s.forEach(i->System.out.println(i));

      /* 
      
        ArrayList<Integer> a=new ArrayList<Integer>();

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        System.out.println(a);

        a.forEach(i->System.out.println(i));

        System.out.println("******************");


        List b= Arrays.asList(1,2,3,4,5,"sufyan");
        
        /*for(Integer i:b)
        {
          System.out.println(i);
        }


  
        Consumer<Integer> c=i->System.out.println(i);
          
        
        b.forEach(i->System.out.println(i));
        

        /* 
        LocalDate d=LocalDate.now();
        System.out.println(d);

        int month=d.getMonthValue();
        int date=d.getDayOfMonth();
        int year=d.getYear();

        System.out.println(date+"/"+month+"/"+year);

        LocalTime t=LocalTime.now();
        System.out.println(t);

        int hour=t.getHour();
        int minutes=t.getMinute();
        int second=t.getSecond();
        int nano=t.getNano();

        System.out.println(hour+":"+minutes+":"+second+":"+nano);

      
      /*  Date d=new Date();
        System.out.println(d);

       long t= d.getTime();

        java.sql.Date d1=new java.sql.Date(t);

        System.out.println(d1);
*/


        
    }
}