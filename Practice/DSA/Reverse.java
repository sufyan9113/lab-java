package Practice.DSA;
public class Reverse 
{
    static Node head;
    public static void main(String[] args) 
    {
        insert(10);
        insert(20);
        insert(30); 
        insert(40);
        disp();
        System.out.println();
        reverseIter();
        disp();
        System.out.println();

        reverseRec(head,null);
        disp();
        System.out.println();


    }  
    public static void reverseIter()
    {
        Node curr=head;
        Node after=null;
        Node pre=null;
        
        while(curr!=null)
        {
            after=curr.next;
            curr.next=pre;
            pre=curr;
            curr=after;
        }
        head=pre;
        

    }
    public static void reverseRec(Node curr,Node pre)
    {
        if(curr.next==null)
        {
          head=curr;  
            curr.next=pre;
            return;
        }
        Node nextPtr=curr.next;
        curr.next=pre;
        reverseRec(nextPtr,curr);

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
