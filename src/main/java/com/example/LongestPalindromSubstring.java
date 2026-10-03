package com.example;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindromSubstring {

    public static void main(String[] args) {
        String s="baab";
        StringBuilder sb= new StringBuilder(s);
        String str="";
        String rev="";
        String ans="";
        int maxLength=0;
        int right =s.length()-1;
        boolean isPalindrome=false;
        List<Character> lt= new ArrayList<>();
        boolean val=false;
        for(int left=0;left<s.length();left++){

            val=isSubString(s,left,right);


           lt.add(s.charAt(left));


        }
        if (isPalindrome){
            System.out.println("is palindrome");
        }
        else {
            System.out.println("is not palindrome");
        }

    }
   private static boolean isSubString(String s, int left, int right) {
        boolean isPalindrome=false;
       while (left <right  && s.charAt(left) == s.charAt(right)) {
           left--;
           right++;
           isPalindrome=true;
       }
       return isPalindrome;
   }
}
