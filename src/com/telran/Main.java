package com.telran;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] ints = {1, 5, 2, 1};
        System.out.println(sum(ints, ints.length - 1));


        int [][] arr = randomize2DimArr(10,1);
        System.out.println(Arrays.deepToString(arr));

        //для теста
        /*int[][] arr = {{1,2,3},{0,1,1},{1,5,7}};
        int[][] arr2 = {{1,0,0},{0,1,1},{1,5,7}};
        int[][] arr3 = {{1,10,0},{0,1,100},{1,5,0}};*/
        System.out.println(findIndexOfArr(arr));


        String[] names = {"Jack", "Nick"};
        int[][] grades = { { 3,4,2}, { 5,5,5,4} };
        findHighestGpa(names,grades);
    }
    /*Implement the method that calculates the sum of integer array.
    You should not use any loops. Use the recursion. */

    public static int sum(int[] arr, int indexOfLastElement) {

        if (indexOfLastElement == 0) {
            return arr[indexOfLastElement];
        }
        return arr[indexOfLastElement] + sum(arr, indexOfLastElement - 1);
    }

    /* Implement the method that create an array int[n][n] of random integers*/

    public static int[][] randomize2DimArr(int max,int min){
        Random random = new Random();
        int [][] arr2Dim = new int[random.nextInt((max-min)+min)][random.nextInt((max-min)+min)];
        for (int i = 0; i < arr2Dim.length; i++) {
            for (int j = 0;j < arr2Dim[i].length; j++) {
                arr2Dim[i][j] = random.nextInt((max-min)+min);
            }
        }
        return arr2Dim;
    }
    /*Implement the method that finds the row’s index in the array int[n][k] of random integers
    with minimum sum of elements */

    public static int findIndexOfArr(int[][] arr2Dim){
        int index = 0;
        int minSum = sum(arr2Dim[0],arr2Dim[0].length-1);

        for (int i = 1; i < arr2Dim.length; i++) {
            int nextSum = sum(arr2Dim[i],arr2Dim[i].length-1);
                if(nextSum<minSum){
                    minSum = nextSum;
                    index = i;
                }
        }
        return index;
    }

    /* 1 Given two arrays. The first is String[n] students – names of students.
    The second is int[n][] grades – the array of grades for student homework.
    Every row of grades array is one student's grades (grades[k] is the grades of students[k]).
     Note, that each student has a different number of grades.
     You should implement the program that finds and displays the student with highest GPA and the score.
     Example:
     {Jack, Nick} { { 3,4,2}, { 5,5,5,4} } -> Nick 4.75*/
    public static void findHighestGpa(String[] names,int[][] grades){
        int sum = 0;
        double gpa = 0;
        double[] gpaOfStudents = new double[names.length];


        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                sum += grades[i][j];
            }
            gpa = (double) sum/grades[i].length;
            gpaOfStudents[i]=gpa;
            sum = 0;
            gpa = 0;
        }

        double maxGPA = gpaOfStudents[0];
        String  nameOfStudentWithMaxGPA = "";
        for (int i = 1; i < gpaOfStudents.length; i++) {
            if (gpaOfStudents[i] > maxGPA){
                maxGPA = gpaOfStudents[i];
                nameOfStudentWithMaxGPA = names[i];
            }
        }
        System.out.println("Student with highest GPA is:");
        System.out.println(nameOfStudentWithMaxGPA + " " + maxGPA);

        //sorting by gpa
        System.out.println("Students sorted by GPA:");
        sort(gpaOfStudents,names);
        printArray(gpaOfStudents,names);

    }

    public static void sort(double gpa[],String[] names) {
        int len = gpa.length;
        for (int i = 1; i < len; i++) {
            double current = gpa[i];
            String currentName = names[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && gpa[j] > current) {
                gpa[j + 1] = gpa[j];
                names[j + 1] = names[j];
                j = j - 1;
            }
            gpa[j + 1] = current;
            names[j + 1] = currentName;
        }
    }
    public static void printArray(double gpa[],String[] names){
        for (int i = 0; i < gpa.length; i++) {
            System.out.println(names[i] + " " + gpa[i]);

        }
    }
}
