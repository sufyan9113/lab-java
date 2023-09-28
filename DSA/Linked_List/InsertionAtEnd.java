package DSA.Linked_List;

public class InsertionAtEnd 
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
        InsertionAtEnd a=new InsertionAtEnd();
        a.insert1(10);
        a.insert1(20);
        a.insert1(30);
        a.insertBegin(5);
        System.out.println("before insert 40");
        a.disp();

        a.insert1(40);
        a.insertBegin(38);
        System.out.println("before insert 40");
        a.disp();
    }
    public void insert1(int data)
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
       
        return;
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