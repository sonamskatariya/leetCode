package com.example.string;
/*
Given a string s,
 find the first non-repeating character in it and return its index. If it does not exist, return -1*/

import java.util.HashMap;

public class FirstNonRepeatingCharacter {


    public static int firstUniqChar(String s) {
        HashMap<Character,Integer>frequencyMap= new HashMap<Character,Integer>();
        s = s.replaceAll(" ", "");
        char[] charArray=s.toCharArray();
        for(int i=0;i<charArray.length;i++)
        {
            frequencyMap.put(s.charAt(i), frequencyMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (frequencyMap.get(s.charAt(i)) == 1) {
                return i;  // Return the index of the first non-repeating character
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        String s = "leetcodee";
        System.out.println("First non-repeating character index: " + firstUniqChar(s));
    }

}
