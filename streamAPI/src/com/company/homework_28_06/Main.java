package com.company.homework_28_06;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {



    }
    /* 1. Есть два класса Group {String title, List<Student>}, Student{String name, List<Double> payments}.
    Необходимо написать метод, который вернет список всех студентов.
    Учтите, что один и тот же студент может посещать несколько групп.*/

    public static List<Student> getAllStudents (List<Group> groups) {
        if ( groups == null || groups.isEmpty()) {
            return new ArrayList<>();
        }

        return groups.stream()
                     .filter(Objects::nonNull)
                     .flatMap(group -> group.getStudentList().stream())
                     .distinct()
                     .toList();

    }




    /* 2.   Есть два класса Group {String title, List<Student>}, Student{String name, List<Double> payments}.
    Необходимо написать метод, который вернет сумму всех платежей, т.е. общий доход.   */

    public static double getTheWholeSum(List<Group> groups) {
        if ( groups == null || groups.isEmpty() ) {
            return 0;
        }

        var sum =   getAllStudents(groups).stream()
                                       .flatMap(student -> student.getPayments().stream())
                                       .reduce(.0, Double::sum);
        return round(sum,1);
    }

    private static double round (double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);

        return bd.doubleValue();
    }


    /* 3.   Есть два класса Group {String title, List<Student>}, Student{String name, List<Double> payments}.
    Необходимо написать метод, который вернет студентов, сумма платежей которых меньше заданной суммы. */

    public static List<Student> getSpecificStudents(List<Group> groups, int sum) {

        if ( groups == null || groups.isEmpty() ) {
            return new ArrayList<>();
        }


         return getAllStudents(groups).stream()
                                      .filter(student -> student.getPayments().stream()
                                                                              .reduce(.0, Double::sum) < sum)
                                      .toList();


    }


    /* Используя Stream получить лист c первыми 20 числами Фибоначчи. */
    public static List<Integer> getFirst20Fib() {



        return Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(20)
                .map(t -> t[0])
                .toList();



    }

   static class Group {
        private String title;
        private List<Student> studentList;

        public Group(String title, List<Student> studentList) {
            this.title = title;
            this.studentList = studentList;
        }

        public String getTitle() {
            return title;
        }

        public List<Student> getStudentList() {
            return studentList;
        }

       public Group() {
       }

       @Override
       public String toString() {
           return "{" +
                   "title='" + title + '\'' +
                   ", studentList=" + studentList +
                   '}';
       }

       @Override
       public boolean equals(Object o) {
           if (this == o) return true;
           if (o == null || getClass() != o.getClass()) return false;
           Group group = (Group) o;
           return Objects.equals(title, group.title) && Objects.equals(studentList, group.studentList);
       }

       @Override
       public int hashCode() {
           return Objects.hash(title, studentList);
       }
   }

    static class Student {
        private String name;
        private List<Double> payments;

        public Student(String name, List<Double> payments) {
            this.name = name;
            this.payments = payments;
        }

        public String getName() {
            return name;
        }

        public List<Double> getPayments() {
            return payments;
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", payments=" + payments +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name) && Objects.equals(payments, student.payments);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, payments);
        }
    }
}
