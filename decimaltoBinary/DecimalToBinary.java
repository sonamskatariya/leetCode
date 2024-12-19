package com.example.decimaltoBinary;

import java.util.Scanner;

public class DecimalToBinary {

    public static void decimaltoBinary(){
        {

            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            sc.close();

            String binNum = "";

            while (num != 1) {

                binNum += num % 2;
                num /= 2;

            }

            binNum += num;

            System.out.println(new StringBuilder(binNum).reverse().toString());
        }
    }


    public static void main(String[] args){
        decimaltoBinary();
    }
}
