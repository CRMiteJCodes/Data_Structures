import java.util.Scanner;
public class Queue
{
    int que[];
    int front;
    int rear;
    int cap;
    public Queue(int size)
    {
        cap=size;
        que=new int[cap];
        front=0;
        rear=0;
    }
    public void enqueue(int ele)
    {
        if(rear==cap)
            System.out.println("Queue is Full");
        else
        {
            que[rear++]=ele;
            System.out.println(ele+" is added in queue");
        }
    }
    public int dequeue()
    {
        if(front==rear)
        {
            System.out.println("Queue is Empty");
            return -1111;
        }
        else

            return que[front++];
    }
    public int peep()
    {
        if (front == rear)
        {
           System.out.println("Queue is Empty");
           return -1111;
        }
        return que[front];
    }
    public void display()
    {
        if(front!=rear)
        {
            System.out.println("Queue elements are:");
            for(int i=front;i<rear;i++)
            {
                if(i<rear-1)
                    System.out.print(que[i]+",");
                else
                    System.out.println(que[i]+".");
            }
        }
        else
            System.out.println("Queue is Empty");
    }
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int ch=0;
        Queue q=new Queue(10);
        do
        {
            System.out.println("Queue Operations:");
            System.out.println("1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.Peep");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            System.out.println("Enter your choice [1-5]:");
            ch=scan.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter the value to enqueue:");
                    int n=scan.nextInt();
                    q.enqueue(n);
                    break;
                case 2:
                    int x=q.dequeue();
                    if(x==-1111)
                        System.out.println("No elements present");
                    else
                        System.out.println(x+" is dequeued");
                    break;
                case 3:
                    System.out.println("Element at peep is "+q.peep());
                    break;
                case 4:
                    q.display();
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        }while(ch!=5);
    }
}