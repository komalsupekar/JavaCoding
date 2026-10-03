package streamexample.example;

import java.util.Arrays;

public class ToUppercaseString {
    public static void main(String args[]){

        String[] strArr={"komal","Raju", "Sham"};
        Arrays.stream(strArr).map(String::toUpperCase).forEach(System.out::println);
    }
}
