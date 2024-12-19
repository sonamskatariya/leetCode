package com.example.arrays;

/*Given an array arr[], the task is to reverse the array.
Reversing an array means rearranging the elements such that the first element becomes the last,
the second element becomes second last and so on.

Examples:

Input: arr[] = {1, 4, 3, 2, 6, 5}
Output: {5, 6, 2, 3, 4, 1}
Explanation: The first element 1 moves to last position, the second element 4 moves to second-last and so on.
* */

import java.util.Arrays;

public class arrayReverse {



    public static int[] reverse(int[] arr){
            int temp=0;
            int right=arr.length-1;

            for(int i=0;i<arr.length/2;i++){
                temp=arr[i];
                arr[i]=arr[right];
                arr[right]=temp;
                right--;
            }

        return arr;
    }



    public static void main (String[] args){
        int[] arr = {3, 2, 1, 56, 10000, 167};

        // Call the function and get the result
        int[] result = reverse(arr);

        // Print the result (min, max)

        System.out.println(Arrays.toString(result));
    }

}
