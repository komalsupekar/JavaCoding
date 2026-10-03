package streamexample;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExamples {

    public static void main(String[] args) {
        // Example of using streams to filter and collect data
        String[] words = {"apple", "banana", "cherry", "date", "elderberry"};



        // Filter words that start with 'b' and collect them into a list
        //List<String> filteredWords = Arrays.stream(words).filter(y-> y.startsWith("b")).collect(Collectors.toList());

        //Arrays.asList(words).stream().filter(y->y.startsWith("a")).forEach(System.out::println);

        //Arrays.stream(words).map(String::length).peek(1).forEach(System.out::println);

        //System.out.println(filteredWords); // Output: [banana]
        Student s1 = new Student("John", 20, "Computer Science", 100);
        Student s2 = new Student("Alice", 22, "IT", 90);
        Student s3 = new Student("bhairav", 22, "IT", 80);

        List<Student> studentList = Arrays.asList(s1, s2, s3);
        long ct = studentList.stream().count();
        System.out.println("Count of Students: " + ct);

        String reduceString = Arrays.stream(words).map(String::toUpperCase)
                .reduce(" ", (student, elem) -> student + " " + elem)
                .toString().toUpperCase();
        System.out.println("Reduced String: " + reduceString);

        int maxLength = Arrays.stream(words).max(String::compareTo).get().length();
        System.out.println("Max Length: " + maxLength);

        //Student secondHighest= studentList.stream().sorted(Comparator.comparing(Student::getScore()).reverse().skip(1).get();

        Student secondHighest = studentList.stream().sorted((a, b) -> b.getScore() - a.getScore()).skip(1).findFirst().get();
        System.out.println("Second Highest Score Student: " + secondHighest.getName() + " with score: " + secondHighest.getScore());

        //highest score student from each department using groupingBy
        Map<String,Student> highestScoreStudent = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDept,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getScore)), Optional::get))
                );

        highestScoreStudent.forEach((dept,student)->
                System.out.println("highestScoreStudent" + student.getName() + " with score: " + student.getScore() + " from dept: " + dept)
        );

        String peekString=Arrays.stream(words).peek(System.out::println).filter(s->s.length()>5).findFirst().get();
        System.out.println("Peek String: " + peekString);

/*
        List<Student>filteredList= studentList.stream()
                //.filter(student->student.getAge()>20)
                .sorted(Comparator.comparing(Student::getScore))
                .collect(Collectors.toList());

        List<String>updatedList=studentList.stream().map(s->s.getName().toUpperCase()).collect(Collectors.toList());
                //studentList.stream().filter(s->s.getName().startsWith("S")).collect(Collectors.toList());

        System.out.println("updatedList: " + updatedList);

        //TO GET THE SECOND HIGHET SCORE STUDENT..get distinct->sort

        //Student st= studentList.stream().distinct().sorted(Comparator.comparing(Student::getScore)).skip(1)

        //GET the student having the higer score
        //Student st= studentList.stream().max(Comparator.comparing(Student::getScore)).get();
        //System.out.println("Student with highest score: " + st.getName() + " with score: " + st.getScore());

//        Student st=studentList.stream().sorted(Comparator.comparing(Student::getScore).reversed()).findFirst().get();
//        System.out.println("Student with highest score: " + st.getName() + " with score: " + st.getScore());

        //Student st=studentList.stream().sorted((a,b)->b.getScore()-a.getScore()).findFirst().get();
        //System.out.println("Student with highest score: " + st.getName() + " with score: " + st.getScore());

        Student st=studentList.stream().sorted(Comparator.comparing(Student::getScore).reversed()).findFirst().get();
        System.out.println("Student with highest score: " + st.getName() + " with score: " + st.getScore());
*/

        //check if strings are anagrams 2 ways

        String str1 = "komalsuk";
        String str2 = "klomaspp";

        //time complexity O(nlogn) and space complexity O(n)
        /*Boolean isAnagram= false;
        if(str2.length()==str1.length() && Arrays.stream(str1.toLowerCase().split("")).sorted().collect(Collectors.toList()).equals(Arrays.stream(str2.toLowerCase().split("")).sorted().collect(Collectors.toList()))){
            isAnagram=true;
        }
        if(isAnagram){
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        }else{
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }*/

        //way 2: time complexity O(n) and space complexity O(1)
        boolean isAnagram = str1.length() == str2.length() && haveSameCharacterCount(str1, str2);
        System.out.println(str1 + " and " + str2 +
                (isAnagram ? " are anagrams." : " are not anagrams."));


        // cget the count of vowels in a string
//        String str3 = "komal";
//        long vowelCount= str3.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) != -1).count();
//        System.out.println("Count of vowels in " + str3 + ": " + vowelCount);


        List<Integer>lists= Arrays.asList(1,5,2,3,4,6,10,8,9);
        Integer ans = lists.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("today Second highest number: " + ans);
    }

    private static boolean haveSameCharacterCount(String str1, String str2) {
        int[] count = new int[256]; // Assuming ASCII characters
        for (char c : str1.toCharArray()) {
            count[c]++;
        }
        for (char c : str2.toCharArray()) {
            count[c]--;
        }

        return Arrays.stream(count).allMatch(c -> c == 0);
    }
}
