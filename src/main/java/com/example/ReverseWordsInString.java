package com.example;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordsInString {

    public static void main(String[] args) {
        String s = "Hello  World komal hi";
        String[] words = s.split(" ");
        List<String> lt= new ArrayList<>();
        String[]arr=s.split(" ");
        for(int i=arr.length -1;i>=0;i--){
            if(arr[i].length()>0){
                lt.add(arr[i]);
            }
        }

        String ans=String.join(" ",lt);
        System.out.println(ans) ;
    }
}
