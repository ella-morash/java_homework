package com.company;


public class Student implements IStudent {

    private String name;
    private int yearOfBirthday;
    private double gpa;

    public Student(String name, int yearOfBirthday, double gpa) {

        this.name = name;
        this.yearOfBirthday = yearOfBirthday;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", yearOfBirthday=" + yearOfBirthday +
                ", gpa=" + gpa +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirthday() {
        return yearOfBirthday;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public void notifyTeacher(Task task,ITeacher teacher) {
        teacher.taskIsDone(task);


    }

    @Override
    public void doTask(Task task) {
        System.out.println(task);
    }


}