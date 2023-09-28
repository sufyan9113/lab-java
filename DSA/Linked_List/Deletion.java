package DSA.Linked_List;

public class Deletion 
{
    Node head;
    public static void main(String[] args) 
    {
        Deletion a=new Deletion();
        a.insert(10);
        a.insert(20);
        a.insert(30);
        a.insert(40);
        

        a.disp();

        a.delete(3);

        a.disp();
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
       
        for(int i=0; i<ind-1 && temp!=null; i++)
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
