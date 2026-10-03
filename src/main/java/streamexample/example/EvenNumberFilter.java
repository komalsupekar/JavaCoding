package streamexample.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EvenNumberFilter {
    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(10, 20, 55, 43, 20).stream().filter(s -> s%2==0).collect(Collectors.toList());
        list.forEach(y -> System.out.println(y));

        Arrays.asList(10, 20, 55, 43, 20).stream().filter(s -> s>50).forEach(System.out::println);

    }
}
