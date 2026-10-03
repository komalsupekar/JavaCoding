package streamexample.example;

public class Employee {
    int id;
    String name;
    String dept;
    Double sal;

    public Employee(int id, String name, String dept, double sal) {
        this.id=id;
        this.name=name;
        this.dept=dept;
        this.sal=sal;
    }

    public String getName(){
        return this.name;
    }
    public String getDept(){
        return this.dept;
    }
    public Double getSal(){
        return this.sal;
    }

    @Override
    public String toString(){
        return id + " " + name + " " + dept + " " + sal;
    }
}
