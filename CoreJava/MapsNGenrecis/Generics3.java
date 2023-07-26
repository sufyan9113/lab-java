import java.util.*;

class Gen
{

}
public class Generics3 
{
    
   public static void main(String[] args) 
   {
    Gen g=new Gen();
    ArrayList<String> a1=new ArrayList<String>();

    List<Integer> a2=new ArrayList<Integer>();

    Collection<Object> a3=new ArrayList<Object>();

 //   ArrayList<int> a3=new ArrayList<int>(); CE primitive data type is not allowed
    
  //  List<Object> a4=new ArrayList<String>(); parent type reference is not allowed both data should be same
  
  List<Gen> a4=new ArrayList<Gen>();


   }
}
