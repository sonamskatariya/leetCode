package com.example.string;

import java.util.HashMap;

public class CharacterFrequency {

    public static void calculateCharacterFrequency(String s) {
        char[] c=s.toCharArray();

        HashMap<Character,Integer>h1= new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            h1.put(ch,h1.getOrDefault(ch,0)+1);
        }
        for (char ch : h1.keySet()) {
            System.out.println(ch + ": " + h1.get(ch));
        }

    }
    public static void main(String[] args) {
        String s = "hello world";
        System.out.println("Character frequencies: ");
        calculateCharacterFrequency(s);
    }
}
