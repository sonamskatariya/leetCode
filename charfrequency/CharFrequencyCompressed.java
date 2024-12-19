package com.example.charfrequency;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;



public class CharFrequencyCompressed {


    public static String charFrequency(String s) {
        int[] ch1 = new int[255];
        for (int i = 0; i < s.length()-1; i++) {
            ch1[s.charAt(i)] += s.charAt(i + 1) - '0';
            i++;
        }
        String ans = "";
        char ch2 = 32;
        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] != 0) {

                ch2 = (char) i;
                ans = ans + ch2 + ch1[i];
            }
        }
            return ans;

    }
    public static String charFrequencyUsingMap(String compStr) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < compStr.length(); i+=2) {

            if (!map.containsKey(compStr.charAt(i))) {
                map.put(compStr.charAt(i), Character.getNumericValue(compStr.charAt(i+1)));
            } else {
                map.replace(compStr.charAt(i), map.get(compStr.charAt(i)) + Character.getNumericValue(compStr.charAt(i+1)));
            }
        }

        String correctStr = map.entrySet().stream().map(e -> e.getKey()+""+e.getValue()).collect(Collectors.joining(""));

        return (correctStr);
    }
        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            String s=sc.nextLine();
            System.out.println(charFrequency(s));
            System.out.println(charFrequencyUsingMap(s));

        }
}
