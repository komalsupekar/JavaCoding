package streamexample.example;

import java.util.stream.IntStream;

public class Anagrams {
    public static void main(String args[]){

       String str="Citibankaaaa";
       int ct=0,ct2=0;
       for(int i=0;i<str.length();i++){
           if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
               ct++;
           }else{
              ct2++;
           }
       }
       //ans=ans+str.charAt(str.length()-1)+ct;
       System.out.println("vowels count="+ct+ "Consonant ct="+ct2);
    }
}
