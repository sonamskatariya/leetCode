package com.example.missingarraynumber;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingArrayNumber {


    public static List<Integer> findMissingNumbers(int[] arr,int start,int end)
    {
        Set<Integer> Numset=new HashSet<>();
        List<Integer> MissingNumberList=new ArrayList<>();
        for(int i:arr){
            Numset.add(i);
        }
        for(int i=start;i<end;i++){
            if(!Numset.contains(i)){
            MissingNumberList.add(i);
            }
        }
        return MissingNumberList;
    }

    public static void main(String[] args){
        int[] arr={1,2,3,5,6,7};
        int start=1;
        int end=10;
        List<Integer> missing = findMissingNumbers(arr, start, end);
        System.out.println(missing);
    }
}
