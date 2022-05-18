package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingFactory {


    public static void sortStudents(String answer,List<Student> students) throws IllegalArgumentException {
        switch (answer){
            case "name":
                Collections.sort(students,new ComparatorByName());
                break;
            case "gpa":
                Collections.sort(students,new ComparatorByGpa());
                break;
            case "birthday":
                Collections.sort(students,new ComparatorByBirthday());
                break;
            default:
                throw new IllegalArgumentException();

        }
    }
}
