public class Reverse3 
{
    static Node head;
    public static void main(String[] args) 
    {
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(50);
        disp(head);
        head=revers(head);
        disp(head);
    }

    public static Node revers(Node head)
    {
        if(head.next==null)
        {
            return head;
        }
        Node newHead=revers(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
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
    public static void disp(Node head)
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
