package com.ds;

public class SelectionSort {
    public static void sSort(int[] a)
    {
        for(int i=0;i<a.length-1;i++)
        {
            int smallestindex=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[smallestindex]>a[j])
                {
                    smallestindex=j;
                }
            }
            int temp=a[smallestindex];
            a[smallestindex]=a[i];
            a[i]=temp;
        }
    }



    public static void main(String[] args) {
        int[] a={2,5,1,8,44,0,8};
        System.out.println("Before Sorting..");
        print(a);
        sSort(a);
        System.out.println("\nAfter Selection sort..");
        print(a);
    }
    public static void print(int[] a)
    {
        for(int x:a)
        {
            System.out.print(x+" ");
        }
    }
}
