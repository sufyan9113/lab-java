package Practice;
interface Run
{
     void show(int a,int b);
}


public class Revi2 
{
    public static void main(String[] args) 
    {
        Run obj= (a,b)->System.out.println("class implements");

       obj.show(10,15);
    }
}

/*interface Run
{
     void show();
}
public class Revi 
{
    public static void main(String[] args) 
    {
       Run a=new Run(){
         public void show()
        {
            System.out.println("class implements");
        }
    };

    a.show();
       
       
    }
}
/*class Run
{
    class Inner
    {
        public void show()
        {
            System.out.println("in inner class");
        }
    }
}



public class Revi 
{
    public static void main(String[] args) 
    {
       
        Run.Inner a =new Run().new Inner();
        a.show();
    }
}

/*interface A
{
    public void disp();

    public void show();
}

interface C
{
    public void print();
    
}
class B implements A,C
{

    public void disp()
    { 
        System.out.println("in disp");
    }

    public void show()
    {
        System.out.println("in show");
    }
    public void print()
    {
        System.out.println("in print");
    }
}

public class Revi 
{
    public static void main(String[] args) 
    {
    B b=new B();
    b.disp();
    b.show();
    b.print();

    
       
    }
}
/*class Sum
{
    public void sum(int ...a)
    {
        for(int x: a)
        {
            System.out.println(x);
        }
    }
}
public class Revi 
{
    public static void main(String[] args) 
    {
    
     

      Sum s=new Sum();

      s.sum(10,15,20,30);

       
   
    
       
    }
}
/* 
class Student
{
    Heart h;

    public void show()
    {
     System.out.println("show method");
    }

    public void run(Heart h)
    {
        h.disp();
    }
}
class Heart
{
    public void disp()
    {
        System.out.println("disp mehtod");
    }

}

public class Revi 
{
    public static void main(String[] args) 
    {
        Student s=new Student();
        Heart h=new Heart();
      
        s.show();
        s.run(h);
   
    
       
    }
}


/*

 final class Car
{
     public final void engineStart()
     {
        System.out.println("engine start");
}
}
class Swift extends Car
{
   
}
public class Revi 
{
    public static void main(String[] args) 
    {
    
     Swift c=new Swift();
     c.engineStart();
    
       
    }
}


/*
class Car
{
    public void engineStart()
    {
        System.out.println("engine starts");
    }

    public void carryPassenger()
    {
        System.out.println("carrying passenger");
    }
}

class Swift extends Car
{
    public void engineStart()
    {
        System.out.println("engine starts");
    }

    public void carryPassenger()
    {
        System.out.println("Swift carrying passenger");
    }

}

class Ertiga extends Car
{
    public void engineStart()
    {
        System.out.println("engine starts");
    }

    public void carryPassenger()
    {
        System.out.println("Ertiga carrying passenger");
    }
}
class Brezza extends Car
{
    public void engineStart()
    {
        System.out.println("engine starts");
    }

    public void carryPassenger()
    {
        System.out.println("Brezza carrying passenger");
    }
}

class Run
{
    public void load(Car c)
    {
        c.engineStart();
        c.carryPassenger();
    }
}
public class Revi 
{
    public static void main(String[] args) 
    {
      Car c1=new Swift();
      Car c2=new Ertiga();
      Car c3= new Brezza();

      Run r=new Run();
      r.load(c1);
      r.load(c2);
      r.load(c3);
    
       
    }
}

/* 
class Car
{
    Car()
    {
        System.out.println("in parent class constructor");
    }
}
class I20 extends Car
{
    I20()
    {
        
        System.out.println("in child class constructor");
    }
    I20(int a)
    {
        System.out.println("in child class parameter constructor");
    }
   
}
public class Revi 
{
    public static void main(String[] args) 
    {
       I20 c1=new I20();
       I20 c2=new I20(10);

       
    }
}

/*class Test1
{
    int age;
    int num;
    Test1()
    {
        System.out.println("in inbuilt method");
    }

    Test1(int age)
    {   
        this();
        this.age=age;
        System.out.println("in user constructor "+age);
    }
    Test1 (int age, int num)

    {   this(10);
        this.age=age;
        this.num=num;
        System.out.println("in second method");
    }

    
    
}
public class Revi 
{
    public static void main(String[] args) 
    {
        Test1 t =new Test1();
        Test1 t2= new Test1(15);
        Test1 t3= new Test1(10,9113);
       
    }
}

/*class Encap
{
    private int age;
    private String name;

    public void setAge(int age)
    {
        this.age=age;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void getAge()
    {
        System.out.println(age);
    }
    public void getName()
    {
        System.out.println(name);
    }
  
}

public class Revi 
{
    public static void main(String[] args) 
    {
        Encap obj= new Encap();
        obj.setAge(10);
        obj.setName("sufyan");
        obj.getAge();
        obj.getName();
    }
}
*/
