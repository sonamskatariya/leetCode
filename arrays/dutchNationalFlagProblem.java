package com.example.arrays;
/*Given an array arr[] consisting of only 0s, 1s, and 2s. The task is to sort the array, i.e., put all 0s first, then all 1s and all 2s in last.

This problem is the same as the famous “Dutch National Flag problem”. The problem was proposed by Edsger Dijkstra. The problem is as follows:

Given n balls of colour red, white or blue arranged in a line in random order. You have to arrange all the balls such that the balls with the same colours are adjacent with the order of the balls, with the order of the colours being red, white and blue (i.e., all red coloured balls come first then the white coloured balls and then the blue coloured balls).

Examples:

Input: arr[] = {0, 1, 2, 0, 1, 2}
Output: {0, 0, 1, 1, 2, 2}
Explanation: {0, 0, 1, 1, 2, 2} has all 0s first, then all 1s and all 2s in last.


Input: arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}
Output: {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}
Explanation: {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2} has all 0s first, then all 1s and all 2s in last.
* */
public class dutchNationalFlagProblem {

public static void dutchSorting(int [] arr){

    int low = 0;
    int mid = 0;
    int high = arr.length - 1;
    while (mid <= high) {
        if (arr[mid] == 0) {
            // Swap arr[low] and arr[mid] for 0's
            swap(arr, low, mid);
            low++;
            mid++;
        } else if (arr[mid] == 1) {
            // Move mid if it's 1
            mid++;
        } else {
            // Swap arr[mid] and arr[high] for 2's
            swap(arr, mid, high);
            high--;
        }
    }
}

    // Function to swap two elements in the array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];


}




    public static void main (String[] args){
        int[] arr = {0,0,1,0,2,0,1,2,2,0};

        // Call the function and get the result
        dutchSorting(arr);

        // Print the result (min, max)

        // System.out.println(Arrays.toString(result));
    }
}
