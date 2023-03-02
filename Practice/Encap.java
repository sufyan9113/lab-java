package Practice;
import javax.swing.plaf.synth.SynthDesktopIconUI;

class Prac {

    public static void main(String[]args)
    {
       
      
        Student s1=new Student();
        Student s2=new Student();

        s1.setAge(15);
        s1.setName("sufyan");

        s2.setAge(20);
        s2.setName("navin");

        int ageStud1=   s1.getAge();
        String nameStud1=s1.getName();

        int ageStud2=s2.getAge();
        String nameStud2=s2.getName();

        System.out.println(ageStud1+" "+nameStud1);
        System.out.println(ageStud2+" "+nameStud2);

*/
    }
    
}

class Student{
    private int age;
    private String name;

    public void setAge(int age)
    {
        this.age=age;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
}
