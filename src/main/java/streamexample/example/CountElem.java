package streamexample.example;

import java.util.Arrays;

public class CountElem {
    public static void main(String [] args) {

        //get count
        long ct = Arrays.asList(10, 20, 55, 43, 20).stream().count();
        System.out.println(ct);

        //get 1st elem
        long firstElem = Arrays.asList(10, 20, 55, 43, 20).stream().findFirst().get();
        System.out.println(firstElem);
    }
}
