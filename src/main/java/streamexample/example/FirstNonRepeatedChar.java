package streamexample.example;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {
    public static void main(String args[]){
    String str = "programming";
     Character result=str.chars().mapToObj(c->(char)c)
             .collect(Collectors.groupingBy(
                     Function.identity(), LinkedHashMap::new,Collectors.counting()
                )
             ).entrySet()
             .stream()
             .filter(s->s.getValue()==1)
             .map(Map.Entry::getKey)
             .findFirst().get();
     System.out.println("First non repeated character=" + result);
    }
}
