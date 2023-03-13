package Programs.Inheritance;

class Aeroplane
{
    void takeoff(){
        System.out.println("Aeroplane is takeoff");
    }
    void fly(){
        System.out.println("Aeroplane is flying");
    }
}
class CargoPlane extends Aeroplane 
{

}

class PassengerPlane extends Aeroplane
{

}

public class InheritedMethods 
{
    public static void main(String[] args) 
    {
        CargoPlane c=new CargoPlane();
        c.takeoff();
        c.fly();

        PassengerPlane p=new PassengerPlane();
        p.takeoff();
        p.fly();
    }
}

/* 
class Aeroplane
{
    void takeoff() // inherited method
    {
        System.out.println("Aeroplane is take off");
    }

    void fly()
    {
        System.out.println("Aeroplane is flying");
    }
}

class CargoPlane extends Aeroplane
{
    void fly() // overriden methos
    {
        System.out.println("CargoPlane is flying");
    }

    void carryCargo()// specialised method
    {
        System.out.println("CargoPlane  carries cargo");
    }

}
class PassengerPlane extends Aeroplane
{
    void fly()
    {
        System.out.println("PassengerPlane is flying");
    }
    
    void carryPassenger()
    {
        System.out.println("PassengerPlane  carries Passengers");
    }


}

public class Override
{
    public static void main(String[] args) 
    {
        CargoPlane c= new CargoPlane();
        c.takeoff();
        c.fly();
        c.carryCargo();

        PassengerPlane p= new PassengerPlane();
        p.takeoff();
        p.fly();
        p.carryPassenger();
    }
}
*/