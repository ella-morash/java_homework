package com.company;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import java.util.List;


class SortingFactoryTest {
    Students student;



    @Test
    void testSortByName() {
        String answer = "name";
        Students student1 = new Students("Alex",1992,5.7);
        Students student2 = new Students("Olga",2015,3.7);
        Students student3 = new Students("Dima",1998,8.2);

        List<Students> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        Object[] studentsArray = students.toArray();
        Object[] expected = {student1,student3,student2};
        SortingFactory.sortStudents(answer,students);
        Object[] sortedArray = students.toArray();
        Assertions.assertArrayEquals(expected,sortedArray);

    }
    @Test
    void testSortByGpa() {
        String answer = "gpa";
        Students student1 = new Students("Alex",1992,5.7);
        Students student2 = new Students("Olga",2015,3.7);
        Students student3 = new Students("Dima",1998,8.2);

        List<Students> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        Object[] studentsArray = students.toArray();
        Object[] expected = {student2,student1,student3};
        SortingFactory.sortStudents(answer,students);
        Object[] sortedArray = students.toArray();
        Assertions.assertArrayEquals(expected,sortedArray);

    }
    @Test
    void testSortByBirthday() {
        String answer = "birthday";
        Students student1 = new Students("Alex",1992,5.7);
        Students student2 = new Students("Olga",2015,3.7);
        Students student3 = new Students("Dima",1998,8.2);

        List<Students> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        Object[] studentsArray = students.toArray();
        Object[] expected = {student1,student3,student2};
        SortingFactory.sortStudents(answer,students);
        Object[] sortedArray = students.toArray();
        Assertions.assertArrayEquals(expected,sortedArray);

    }
    @Test
    void testIfDefault() {
        String answer = "hhfs";
        Students student1 = new Students("Alex",1992,5.7);
        Students student2 = new Students("Olga",2015,3.7);
        Students student3 = new Students("Dima",1998,8.2);

        List<Students> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);


        Assertions.assertThrows(IllegalArgumentException.class,()->SortingFactory.sortStudents(answer,students));

    }

}