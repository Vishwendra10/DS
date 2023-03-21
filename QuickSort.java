package com.ds;

public class QuickSort {
    public static void qSort(int[] a, int l, int h)
    {
        if(l<h)
        {
            int pIndex= partition(a, l, h);
            qSort(a,l, pIndex-1);
            qSort(a,pIndex+1,h);
        }

    }
    public static int partition(int[] a, int l, int h)
    {
        int pivot= a[h];
        int i= l-1;
        for(int j=l;j<h;j++)
        {
            if(a[j]<pivot)
            {
                i++;
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        i++;
        int temp=a[i];
        a[i]=pivot;
        a[h]=temp;
        return i;
    }
    public static void print(int[] a)
    {
        for(Integer x: a)
        {
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        int[] a={2,5,1,8,44,0,8};
        System.out.println("Before Sorting..");
        print(a);
        qSort(a,0,a.length-1);
        System.out.println("\nAfter Selection sort..");
        print(a);
    }
}
