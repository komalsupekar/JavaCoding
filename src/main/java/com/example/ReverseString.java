package com.example;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[]args){
        String str="komal";

        int i=0;
        int j=str.length()-1;
        char arr[]=str.toCharArray();
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        String ans=String.valueOf(arr);
        System.out.println("reversed string is: "+ ans);


        String str2="\"  hello world  \"";
        String[] arr2=str2.split("\\s+");
        StringBuilder sb=new StringBuilder();

        for(int k = arr2.length-1; k>=0;k--){
           sb.append(arr2[k]);
           if(i>0){
               sb.append(" ");
           }
        }
        System.out.println("reversed sentense"+ sb.toString());
    }
}
