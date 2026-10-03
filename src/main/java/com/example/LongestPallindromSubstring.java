package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestPallindromSubstring {
    public static void main(String args[]) throws Exception {
        String s = "babad";
        int n = s.length();
        int maxLength = 1;
        String str = "";
        boolean flag=false;
        Map<Integer,String> map= new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                str = s.substring(i, j + 1);
                if(isPallindrom(str)){
                    maxLength=Math.max(maxLength, str.length());
                    map.put(str.length(),str);
                }

            }
        }
        System.out.println(maxLength);
        System.out.println("map:"+map.get(maxLength));
    }

    public static boolean isPallindrom(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        if (str.equals(sb.toString())) {
            return true;
        } else {
            return false;
        }
    }
}
