package com.example.arrays;
/*Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.
Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int val = ...; // Value to remove
int[] expectedNums = [...]; // The expected answer with correct length.
                            // It is sorted with no values equaling val.

int k = removeElement(nums, val); // Calls your implementation

assert k == expectedNums.length;
sort(nums, 0, k); // Sort the first k elements of nums
for (int i = 0; i < actualLength; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.



Example 1:

Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
* */
public class removeArrayElement {

    public int removeElement(int[] nums, int val) {

        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[index]=nums[i];
                index++;
            }

        }

        return index;
    }

    public static void main(String[] args){

            // Example input array and the value to remove
            int[] nums = {3, 2, 2, 3, 4, 5, 3};
            int val = 3;

            // Create an instance of the Solution class
            removeArrayElement solution = new removeArrayElement();

            // Call the removeElement method and store the result (new length of the array)
            int newLength = solution.removeElement(nums, val);

            // Output the new array (up to the new length) and the new length
            System.out.println("New length of array: " + newLength);
            System.out.print("Array after removal: ");
            for (int i = 0; i < newLength; i++) {
                System.out.print(nums[i] + " ");
            }

    }
}
