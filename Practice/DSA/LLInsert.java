package Practice.DSA;
public class LLInsert 
{   
    Node head;

    public static void main(String[] args) 
    {
        LLInsert a=new LLInsert();
        a.insert(1);
        a.insert(2);
        a.insert(3);

      //  a.disp();
      //  a.size();
        a.insert(4);
        a.insertBeg(15);
        a.insertBeg(20);
        a.inserAny(5, 5);
        a.disp();
        a.delete(3);
        a.disp();
       
        //a.size();

    }
    public void delete(int ind)
    {
        if(head==null)
        {
            return;
        }
        Node temp=head;
        if(ind==0)
        {
            head=temp.next;
            return;
        }
        

        for(int i=0; i<ind-1 &&temp!=null; i++ )
        {
            temp=temp.next;
        }
        if(temp==null && temp.next==null)
        {
            return;
        }
        temp.next=temp.next.next;
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

    public void insertBeg(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
       // Node temp=head;
        newNode.next=head;
        head=newNode;
    }
    public void inserAny(int data,int ind)
    {
        if(ind==size()-1)
        {
            insert(data);
            return;
        }
        Node newNode=new Node(data);
        Node temp=head;
        for(int i=0; i<ind;i++)
        {
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;


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
    public int size()
    {
        Node temp=head;
        int count=0;

        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }

        System.out.println("size = "+count);
        return count;

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