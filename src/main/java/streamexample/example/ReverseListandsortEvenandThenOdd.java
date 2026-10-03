package streamexample.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
* Given a list of integers:
👉 Reverse the order
👉 Keep distinct values
👉 Place odd numbers first
👉 Place even numbers after them
*
* */
public class ReverseListandsortEvenandThenOdd {

    public static void main(String args[]){

        List<Integer>list= Arrays.asList(10,40,23,15,50,10,40);
        List<Integer>list1=IntStream.range(0,list.size()).mapToObj(s->list.get(list.size()-1-s)).distinct()
                .filter(n->n%2==0).collect(Collectors.toList()).stream().filter(n->n%2!=0).collect(Collectors.toList());
        //list1.forEach(System.out::print);


        Set<Integer> set= new HashSet<>();

        List<Integer> ans =Arrays.asList(10,20,30,10,20).stream().filter(s->!set.add(s)).collect(Collectors.toList());

        System.out.println(ans);


    }
}
