// isFull() to check stack overflow
// o​ isEmpty() to check stack underflow
// o​ push(int value) to insert an element
// o​ pop() to remove the top element
// o​ peek() to view the top element
// o​ display() to show all stack elements

import java.util.*;
public class StackDemo
{
    int top;
    int arr[];
    int capacity;

    StackDemo(int size)
    {
        arr= new int[size];
        capacity = size;
        top = -1;
    }
    public void push(int ele)
    {
        if(isFull())
        {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
        arr[++top]= ele;
        System.out.printf("Element pushed is %d\n",ele);
    }
    public void pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        System.out.printf("Element popped is %d\n",arr[top--]);
    }
    public boolean isFull() 
    // Not required to add int top because it's in StackDemo
    {
            return top==capacity-1;
    }
    public boolean isEmpty() 
    //Not required to add int top because it's in StackDemo
    {
            return top==-1;
    }
    public void peek()
    {
        if(isEmpty())
        {
            System.out.printf("Stack Underflow");
            System.exit(1);
        }
        System.out.printf("The top element is %d\n",arr[top]);
    }
    public void display()
    {
        System.out.println("The elements are: ");
        for(int i=top;i>=0;i--)
        {
            System.out.printf("%d\n",arr[i]);
        }
    }
    public static void main(String args[])
    {
        StackDemo stack = new StackDemo(10);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.peek();
        stack.pop();
        stack.display();  
    }
}
