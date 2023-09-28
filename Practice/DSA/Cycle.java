package Practice.DSA;
public class Cycle 
{
    static Node head;
    public static void main(String[] args) 
    {
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(50);
        disp();
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=head;
        
        cycleDetect();
    }        

    public static void cycleDetect()
    {
        Node fast=head;
        Node slow=head;
        int flag=0;
        while(slow!=null && fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;

            if(slow==fast)
            {
                flag=1;
                break;
            }
        }
            if(flag==1)
            {
                System.out.println("cycle detected");

            }
            else
            {
                System.out.println("cycle not detected");
            }

        
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

