package streamexample.example;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseWordsFromSentense {
    public static void main(String args[]){
        String str="I am Komal supekar ";
        String[] arr=str.split("\\s+");
        //Arrays.stream(IntStream.range(0, arr.length).mapToObj(s -> arr[arr.length-1 - s] +" ").toArray()).forEach(System.out::print);

        //now reverse each chars
        //Way1:avoid splitting twice
        String ans= IntStream.range(0,arr.length).mapToObj(s->new StringBuilder(arr[arr.length-1-s]).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println("ans string="+ans);


        //Way2:
        String result = Arrays.stream(arr).map(s->new StringBuilder(s).reverse().toString())
                .collect(Collectors.joining(" "));
        String[]res=result.split("\\s+");
        Arrays.stream(IntStream.range(0,res.length).mapToObj(s-> res[res.length- 1 - s] +" ").toArray()).forEach(System.out::print);
    }
}
