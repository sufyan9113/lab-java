package Polymorphism;

class AeroPlane
{
    void takeoff()
    {
        System.out.println("Aeroplane is takeoff");
    }
    void fly()
    {
        System.out.println("Aeroplane is flying");
    }

}

class PassengerPlane extends AeroPlane
{
    void takeoff()
    {
        System.out.println("PassengerPlane is takeoff");
    }
    void fly()
    {
        System.out.println("PassengerPlane is flying");
    }
    void carryPassenger()
    {
        System.out.println("PassengerPlane carries Passenger");
    }
}

class CargoPlane extends AeroPlane
{
    void takeoff()
    {
        System.out.println("CargoPlane is takeoff");
    }
    void fly()
    {
        System.out.println("CargoPlane is flying");
    }
    void carryGoods()
    {
        System.out.println("CargoPlane carries Goods");
    }
}

class FighterPlane extends AeroPlane
{
    void takeoff()
    {
        System.out.println("FighterPlane is takeoff");
    }
    void fly()
    {
        System.out.println("FighterPlane is flying");
    }
    void carryPilot()
    {
        System.out.println("FighterPlane carries Pilot only");
    }
}
public class Polymor 
{
    public static void main(String[] args) 
    {
        PassengerPlane p= new PassengerPlane();
        CargoPlane c= new CargoPlane();
        FighterPlane f= new FighterPlane();

        AeroPlane a;
        a=p;
        a.fly();
        a.takeoff();

        a=c;
        a.fly();
        a.takeoff();
    

        a=f;
        a.fly();
        a.takeoff();
    }
}
