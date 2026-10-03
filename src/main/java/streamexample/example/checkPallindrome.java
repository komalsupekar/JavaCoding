package streamexample.example;

import java.util.stream.IntStream;

public class checkPallindrome {
    public static void main(String args[]){
        String str="madame";

        boolean ispalindrom= IntStream.range(0,str.length()/2).allMatch(i->str.charAt(i)==str.charAt(str.length()-1-i));
        if(ispalindrom){
        System.out.println("Palidrom");
            }
        else{
            System.out.println("no palid");
        }
    }
}
