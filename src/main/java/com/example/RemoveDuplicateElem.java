package com.example;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateElem {
    public static void main(String args[]){
        int arr[]={1,1,2,2,2,3,3,4,5,5,6};
        int n=arr.length;
        List<Integer> list= new ArrayList<>();
        for(int i=0;i<n;i++){
            if(list.contains(arr[i])){
                continue;
            }else {
                list.add(arr[i]);
            }
        }
        list.forEach(i->System.out.println(i));
    }
}
