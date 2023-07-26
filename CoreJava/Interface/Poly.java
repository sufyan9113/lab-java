package Interface;


class S 
{

    void disp(){
        System.out.println("in disp");
    }

    class Q
    {
        void show()
        {
            System.out.println("in show");
        }
    }
    
}




public class Poly 
{
    public static void main(String[] args) 
    {
      //  S obj1=new S();
      //  S.Q obj2= obj1.new Q();
    // new S().new Q().show();
   S.Q obj=new S().new Q();
   obj.show();
  
  
    
            
        
        
    

        

    }   


}

/*class Student
{
    private Heart h;
    /*public Student(Heart h)
    {
        this.h=h;
    }

    public void setH(Heart h)
    {
        this.h=h;
    }
    public void call()
    {
        h.print();
    }
    
}

class Heart
{
    public void print()
    {
        System.out.println("in print heart");
    }
}
public class Poly 
{
    public static void main(String[] args) 
    {
        Heart h=new Heart();
        Student s= new Student();
        s.setH(h);
        s.call();
       //s.disp(h);
    }
}
*/