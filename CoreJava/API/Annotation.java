package Programs.API;

@FunctionalInterface
interface FunctionInter  //functional interface
{
    public void disp();
   // public void show();
}

//parent class

class AeroPlane
{
    public void takeOff()
    {
        System.out.println("Aeroplane takeoff");
    }
}

//child class or subclass


@Deprecated
class CargoPlane extends AeroPlane
{
    @Override
    public void takeOff()       //override method
    {
        System.out.println("cargoplane takeoff");
    }
}

class Annotation
{
    public static void main(String[] args) 
    {
        //child class object
        AeroPlane cp=new CargoPlane();
        cp.takeOff();
    }
}