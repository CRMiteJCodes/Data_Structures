import java.util.Scanner;
public class Stack
{
    int stk[];
    int cap;
    int top;
    public Stack(int n)
    {
        stk=new int[n];
        cap=n;
        top=-1;
    }
    public void push(int v)
    {
        if(top==cap-1)
            System.out.println("Stack is Full");
        else
        {
            top++;
            stk[top]=v;
            System.out.println(v+" is inserted");
        }
    }
    public int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is Empty");
            return -9999;
        }
        else
        {
            int v=stk[top];
            top--;
            return v;
        }
    }
    public int peek()
    {
        if (top == -1) 
        {
            System.out.println("Stack is Empty");
            return -9999;
        }
        return stk[top];
    }
    public void display()
    {
        if(top!=-1)
        {
            System.out.println("The stack elements are:");
            for(int i=top;i>=0;i--)
            {
                if(i>0)
                System.out.print(stk[i]+",");
                else if(i==0)
                System.out.print(stk[i]+".");
            }
        }
        else
            System.out.println("Stack is empty");
    }
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int ch=0;
        Stack st=new Stack(10);
        do
        {
            System.out.println("Stack Operations:");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Peek");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            System.out.println("Enter your choice [1-5]:");
            ch=scan.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter the value to push:");
                    int n=scan.nextInt();
                    st.push(n);
                    break;
                case 2:
                    int x=st.pop();
                    if(x==-9999)
                        System.out.println("No elements present");
                    else
                        System.out.println(x+" is popped");
                    break;
                case 3:
                    System.out.println("Element at peek is "+st.peek());
                    break;
                case 4:
                    st.display();
                    break;
                case 5:
                    System.out.println("Thank You");
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        }while(ch!=5);
    }
}