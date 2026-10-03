package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GropuWordsByLength {

    public static void main(String[]args){
        String words[] = {"a","bb","ccc","dd","eee"};
        Map<Integer, List<String>> map = new HashMap<>();
        for(String word:words){
            /*map.putIfAbsent(word.length(), new ArrayList<>());
            map.get(word.length()).add(word);*/
            map.computeIfAbsent(word.length(),k->new ArrayList<>()).add(word);
        }
        System.out.println(map);
    }
}
