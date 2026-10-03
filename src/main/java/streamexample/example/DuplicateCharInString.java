package streamexample.example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateCharInString {
    public static void main(String args[]) {
        Set<Character> set = new LinkedHashSet<>();
        String str = "programminng";
        /*str.chars().mapToObj(c->(char)c).filter(s->!set.add(s)).forEach(System.out::println);

        System.out.println("stream out end for duplicate chars");


        //O(n)
        Set<Character> set2 = new HashSet<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(!set2.add(c)){
                System.out.println("duplicate char ="+c);
                break;
            }
        }
*/
        //remove duplicate
        str.chars().mapToObj(c->(char)c).filter(p ->set.add(p)).forEach(System.out::print);
    }
}
