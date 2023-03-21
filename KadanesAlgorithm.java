package com.ds;

public class KadanesAlgorithm {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, -2, 5};
        int maxSum=0, currSum=0;
        if(arr[0]<0)
        {
            maxSum=arr[0];
        }
        for(int i=0;i<arr.length;i++)
        {
            currSum=Math.max(currSum, currSum+arr[i]);
            maxSum=Math.max(currSum, maxSum);
        }
        System.out.println(maxSum);
    }
}
