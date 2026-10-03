package com.example;

import java.util.HashMap;
import java.util.Map;

public class CheckOccurenceInString {

    public static void main(String[] args) throws Exception{
        String s ="absvcsba";
        Map<Character,Integer> map= new HashMap<>();
        char c;
        for(int i=0;i<s.length();i++){
             c = s.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }
        //map.forEach((k,v)-> System.out.println("Key=" + k + " Value ="+v));
        for(Map.Entry<Character,Integer> entry:map.entrySet())
        {
            if(entry.getValue()==1){
                System.out.println(entry);
            }
        }
        //System.out.println(entry.getKey());
    }
}
