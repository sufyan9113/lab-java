package DSA.Linked_List;

public class InsertAny2 

{
    Node head;
    class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
        next=null;
    }
}
    public static void main(String[] args) 
    {
        InsertAny2 a=new InsertAny2();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
    
       
        a.insertAny(35, a.head.next.next.next.next.next);
        a.disp();


    }
    public void add(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
    }

    public void insertAny(int data,Node prevNode)
    {
       
        if(prevNode==null)
        {
            System.out.println("cannot insert after null");
            return;
        }
        Node newNode=new Node(data);
      
        newNode.next=prevNode.next;
        prevNode.next=newNode;
        
    }
            
        
         
    

    
    public void disp()
    {
        Node temp=head;

        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    
}

