;import java.util.Scanner;
class LinkedList
{
    Node start;
    Node end;
    int size;
    public LinkedList()
    {
        start=null;
        end=null;
        size=0;
    }
    public void InsertFront(int d)
    {
        Node nd=new Node(d);
        if(start==null)
        {
            start=nd;
            end=nd;
        }
        else
        {
            nd.link=start;
            start=nd;
        }
        size++;
        System.out.println(d+" is inserted at the beginning.");
    }
    public void InsertRear(int d)
    {
        Node nd=new Node(d);
        if(end==null)
        {
            start=nd;
            end=nd;
        }
        else
        {
            end.link=nd;
            end=nd;
        }
        size++;
        System.out.println(d+" is inserted at the end.");
    }
    public void InsertAtPos(int d,int p)
    {
        Node nd=new Node(d);
        if(size<=1 || p>=size)
        {
            System.out.println("Insertion is not possible.");
        }
        else
        {
            size++;
            Node pt=start;
            p=p-1;
            for(int i=1;i<size;i++)
            {
                if(i==p)
                {
                    Node tmp=pt.link;
                    pt.link=nd;
                    nd.link=tmp;
                    break;
                }
                pt=pt.link;
            }
        }
    }
    public int DeleteFront()
    {
        if(start==null)
        {
            System.out.println("List is empty.");
            return -111;
        }
        else
        {
            Node nd=start;
            start=start.link;
            nd.link=null;
            size--;
            return nd.data;
        }
    }
    public int DeleteRear()
    {
        if(end==null)
        {
            System.out.println("List is empty.");
            return -1111;
        }
        else
        {
            Node s=start;
            Node t=start;
            if(start==end)
            {
                int a=end.data;
                start=end=null;
                size--;
                return a;
            }
            while(s!=end)
            {
                t=s;
                s=s.link;
            }
            end=t;
            end.link=null;
            size--;
            return s.data;
        }
    }
    public int DeleteAtPos(int p)
    {
        if(start==null)
        {
            System.out.println("List is empty.");
            return -111;
        }
        else
        {
            Node nd=start;
            p--;
            for(int i=1;i<size;i++)
            {
                if(i==p)
                {
                    Node t=nd.link;
                    t=t.link;
                    nd.link=t;
                    t.link=null;
                    break;
                }
                nd=nd.link;
            }
            size--;
            return nd.data;
        }
    }
    public void display()
    {
        if(start==null)
        System.out.println("List is empty.");
        else
        {
            Node pt=start;
            while(pt!=null)
            {
                if(pt.link==null)
                System.out.print(pt.data+".");
                else
                System.out.print(pt.data+", ");
                pt=pt.link;
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        LinkedList l=new LinkedList();
        int ch;
        System.out.println("The choices are:");
        System.out.println("1.Insert Front");
        System.out.println("2.Insert Rear");
        System.out.println("3.Insert Middle");
        System.out.println("4.Delete Front");
        System.out.println("5.Delete Rear");
        System.out.println("6.Delete Middle");
        System.out.println("7.Display");
        System.out.println("8.Exit");
        do
        {
            System.out.println("Enter your choice");
            ch=scan.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter element to insert");
                    int n=scan.nextInt();
                    l.InsertFront(n);
                    break;
                    
                case 2:
                    System.out.println("Enter element to insert");
                    int n1=scan.nextInt();
                    l.InsertRear(n1);
                    break;
                    
                case 3:
                    System.out.println("Enter element to insert");
                    int n2=scan.nextInt();
                    System.out.println("Enter position to insert");
                    int p=scan.nextInt();
                    l.InsertAtPos(n2,p);
                    break;
                    
                case 4:
                    int x=l.DeleteFront();
                    if(x!=-111)
                    System.out.println(x+" is deleted.");
                    break;
                    
                case 5:
                    int y=l.DeleteRear();
                    if(y!=-111)
                    System.out.println(y+" is deleted.");
                    break;
                    
                case 6:
                    System.out.println("Enter position to delete");
                    int p1=scan.nextInt();
                    int z=l.DeleteAtPos(p1);
                    if(z!=-111)
                    System.out.println(z+" is deleted.");
                    break;
                    
                case 7:
                    l.display();
                    break;
                    
                case 8:
                    System.out.println("Exit");
                    break;
                    
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }while(ch!=8);
    }
}