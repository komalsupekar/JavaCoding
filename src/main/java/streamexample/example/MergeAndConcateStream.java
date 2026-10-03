package streamexample.example;

import java.util.stream.Stream;

public class MergeAndConcateStream {
    public static void main(String args[]) {
        String st1 = "Komal";
        String st2 = "developer";

        Stream<Character> stream1=st1.chars().mapToObj(c->(char)c);
        Stream<Character> stream2=st2.chars().mapToObj(c->(char)c);

        //Stream<Character>ans=
    }
}