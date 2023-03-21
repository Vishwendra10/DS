package com.ds;

public class BubbleSort {

    public static void bSort(int [] a)
    {
        int temp,i,j;
        for(i=0;i<a.length-1;i++)
        {
            for(j=0;j<a.length-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    public static void print(int[] a)
    {
        for(int x:a)
        {
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        int[] a={2,5,1,8,44,0,8};
        System.out.println("Before Sorting..");
        print(a);
        bSort(a);
        System.out.println();
        System.out.println("After Bubble sort..");
        print(a);

    }
}
