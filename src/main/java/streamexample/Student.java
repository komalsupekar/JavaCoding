package streamexample;

public class Student {
    String name;
    int age;
    String dept;
    int score;

    Student(String name, int age,String dept, int score){
        this.name=name;
        this.age=age;
        this.dept=dept;
        this.score=score;
    }

    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    public String getDept(){
        return this.dept;
    }
    public int getScore() {
        return this.score;
    }

    @Override
    public String toString(){
        return name + " " + age + " " + dept + " " + score;
    }
}
