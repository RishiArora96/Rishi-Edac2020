package DSArraypack;


class Node{
    int data;
    Node fLink;
    Node bLink;
    Node(int data)
    {
        this.data=data;
        this.fLink=this.bLink=null;
    }

}




public class DoublLinkedList {
    private Node start;
    private int length;

    DoublLinkedList()
    {
        this.start=null;
        this.length=0;
    }

    public void insertBeg(int data)
    {
        Node newNode = new Node(data);
        if(start==null)
        {
            start=newNode;
        }
        else
        {
            start.bLink=newNode;
            newNode.fLink=start;
            start=newNode;
        }
        length++;
    }
public void insertAtEnd(int data)
{
    Node newNode = new Node(data);
    if(start==null)
    {
        start=newNode;
    }
    else
    {
        Node n=start;
        while(n.fLink!=null)
        {
            n=n.fLink;
        }
        n.fLink=newNode;
        newNode.bLink=n;
    }
    length++;



}
void insertSetPos(int data,int pos) {
    if (pos == 1) {
        insertBeg(data);
    } else if (pos > length) {
        insertAtEnd(data);
    } else {
        int i = 1;
        Node n = start;
        while (n.fLink != null) {
            i++;
            if (i == pos)
                break;
            n = n.fLink;

        }
        Node newNode = new Node(data);
        newNode.bLink = n;
        newNode.fLink = n.fLink;
        n.fLink.bLink = newNode;
        n.fLink = newNode;
        length++;
    }

}
    public void deleteBeg()
    {
        Node n=start;
        if(start==null)
        {
            System.out.println("list empty");
        }
        else
        {
            start=n.fLink;
            start.bLink=null;
        }
        length--;
    }
    void deletePos(int pos)
    {
        if(pos <0)
        {
            System.out.println("pos does not");
        }
        if(pos==1){
            deleteBeg();
    }
    else
    {
        int i=1;
        Node p=start;
        while (p.fLink!=null)
        {
        i++;
        if(i==pos)
            break;
        p=p.fLink;
        }
        p.fLink.fLink.bLink=p;
        p.fLink=p.fLink.fLink;
        length--;
    }
    }

    void DisplayFor()
    {
        Node n=start;
        while(n.fLink!=null)
        {
            System.out.println(n.data+" ");
            n=n.fLink;
        }
        System.out.println(n.data +" ");
    }
   void deleteEnd()
   {
       if(start==null)
       {
           System.out.println("list empty");
       }
       else
       {
           Node n=start;
           while(n.fLink.fLink!=null)
           {
               n=n.fLink;
           }
           n.fLink= n.bLink=null;
           n.fLink=null;
           length--;
       }

   }

    void DisplayBackw()
    {
        Node n = start;
        while(n.fLink!=null)
        {
            n=n.bLink;
        }
        while (n.bLink!=null)
        {
            System.out.println(n.data + " ");
            n=n.bLink;
        }
        System.out.println(n.data + " ");
    }
    public static void main(String []args)
    {
        DoublLinkedList dl=new DoublLinkedList();
        dl.insertBeg(10);
        dl.insertBeg(20);
        dl.insertBeg(30);
        dl.insertAtEnd(40);
        dl.insertAtEnd(50);
        dl.insertSetPos(60,2);
        dl.insertSetPos(70,4);
        dl.deleteBeg();
        dl.deletePos(3);
        dl.DisplayFor();
       // dl.DisplayBackw();
    }
}





