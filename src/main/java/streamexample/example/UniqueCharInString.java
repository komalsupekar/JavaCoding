package streamexample.example;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharInString {

    public static void main(String args[]){

        String str = "komalkllll";
        //O(n^2)/*
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            String sub=str.substring(i+1,str.length());
            if(!sub.contains(String.valueOf(c))){
                System.out.println("unique first character="+str.charAt(i));
                break;
            }
        }

        for(int i=0;i<str.length();i++){
            if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
                System.out.println("1st unique character in string="+str.charAt(i));
                break;
            }
        }

        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<map.size();i++){
            /*if(map.get(str.charAt(i))==1){
                System.out.println("unique chars="+str.charAt(i));
                break;
            }*/

        }

        for(Map.Entry<Character,Integer>en:map.entrySet()){
            System.out.println("character occurence="+ en.getKey() + en.getValue());
        }
    }
}
