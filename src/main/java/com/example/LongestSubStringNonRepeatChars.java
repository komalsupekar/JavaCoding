package com.example;

import java.util.*;

public class LongestSubStringNonRepeatChars {
    public static void main(String args[]){
        String str="abcdabca";
        int k=0;
        int max=-1;
        int maxStart=0;
        Map<Character, Integer>map=new HashMap<>();
        Set<Character> set= new LinkedHashSet<>();
        int left=0;
        for(int i=0;i<str.length();i++){

            if(map.containsKey(str.charAt(i))){
                k=Math.max(k, map.get(str.charAt(i))+1);
            }
            map.put(str.charAt(i),i);
            //sub=str.substring(k,i+1);
            max=Math.max(max,i-k+1);
            maxStart=k;

        }
        System.out.println("max:"+max);
        System.out.println("end" +maxStart+max);
        //String res=str.substring(maxStart,maxStart+max);
        //System.out.println(res);
        System.out.println(max);

    }
}


/*

if(set.contains(str.charAt(i))){
                set.remove(left++);
            }
            set.add(str.charAt(i));
            max=Math.max(max,i-left+1);
* */