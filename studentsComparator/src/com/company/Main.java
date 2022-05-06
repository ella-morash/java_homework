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
        Scanner sc = new Scanner(System.in);
        System.out.println("How would you like to sort?");
        System.out.println("Please choose one of following:" + System.lineSeparator() + "name" +
                System.lineSeparator() + "gpa" + System.lineSeparator() + "birthday");
        String answer = sc.next().toLowerCase();
        Students student1 = new Students("Alex",1992,5.7);
        Students student2 = new Students("Olga",2015,3.7);
        Students student3 = new Students("Dima",1998,8.2);

        List<Students> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        students.forEach(st-> System.out.println(st));
        SortingFactory.sortStudents(answer,students);
        System.out.println("******************************");
        students.forEach(st-> System.out.println(st));
    }
}
