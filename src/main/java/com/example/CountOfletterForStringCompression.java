package com.example;

public class CountOfletterForStringCompression {
    public static void main(String args[]){

        String str="aaabbcccc";
        int ct=1;
        String ans="";
        for(int i=1;i<=str.length();i++){
            if(i<str.length() && str.charAt(i)==str.charAt(i-1)){
                ct++;
            }else{
                ans=ans+str.charAt(i-1)+ct;
                ct=1;
            }
        }
        //ans=ans+str.charAt(str.length()-1)+ct;
        System.out.println("Compressed String="+ans);
    }
}
