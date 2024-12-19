package com.example.arrays;

import java.util.Arrays;

public class arraySorting {


public static int[] sortArray(int[] arr){

    int min=arr[0];
    int temp=0;

    for(int i =0;i<arr.length;i++){
        if(arr[i]<min){
            temp=arr[i];
            arr[i]=min;
            min=temp;
        }
    }
return arr;
    }



    public static void main (String[] args){
        int[] arr = {1, 2, 3, 4, 5};

        // Call the function and get the result
        int[] result=sortArray(arr);

        // Print the result (min, max)

        System.out.println(Arrays.toString(result));
    }
}
