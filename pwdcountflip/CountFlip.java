package com.example.pwdcountflip;

public class CountFlip {

    public static int countFlips(String binaryPassword) {
        // Initialize the flip counter
        int flips = 0;

        // Traverse through the binary string and count changes
        for (int i = 1; i < binaryPassword.length(); i=i+2) {
            // If there is a change between consecutive bits (0->1 or 1->0)
            if (binaryPassword.charAt(i) != binaryPassword.charAt(i - 1)) {
                flips++;
            }
        }

        return flips;
    }

    public static void main(String[] args) {
        // Example binary password
        String binaryPassword = "110011";

        // Call countFlips function
        int flipCount = countFlips(binaryPassword);

        // Output the result
        System.out.println("The number of flips in the binary password is: " + flipCount);
    }
}