package Practice;

class Developer
{
    public void buildApp(Computer l)
    {
        
        System.out.println("building app");
        
        l.compileCode();
    }
}
interface Computer
{
    abstract void compileCode();
    
}
class Laptop implements Computer
{
    public void compileCode()
    {
        System.out.println("code copiled");
    }
}
class Desktop implements Computer
{
    public void compileCode()
    {
        System.out.println("code copiled,faster");
    }
}
public class Interface 
{
    public static void main(String[] args) 
    {
       Computer l= new Desktop();
        Developer d =new Developer();
        d.buildApp(l);
    }
}
