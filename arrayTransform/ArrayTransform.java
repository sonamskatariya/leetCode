package com.example.arrayTransform;
import java.util.Arrays;

public class ArrayTransform {

    public static void oddEvenArrayTransform(int[] arr)
    {
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                arr[i]+=3;
            }else{
                arr[i]-=3;
            }
        }
    }


    public static void main(String[] args){
        int[] arr={3,4,9};
        oddEvenArrayTransform(arr);
        System.out.println(Arrays.toString(arr));

    }
}
