package streamexample.example;

import java.util.*;
import java.util.stream.Collectors;

public class OperationOnDepartment {
    public static void main(String args[]){

        List<Employee> employees= Arrays.asList(
                new Employee(1,"john","HR",50000),
                new Employee(2,"ram","dev",70000),
                new Employee(3,"sham","it",80000),
                new Employee(4,"rami","it",75000),
                new Employee(2,"karanam","dev",90000)

        );

        //Get avg sal of each dept
        Map<String, Double> result=employees.stream()
                .collect(Collectors.groupingBy(
                                    Employee::getDept,
                                    Collectors.averagingDouble(Employee::getSal)
                        ));

        System.out.println("Avg sal of each dept"+result);

        //highest Salary of each dept
        Map<String, Employee> highSal= employees.stream().collect(Collectors.groupingBy(
                Employee::getDept,
                Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparing(Employee::getSal)), Optional::get)
                )
        );
        System.out.println("highest sal in ecah dept"+highSal);

        //second highest salary
        Map<String, Employee>seconHighSal=employees.stream().collect(Collectors.groupingBy(
                Employee::getDept,
                Collectors.collectingAndThen(Collectors.toList(),
                        lt->lt.stream()
                                .sorted(Comparator.comparingDouble(Employee::getSal).reversed())
                                .skip(1)
                                .findFirst()
                                .orElse(null)
        )));

        System.out.println("Second highe sal="+ seconHighSal);
    }
}
