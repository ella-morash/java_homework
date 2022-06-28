package com.company.homework_28_06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {



    @Test
    void getListStudentsNormalCase() {
        Main.Student student1 = new Main.Student("Alex", List.of(1.3,1.6,1.7));
        Main.Student student2 = new Main.Student("Alex", List.of(1.3,1.6,1.7));
        Main.Student student3 = new Main.Student("Olga", List.of(1.3,1.6,1.7));
        Main.Student student4 = new Main.Student("Nata", List.of(1.3,1.6,1.7));
        Main.Group group1 = new Main.Group("math",List.of(student1,student3));
        Main.Group group2 = new Main.Group("java",List.of(student2,student4));
        List<Main.Group> groups = List.of(group1,group2);
        List<Main.Student> expected = List.of(new Main.Student("Alex", List.of(1.3,1.6,1.7)),
                new Main.Student("Olga", List.of(1.3,1.6,1.7)),
                new Main.Student("Nata", List.of(1.3,1.6,1.7)));
        Assertions.assertEquals(expected,Main.getAllStudents(groups));

    }

    @Test
    void getListStudentsListWithNulls() {
        Main.Student student1 = new Main.Student("Alex", List.of(1.3,1.6,1.7));
        Main.Student student2 = new Main.Student("Alex", List.of(1.3,1.6,1.7));
        Main.Student student3 = new Main.Student("Olga", List.of(1.3,1.6,1.7));
        Main.Student student4 = new Main.Student("Nata", List.of(1.3,1.6,1.7));
        Main.Group group1 = new Main.Group("math",List.of(student1,student3));
        Main.Group group2 = new Main.Group("java",List.of(student2,student4));
        List<Main.Group> groups = null;
        List<Main.Student> expected = new ArrayList<>();
        Assertions.assertEquals(expected,Main.getAllStudents(groups));

    }

    @Test
    void getTheWholeSum() {
        Main.Student student1 = new Main.Student("Alex", List.of(1.3,1.6,1.7));
        Main.Student student2 = new Main.Student("Alex", List.of(1.3,1.6,1.7));
        Main.Student student3 = new Main.Student("Olga", List.of(1.3,1.6,1.7));
        Main.Student student4 = new Main.Student("Nata", List.of(1.3,1.6,1.7));
        Main.Group group1 = new Main.Group("math",List.of(student1,student3));
        Main.Group group2 = new Main.Group("java",List.of(student2,student4));
        List<Main.Group> groups = List.of(group1,group2);
        Double expected = 13.8;
        //Assertions.assertEquals(expected,Main.getTheWholeSum(groups));

    }
    @Test
    void getSpecificStudents() {
        Main.Student student1 = new Main.Student("Alex", List.of(0.3,1.6,1.2)); //3.1
        Main.Student student2 = new Main.Student("Alex", List.of(0.3,1.6,1.2));
        Main.Student student3 = new Main.Student("Olga", List.of(1.3,1.9,1.7)); // 4.9
        Main.Student student4 = new Main.Student("Nata", List.of(1.3,2.4,1.7)); // 5.4
        Main.Group group1 = new Main.Group("math",List.of(student1,student3));
        Main.Group group2 = new Main.Group("java",List.of(student2,student4));
        List<Main.Group> groups = List.of(group1,group2);
        int sum = 5;
        List<Main.Student> expected = List.of(new Main.Student("Alex", List.of(0.3,1.6,1.2)),
                new Main.Student("Olga", List.of(1.3,1.9,1.7)));
        Assertions.assertEquals(expected,Main.getSpecificStudents(groups,sum));

    }

    @Test
    void testFib() {


        List<Integer> expected = List.of(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181);
        Assertions.assertEquals(expected,Main.getFirst20Fib());

    }

}