package DSA.Linked_List;

public class ReverseRec 
{
    static Node head;
    public static void main(String[] args) 
    {
        
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        disp();
        reverse(head,null);
        disp();

    }
    public static void reverse(Node cur,Node pre)
    {
        if(cur.next==null)
        {
            head=cur;
            cur.next=pre;
            return;
        }
        Node nextPtr=cur.next;
        cur.next=pre;
        reverse(nextPtr, cur);
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

