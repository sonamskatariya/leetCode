package com.example.arrays;
/*
* Program to cyclically rotate an array by one
Last Updated : 11 Sep, 2023
Given an array, the task is to cyclically rotate the array clockwise by one time.

Examples:


Input: arr[] = {1, 2, 3, 4, 5}
Output: arr[] = {5, 1, 2, 3, 4}


Input: arr[] = {2, 3, 4, 5, 1}
Output: {1, 2, 3, 4, 5}
* */

import java.util.Arrays;

public class cyclicallRotate {

public static int[] cyclicRotate(int[] arr){

    int temp=arr[arr.length-1];
    for(int i=arr.length-1;i>0;i--){
        arr[i]=arr[i-1];
        System.out.println(Arrays.toString(arr));
    }
    arr[0]=temp;

return arr;
}


    public static void main (String[] args){
        int[] arr = {1, 2, 3, 4, 5};

        // Call the function and get the result
         int[] result=cyclicRotate(arr);

        // Print the result (min, max)

        System.out.println(Arrays.toString(result));
    }
}
