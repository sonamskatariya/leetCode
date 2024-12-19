package com.example.fibonnaci;

import java.util.HashMap;
import java.util.Map;

public class DynamicFibonnaciNumber {
    private static Map<Integer, Integer> memo = new HashMap<>();

    public static int fibmemo(int n) {
        if (n <= 1) {
            return n;
        } if (memo.containsKey(n)) {
            return memo.get(n);
        }
            int result = (fibmemo(n - 1) + fibmemo(n - 2));
            memo.put(n, result);
            return result;


    }

    public static void main(String[] args) {
        int n = 50;
        System.out.println("Fib series");
        {
            for (int i = 0; i < n; i++) {
                System.out.println(fibmemo(i) + " ");
            }
        }

    }
}
