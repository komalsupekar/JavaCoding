package streamexample.example;


import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreqeucyOfChar {
    public static void main(String args[]){
        String str="Programming";
        str.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(
                        Function.identity(), LinkedHashMap::new,Collectors.counting())
                        )
                .entrySet()
                .stream().forEach(System.out::println);
    }
}
