package com.example;

import java.util.*;

public class FindMissingNumber {
    public static void main(String args[]){
        int arr[]={6,4,9,10,7,8};
        List<Integer> set=new ArrayList<>(arr.length+1);
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum number in the array: "+min);
        for(int i=min;i<=arr.length+1;i++) {
            if (!set.contains(i)) {
                System.out.println(i);
                break;
            }
        }



        /*int n=arr.length;
        int a=(n+2)*(n+1)/2;

        int num= Arrays.stream(arr).sum();
        System.out.println(a-num);*/
    }
}
