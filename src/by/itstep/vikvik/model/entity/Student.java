package by.itstep.vikvik.model.entity;

public class Student extends Human {
    private double mark;

    public Student(){

    }

    public Student(String name, int age, double mark) {
        setName(name);
        setAge(age);
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}