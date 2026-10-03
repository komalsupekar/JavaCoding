package com.example;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    public static void main(String args[]){
        String str="absvcsba";
        Map<Character, Integer> map=new HashMap<>();

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(int i=0;i<map.size();i++){
            if(map.get(str.charAt(i))==1){
                System.out.println("non repeating:"+str.charAt(i));
                break;
            }
        }
        for(Map.Entry<Character,Integer>entr:map.entrySet()){
            if(entr.getValue()==1){
                System.out.println("non repeating:"+entr.getKey());
                break;
            }
        }
    }
}
