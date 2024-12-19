package com.example.oddEvenNumber;
import java.util.stream.IntStream;

public class OddEvenNumber {

    public static void oddEven(int n){

        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i+" Number is Even ");
            }
            else{
                System.out.println(i+" Number is Odd");
            }
        }
    }

    // Method to print even numbers up to n using streams
    public static void printEvenNumbers(int n) {
        System.out.println("Even numbers up to " + n + ":");
        IntStream.rangeClosed(1, n)
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);

        System.out.println("Odd numbers up to " + n + ":");
        IntStream.rangeClosed(1, n)
                .filter(i -> i % 2 != 0)  // Filter odd numbers
                .forEach(System.out::println);  // Print each odd number
    }

    public static void main(String[] args){
        oddEven(10);

        printEvenNumbers(5);
    }
}
