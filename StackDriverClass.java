package com.ds;

import java.util.Scanner;

public class StackDriverClass {
    public static void main(String[] args) {

        StackUsingArray s = new StackUsingArray();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice != 5) {
            System.out.println("1) Push");
            System.out.println("2) Pop");
            System.out.println("3) Display");
            System.out.println("4) Peek");
            System.out.println("5) Exit");
            System.out.println();
            System.out.println("Enter choice..");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    s.push(sc);
                    break;
                }
                case 2: {
                    s.pop();
                    break;
                }
                case 3: {
                    s.display();
                    break;
                }
                case 4: {
                    s.peek();
                    break;
                }
                case 5: {
                    System.out.println("Exiting..");
                    System.exit(0);
                }
                default: {
                    System.out.println("Please enter a valid choice..");
                }
            }
        }
    }
}