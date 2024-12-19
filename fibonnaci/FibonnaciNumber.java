package com.example.fibonnaci;

public class FibonnaciNumber {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return (fibonacci(n - 1) + fibonacci(n - 2));
        }
    }

    public static void main(String[] args){
        int n=10;
        System.out.println("Fib series");{
            for(int i=0;i<n;i++){
                System.out.println(fibonacci(i)+" ");
            }
        }
    }

}