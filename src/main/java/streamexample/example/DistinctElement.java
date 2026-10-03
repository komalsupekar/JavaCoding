package streamexample.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DistinctElement {
    public static void main(String args[]){

        //Find Uinique element
        List<Integer> distinctE= Arrays.asList(10,20,50,40,20).stream().distinct().collect(Collectors.toList());
        distinctE.forEach(y->System.out.println(y));


    }
}
