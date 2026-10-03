package streamexample.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateElem {
    public static void main(String args[]) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = Arrays.asList(10, 20, 50, 40, 20, 50).stream().filter(s -> !set.add(s)).collect(Collectors.toList());
        list.forEach(y -> System.out.println(y));
    }
}
