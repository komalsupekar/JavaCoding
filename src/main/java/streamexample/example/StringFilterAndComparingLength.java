package streamexample.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringFilterAndComparingLength {
    public static void main(String args[]){

        List<String> list= Arrays.asList("komal","nik","sham","rajvir", "shivanshi","kedarnath");

        list.stream().filter(s->s.length()>3).sorted(Comparator.comparingInt(String::length)).limit(4).forEach(System.out::println);
    }
}
