package DSA.Linked_List;

public class InsertAtBegin 
{
    Node head;
    public static void main(String[] args) 
    {
        InsertAtBegin a=new InsertAtBegin();

        a.insertBegin(10);
        a.insertBegin(20);
        a.insertBegin(30);
        System.out.println("before");
        a.disp();


        a.insertBegin(40);
        System.out.println("after");
        a.disp();

    }

    public void insertBegin(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

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
