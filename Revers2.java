public class Revers2 
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
        revIter();
        disp();

        revRec(head, null);
        disp();
        

    }
    public static void revIter()
    {
        Node cur=head;
        Node pr=null;
        Node af=null;

        while(cur!=null)
        {
            af=cur.next;
            cur.next=pr;
            pr=cur;
            cur=af;   
        }
        head=pr;
    }

    public static void revRec(Node cr,Node pr)
    {
       if(cr.next==null)
       {
            head=cr;
            cr.next=pr;
            return;
       }
       Node nextPtr=cr.next;
       cr.next=pr;
       revRec(nextPtr, cr);
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
