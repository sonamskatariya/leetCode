package com.example.arrays.medium;
import java.util.*;
/*
* Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements.

Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows

a, b are from arr
a < b
b - a equals to the minimum absolute difference of any two elements in arr


Example 1:

Input: arr = [4,2,1,3]
Output: [[1,2],[2,3],[3,4]]
Explanation: The minimum absolute difference is 1. List all pairs with difference equal to 1 in ascending order.
Example 2:

Input: arr = [1,3,6,10,15]
Output: [[1,3]]*/
public class absoulteDifference {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        List<List<Integer>> result = new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            int diff = arr[i] - arr[i - 1];

            if (diff < minDiff) {
                minDiff = diff;
                result.clear();
                result.add(Arrays.asList(arr[i - 1], arr[i]));  // Add the new pair to result
            }
            else if (diff == minDiff) {
                result.add(Arrays.asList(arr[i - 1], arr[i]));
            }


        }
        return result;
    }

    public static void main (String[] args){
        absoulteDifference a1=  new absoulteDifference();
        int[] arr = {4, 2, 1, 3};

        // Call the function and get the result
        List<List<Integer>> result = new ArrayList<>();
        result= a1.minimumAbsDifference(arr);
        System.out.println(result);
        // Print the result (min, max)

        // System.out.println(Arrays.toString(result));
    }

}
