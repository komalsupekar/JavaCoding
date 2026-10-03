package com.example;

import java.util.ArrayList;
import java.util.List;

public class LongestPrefixStrings {
    public static void main(String[] args) {
        String[] strs = {"glower","f","flow","flight"};
        String prefix = longestCommonPrefix(strs);
        System.out.println(prefix);
    }

    private static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].startsWith(prefix)) {
                continue;
            } else {
                while (!strs[i].startsWith(prefix)) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                    if (prefix.isEmpty()) {
                        return "No common prefix";
                    }
                }
            }
        }
        return prefix;
    }



    public int minimumRecolors(String blocks, int k) {
        long ct=0;
        int min=10000;

        for(int i=0;i< blocks.length()-k+1;i++){
            ct= blocks.substring(i,i+k).chars().filter(c -> c=='W').count();
            min=(int)Math.min(min,ct);
        }
        return min;
    }
}
