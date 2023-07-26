package Interface;

interface Computer
{
    void compileCode();
    
}
class Developer
{   
    
    public void buildingApp(Computer ds)
    {
        System.out.println("building application");
        ds.compileCode();
    }
}

class Laptop implements Computer
{
    public void compileCode()
    {
        System.out.println("code is compiled");
    }
}

class Desktop implements Computer
{
    public void compileCode()
    {
        System.out.println("code is compiled,faster");
    }
}
public class Demo 
{
    public static void main(String[] args) 
    {
       // Laptop l= new Laptop();
        Developer d= new Developer();
        Computer ds= new Desktop();
        d.buildingApp(ds);
        
    }
}
