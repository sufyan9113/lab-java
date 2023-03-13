package Programs.Inheritance;

class Aeroplane
{
    void takeoff()
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
    void fly()
    {
        System.out.println("CargoPlane is flying");
    }

}
class PassengerPlane extends Aeroplane
{
    void fly()
    {
        System.out.println("PassengerPlane is flying");
    }

}

 class Override 
{
    public static void main(String[] args) 
    {
        CargoPlane c= new CargoPlane();
        c.takeoff();
        c.fly();

        PassengerPlane p= new PassengerPlane();
        p.takeoff();
        p.fly();
    }
}
