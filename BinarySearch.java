package com.ds;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,5,8,10,33,55};
        int end=arr.length;
        int searchValue=330;
        int indexOfSearchElement = binarySearchMethod(arr,0,end-1,searchValue);
        if(indexOfSearchElement==-1)
        {
            System.out.println("Element not found!!");
        }
        else
        {
            System.out.println(searchValue+" is present at "+indexOfSearchElement+"th position.");
        }
    }

    private static int binarySearchMethod(int[] arr, int start, int end, int searchValue) {
        int mid;
        if(end>=start)
        {
            mid=(start+end)/2;

            if(searchValue==arr[mid])
            {
                return mid+1;
            }
            else if(arr[mid]>searchValue)
            {
                return binarySearchMethod(arr,start,mid-1,searchValue);
            }
            else
            {
                return binarySearchMethod(arr,mid+1,end,searchValue);
            }
        }
        return -1;
    }
}
