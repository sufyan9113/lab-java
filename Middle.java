public class Middle 
{
    static Node head;
    public static void main(String[] args) 
    {
        insert(10);
        insert(20);
        insert(30); 
        insert(40);
        insert(50);
        insert(60);
        disp();

        middle();
        
    }

    public static void middle()
    {
        Node slow=head;
        Node fast=head;
        while( fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        System.out.println(slow.data);
    }
    public static void insert(int data)
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
    public static void disp()
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
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
    }
}
