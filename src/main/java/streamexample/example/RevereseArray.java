package streamexample.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RevereseArray {
    public static void main(String args[]){

        int[] arr= {1,2,3,4,5};

        //IntStream create integer stream starting from 0 to arr length(any lenghth provided)
        Arrays.stream(IntStream.range(0,arr.length)
                .map(i->arr[arr.length-1 -i])    //For each index i, we fetch the element from the opposite end.
                .toArray()).forEach(y->System.out.println(y));
        //System.out.println(Arrays.toString(reversedArray));


        String str="komal";

        String rev=IntStream.range(0,str.length()).mapToObj(i->str.charAt(str.length()-1-i))
                .map(String::valueOf).collect(Collectors.joining());
        System.out.println("Revered String="+rev);


        String stree="komal";
        System.out.println("reveresed String="+rev);
        String ans2="";
        for(int i=stree.length()-1;i>=0;i--){
            ans2+=stree.charAt(i);
        }
        System.out.println("ans of str="+ans2);
    }
}
