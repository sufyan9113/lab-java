package Practice;

class M
{
    public void show()
    {
        System.out.println("in show");
    }
     static class N
    {
        public void disp()
        {
            System.out.println("in disp");
        }
    }
}

class InnerClass
{
    public static void main(String[] args) 
    {
        M obj= new M();
        obj.show();
        M.N obj1= new M.N();

        obj1.disp();
    }
        
}