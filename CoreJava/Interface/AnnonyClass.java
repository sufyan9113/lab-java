package Interface;

interface AB
{
    void show();
}

public class AnnonyClass 
{
    public static void main(String[] args) 
    {
       AB obj= new AB(){
        public void show()
        {
            System.out.println("in show");
        }
       };
       obj.show();

       

    }
}
