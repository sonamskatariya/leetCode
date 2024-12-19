package com.example.palindrome;

public class PalindromeClass {

    public static boolean isPalidrome(String str){
        str=str.toLowerCase();
        int left=0;
        int right=str.length()-1;
        
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}
