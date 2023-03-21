package com.ds;

public class MergeSortDriver {
    public static void main(String[] args) {
        int[] arr= {3,6,1,9,2};
        int l=0,r=arr.length-1;
        System.out.println("Before sorting");
        for(int x:arr) {
            System.out.print(x+" ");
        }
        mergeSort(arr,l,r);
        System.out.println("\nAfter sorting");
        for(int x:arr) {
            System.out.print(x+" ");
        }
    }
    public static void mergeSort(int[] arr, int l, int r)
    {
        if(l>=r){return;}
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
    }
    public static void merge(int[] arr, int l, int m, int r)
    {
        int [] temp = new int[r-l+1];
        int k=0, i=l, j=m+1;
        while(i<=m && j<=r)
        {
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
                k++;
                i++;
            }
            else
            {
                temp[k]=arr[j];
                j++;
                k++;
            }
        }
        while(i<=m)
        {
            temp[k]=arr[i];
            k++;
            i++;
        }
        while(j<=r)
        {
            temp[k]=arr[j];
            k++;
            j++;
        }
        for(int p=l;p<=r;p++)
        {
            arr[p]=temp[p-l];
        }
    }
}
