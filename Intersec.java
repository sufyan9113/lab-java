

public class Intersec 
{
     Node head;
    
    public static void main(String[] args) 
    {
        Intersec i1=new Intersec();
        Intersec i2=new Intersec();
        Intersec i3=new Intersec();


        i1.insert(8);
        i1.insert(4);
        i1.insert(5);

        i2.insert(4);
        i2.insert(1);

        i3.insert(5);
        i3.insert(6);
        i3.insert(1);

        i2.add(i2.head,i1.head);
        i3.add(i3.head,i1.head);

        i1.disp(i1.head);
        i2.disp(i2.head);

        i3.disp(i3.head);
        
    }
    public void add(Node head1,Node head)

    {
        Node temp=head1;

        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=head;
    } 


    public Node insert(int data)
    {
        Node newNode=new Node(data);

        if(head==null)
        {
            head=newNode;
            return head;
        }

        Node temp=head;

        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
        return head;

    }
    public  void disp(Node head)
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


