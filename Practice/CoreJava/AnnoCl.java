package Practice.CoreJava;

interface M1
{
    void show();
   
}

/*class N1 implements M1
{
    public void show()
    {
        System.out.println("in show");
    }
}
*/
class AnnoCl
{
    public static void main(String[] args) 
    {
        M1 obj= new M1()
        {
            public void show()
            {
                System.out.println("in show");
            }
        };
        obj.show();
        
    }
}