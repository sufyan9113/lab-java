package DSA.Linked_List;

public class InsertAtAny
{
    Node head;
    public static void main(String[] args) 
    {
        InsertAtAny a=new InsertAtAny();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        System.out.println("before");
        a.disp();

        System.out.println("after");
        a.insertAny(35, 4);
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

    public void insertAny(int data,int ind)
    {
        int count=0;
        Node newNode=new Node(data);
        
        Node temp=head;
        while(temp.next!=null)
        {
            if(count==ind)
            {
                newNode.next=temp.next;
                temp.next=newNode;
                return;
            }
            temp=temp.next;
            count++;
            return;
        }
         
    

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
    public void insertAny(int data, Node next) {
    }
    
}
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
