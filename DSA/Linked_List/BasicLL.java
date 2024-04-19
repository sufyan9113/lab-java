package DSA.Linked_List;

public class BasicLL 
{
    public static void main(String[] args) 
    {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        
        disp(a);
        System.out.println("********");
       // System.out.println(a.next); //before link
     //   a.next=b;           // a-> b
      //  System.out.println(a.next); //before link address of b is stored in a.next  
       // System.out.println(b); 
      //  System.out.println(a.next.data);//get value of b by using a.next
      //  b.next=c;  //a-> b->c
      //  c.next=d;  //a-> b->c->d

      Node temp=a;
      while(temp!=null)
      {
        System.out.println(temp.data);
        temp=temp.next;
      }
      
   
        
}
 public static void disp(Node head)
 {
   if(head==null)return;

   System.out.println(head.data);
   disp(head.next);

 }
}
class Node 
{
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
    }
}
