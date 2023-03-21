package com.ds;

public class StackUsingLL {
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public void push(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            System.out.println(data+" is pushed");
            return;
        }
        newNode.next=head;
        head=newNode;
        int data1=head.data;
        System.out.println(data1+" is pushed");
    }

    public void pop()
    {
        if(head==null)
        {
            System.out.println("Empty stack");
            return;
        }
        int data=head.data;
        System.out.println(data+" is popped");
        head=head.next;
    }

    public void peek()
    {
        if(head==null)
        {
            System.out.println("Empty stack");
            return;
        }
        int data=head.data;
        System.out.println(data);
    }

    public void print()
    {
        if(head==null)
        {
            System.out.println("Empty stack");
            return;
        }
        Node currNode=head;
        while(currNode!=null)
        {
            System.out.print(currNode.data+" ");
            currNode=currNode.next;
        }
    }

    public static void main(String[] args)
    {
        StackUsingLL sl=new StackUsingLL();
        sl.push(1);
        sl.push(3);
        sl.push(5);
        sl.push(6);
        sl.push(7);
        sl.peek();
        sl.print();
        System.out.println();
        sl.pop();
        sl.pop();
        sl.print();
    }
}
