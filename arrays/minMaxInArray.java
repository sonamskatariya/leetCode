package com.example.arrays;

import java.util.Arrays;

/*Given an array arr. Your task is to find the minimum and maximum elements in the array.

Note: Return an array that contains
 two elements the first one will be a minimum element and the second will be a maximum of an array.*/
public class minMaxInArray {

    public static int[] findMinMax(int[] arr){
        int min=arr[0];
        int max=arr[0];

        for(int i:arr){
            if(i<min){
                min=i;
            }
            if(i>max){
                max=i;
            }

        }

        return new int[]{min, max};

    }



public static void main (String[] args){
    int[] arr = {3, 2, 1, 56, 10000, 167};

    // Call the function and get the result
    int[] result = findMinMax(arr);

    // Print the result (min, max)

    System.out.println(Arrays.toString(result));
}

}
