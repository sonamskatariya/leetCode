package com.example.arrays;

import java.util.*;
/*
* Given an array of n integers. The task is to find all elements that have more than one occurrences.
* The output should only one occurrence of a number irrespective of number of occurrences in the input array.

Examples:

Input: {2, 10, 10, 100, 2, 10, 11, 2, 11, 2}
Output: {2, 10, 11}


Input: {5, 40, 1, 40, 100000, 1, 5, 1}
Output: {5, 40, 1}

*/

public class arrayDuplicate {

public static void findDuplicate(int[] arr) {

    HashSet<Integer> h1 = new HashSet<>();
    HashSet<Integer> h2 = new HashSet<>();
    List<Integer> l1 = new ArrayList<>();
    int index = 0;


    for (int i = 0; i < arr.length; i++) {

        if (!h1.contains(arr[i])) {
            h1.add(arr[i]);
        } else {
            h2.add(arr[i]);
        }


    }
    for (Integer num : h2) {
        System.out.println(num); // Print each element
    }


}

    public static void main (String[] args){
        int[] arr = {5, 40, 1, 40, 100000, 1, 5, 1};

        // Call the function and get the result
       findDuplicate(arr);

        // Print the result (min, max)

       // System.out.println(Arrays.toString(result));
    }
}
