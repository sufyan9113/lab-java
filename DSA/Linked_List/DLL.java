
class DLL 
{
    static Node head;
    public static void main(String[] args) 
    {
       Node a= insert(1);
       Node b= insert(2);
       Node c= insert(3);
       Node d= insert(4);

       disp(a);
       System.out.println();
       insertInd(5,0);
       insertInd(50, 2);
       
       disp(head);
       System.out.println();
      // disp2(d);
      // System.out.println();
       //disp3(c);

       delete(2);

       disp(head);
       System.out.println();
      // disp2(d);
      // System.out.println();

       delete(0);

       disp(head);
       System.out.println();
    //   disp2(d);
    //   System.out.println();

    

    }
    public static void delete(int ind)
    {
        if(ind==0)
        {
            head=head.next;
            head.pr=null;
            return;
        }
        Node temp=head;
        for(int i=0; i<ind-1; i++)
        {
            temp=temp.next;
        }
        temp.next=temp.next.next;
        temp.next.pr=temp;
        
    }
    public static void insertInd(int data,int ind)
    {
        Node newNode=new Node(data);

        if(ind==0)
        {
            newNode.next=head;
            head.pr=newNode;
            head=newNode;
            return;
        }
        Node temp=head;
        for(int i=0; i<ind-1; i++)
        {
            temp=temp.next;
        }
        newNode.next=temp.next;
        newNode.pr=temp;
        temp.next.pr=newNode;
        temp.next=newNode;
        
    }
    public static Node insert(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return newNode;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.pr=temp;
        return newNode;
    }
    public static void disp(Node head)
    {
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    public static void disp2(Node tail)
    {
        while(tail!=null)
        {
            System.out.print(tail.data+" ");
            tail=tail.pr;
        }
        System.out.println();
    }
    public static void disp3(Node ran)
    {
        while(ran.pr!=null)
        {
            ran=ran.pr;
        }
        while(ran!=null)
        {
            System.out.print(ran.data+" ");
            ran=ran.next;
        }
        System.out.println();
        
    }
}
class Node
{
    int data;
    Node next;
    Node pr;

    Node(int data)
    {
        this.data=data;
    }
}