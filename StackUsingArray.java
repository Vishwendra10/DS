package com.ds;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StackUsingArray {

    int top=-1;
    int arr[]=new int[10];
    public void push(Scanner sc)
    {
        if(top== arr.length-1)
        {
            System.out.println("Overflow!!");
            return;
        }
        System.out.println("Enter element..");
        int element= sc.nextInt();

        top++;
        arr[top]=element;
        System.out.println("Item pushed!!");
        System.out.println();
    }

    public void pop()
    {
        if(top==-1)
        {
            System.out.println("Empty stack!!");
            return;
        }
        System.out.println("Popped element..");
        System.out.println(arr[top]);
        top--;
        System.out.println();
    }

    public void display()
    {
        if(top==-1)
        {
            System.out.println("Empty stack!!");
            return;
        }
        System.out.println("Elements in stack..");
        for(int i=top;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void peek()
    {
        if(top==-1)
        {
            System.out.println("Empty stack!!");
            return;
        }
        System.out.println("Peeked element : "+arr[top]);
        System.out.println();

    }

}
