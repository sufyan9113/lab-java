package DSA.Linked_List;

public class CLL 
{
    static Node head;
    public static void main(String[] args) 
    {
        insert(1);
        insert(2);
        insert(3);
        insert(4);
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=head;
        disp(head);
        deleteHead();
        disp(head);

    } 

    public static void insert(int data)
    {

    Node newNode=new Node(data);
    Node temp=head;
    if(head==null)
    {
        head=newNode;
        return;
    }
    
    while(temp.next!=null)
    {
        temp=temp.next;
    }
    temp.next=newNode;
  //  newNode.next=head;

    }
    public static void deleteHead()
    {
       
       Node temp=head;

        while(temp.next!=head)
        {
            temp=temp.next;
        }
        temp.next=head.next;
        head=head.next;

    }
    public static void disp(Node head)
    {
        System.out.print(head.data+" ");
        Node temp=head.next;
         
        while(temp!=head)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
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