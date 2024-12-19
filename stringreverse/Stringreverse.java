package com.example.stringreverse;

public class Stringreverse {

    public static String reverse(String orignalString){
        char[] chars=orignalString.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while(left<right){
            char temp=chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
            left++;
            right--;
        }
        return new String(chars);
    }

    public static void main(String args[]){

        String s="Sonam";
        System.out.println("Original String  "+s +"Reverse String "+reverse(s));
    }
}
