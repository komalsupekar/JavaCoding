package com.example;

import java.util.List;

public class RemoveDuplicateValues {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3, 4, 4, 5,5,5,6};
        int n = arr.length;
        int k = 1;
        //int j = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i]!= arr[k-1]) {    //for output arry we are just storing it using k..so check if arr[i] equals to arr[k-1] i.e. existing kth elem
                arr[k]=arr[i];
                System.out.println("arr[k]="+arr[k]);
                k++;
            }
        }
        System.out.println("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.println(arr[i]);
        }
    }
}
