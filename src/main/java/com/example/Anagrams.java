package com.example;

public class Anagrams {

    public static void main(String args[]){

        String str1="listen";
        String str2="silent";
        int k1=0;
        int k2=0;
        for(int i=0;i<str1.length();i++){
            k1+=str1.charAt(i);
        }

        for(int i=0;i<str2.length();i++){
            k2+=str2.charAt(i);
        }
        if(k1==k2){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("no Anagrams");
        }

        Integer a=10;
        Integer b=10;
        Boolean c=a==b;
        System.out.println("value of a b"+ c);//true

        

    }
}
