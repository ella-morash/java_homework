package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Create new class Students with following fields (String name, int yearOfBirthday, double gpa).
        // Create the array of several students.
        // Your program should ask user how to sort students (by name, by age, or by gpa)
        // and display students accordingly
//        Scanner sc = new Scanner(System.in);
//        System.out.println("How would you like to sort?");
//        System.out.println("Please choose one of following:" + System.lineSeparator() + "name" +
//                System.lineSeparator() + "gpa" + System.lineSeparator() + "birthday");
//        String answer = sc.next().toLowerCase();
//        sc.close();
        Student student1 = new Student("Alex",1992,5.7);
        Student student2 = new Student("Olga",2015,3.7);
        Student student3 = new Student("Dima",1998,8.2);

        Task task1 = new Task("implement stack data structure via array");
        Task task2 = new Task("implement linkedlist data structure via array");

        Teacher teacher = Teacher.getINSTANCE("John");
        teacher.add(student1);
        teacher.add(student2);
        teacher.add(student3);
        teacher.notifyStudent(task1);
        teacher.notifyStudent(task2);

        System.out.println("Tasks are completed below");

        student1.notifyTeacher(task1,teacher);
        student2.notifyTeacher(task2,teacher);
        student3.notifyTeacher(task1,teacher);



    }
}
