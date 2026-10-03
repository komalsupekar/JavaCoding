package com.example;

public class LetterCountInWord {
    public static void main(String[] args) {
        String word = "aaaabbbccde";
        int ct=1;
        String ans="";

        for(int i=0;i<word.length()-1;i++){
            if(word.charAt(i)==word.charAt(i+1)){
                ct++;
            }
            else{
                ans+=word.charAt(i)+""+ct;
                ct=1;
            }
        }
        System.out.println("ans:" + ans);
    }
}
