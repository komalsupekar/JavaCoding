package streamexample.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HighestNumber {

    public static void main(String args[]) {

        //this give highest number
        //int highestNum = Arrays.asList(10, 20, 50, 40, 20).stream().max(Comparator.comparingInt(Integer::intValue)).get();

        //This give second highest number
        int highestNum = Arrays.asList(10, 20, 50, 40, 20).stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(highestNum);
    }

    }
