package com.example.lexicographically;

import java.util.Arrays;

public class LexicographicallySmallestString {
    public static char getNextChar(char ch) {
        // If it's 'z', we wrap around to 'a'
        if (ch == 'a') {
            return 'z';
        }
        // Otherwise, move to the next character
        return (char) (ch + 1);
    }
    public static String lexicographicallySmallest(String str) {
        // Convert the string to a character array
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            chars[i]=getNextChar(chars[i]);
        }

        // Sort the character array
        Arrays.sort(chars);

        // Convert the sorted character array back to a string
        return new String(chars);
    }
    public static void main(String[] args) {
        String input = "hackerrank";
        System.out.println(lexicographicallySmallest(input));  // Output: "abc"
    }
}
