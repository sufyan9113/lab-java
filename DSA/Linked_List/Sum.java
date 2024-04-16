package DSA.Linked_List;

public class Sum 
{
    Node head;
    public static void main(String[] args) 
    {
        Sum s1=new Sum();
        Sum s2=new Sum();
        Sum s3=new Sum();

        s1.insert(1);
        s1.insert(2);
        s1.insert(3);


        s2.insert(4);
        s2.insert(5);
        s2.insert(6);

       
        s3.insertSum(s1.head,s2.head);

        s3.disp(s3.head);
    }

    public void insertSum (Node s1, Node s2)
    {
        while(s1.next!=null && s2.next!=null)
        {
            s1=s1.next;
            s2=s2.next;
        Node newNode=new Node(s1.data+s2.data);

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

        s1=s1.next;
        s2=s2.next;

    }
    }

 
    public void insert(int data)
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


