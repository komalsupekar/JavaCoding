package com.example;

import java.util.HashMap;
import java.util.Map;

public class IndexOfSumSubArray {

    public static void main(String[] args) {
        int nums[] = {3,2,4};
        int target = 6;
       /* int arr[] = new int[2];//thsi approach when array is sorted
            int left = 0;
            int right = nums.length-1;
            while(left!=right){
                if(nums[left]+nums[right]==target){
                    arr[0] = left;
                    arr[1] = right;
                    break;
                }
                else if(nums[left]+nums[right]>target){
                    right--;
                }
                else{
                    left++;
                }
            }
        System.out.println(arr[0] + " " + arr[1]);*/

        //Approach2:Using HashMap
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int val=target-nums[i];
            if(map.containsKey(val)){
                System.out.println(map.get(val) + " " + i);
            }
            map.put(nums[i],i);
        }

    }
}
