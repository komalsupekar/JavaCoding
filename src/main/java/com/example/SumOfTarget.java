package com.example;

import java.util.HashMap;
import java.util.Map;

public class SumOfTarget {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};
        int target = 9;
        int index1 = -1;
        int index2 = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) {
                index1 = map.get(target - arr[i]);
                index2 = i;
            }
            map.put(arr[i], i);
        }
        System.out.println("Index1: " + index1 + " Index2: " + index2);
    }
}
