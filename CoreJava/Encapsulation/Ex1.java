package Encapsulation;

public class Ex1 {
    public static void main(String[] args){
        Student s=new Student();
        Student s1=new Student();
        s.setData1(10);
        s1.setData1(20);
     
        s.setData2("sufyan");
        s1.setData2("navin");
        
        s.show();
        s1.show();
    }
    
}

class Student{

    private int age;
    private String name;
   // int age;
   // String name;
    void setData1(int age){
        this.age=age;
    }
    void setData2(String name){
        this.name=name;
    }
   void show(){
    System.out.println(age+" "+name);
   }
}