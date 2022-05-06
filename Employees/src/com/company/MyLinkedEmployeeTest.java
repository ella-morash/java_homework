package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class MyLinkedEmployeeTest {
    MyLinkedEmployee myLinkedEmployee;

    @Test
    void sizeIncreaseListByInit() {
        myLinkedEmployee = new MyLinkedEmployee(new Programmer("Alex",1400));
        int expected = 1;
        Assertions.assertEquals(expected,myLinkedEmployee.size());

    }
    @Test
    void sizeIncreaseTwoEmplAdded() {
        myLinkedEmployee = new MyLinkedEmployee(new Programmer("Alex",1400));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Sveta",1200));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Dima",1800));
        int expected = 3;
        Assertions.assertEquals(expected,myLinkedEmployee.size());
    }
    @Test
    void sizeDecreaseOneEmplRemoved() {
        myLinkedEmployee = new MyLinkedEmployee(new Programmer("Alex",1400));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Sveta",1200));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Dima",1800));
        myLinkedEmployee.removeEmployee(2);
        System.out.println(myLinkedEmployee.size());
        myLinkedEmployee.print();
        int expected = 2;
        Assertions.assertEquals(expected,myLinkedEmployee.size());
    }

    @Test
    void getNormalCase() {
        myLinkedEmployee = new MyLinkedEmployee(new Programmer("Alex",1400));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Sveta",1200));
        Assertions.assertEquals(new BackEndProgrammer("Sveta",1200) ,myLinkedEmployee.getEmployee(1));
    }

    @Test
    void getForInvalidIndex() {
        myLinkedEmployee = new MyLinkedEmployee(new Programmer("Alex",1400));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Sveta",1200));
        Assertions.assertThrows(IndexOutOfBoundsException.class,() -> myLinkedEmployee.getEmployee(3));
    }

    @Test
    void insertInTheMiddleIfResultIsTrue() {
        myLinkedEmployee = new MyLinkedEmployee(new Programmer("Alex",1400));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Sveta",1200));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Dima",1800));
        Assertions.assertTrue(myLinkedEmployee.insert(new BackEndProgrammer("Igor",800),1));
    }
    @Test
    void insertToTheHeadIfResultIsTrue() {
        myLinkedEmployee = new MyLinkedEmployee(new Programmer("Alex",1400));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Sveta",1200));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Dima",1800));
        Assertions.assertTrue(myLinkedEmployee.insert(new BackEndProgrammer("Igor",800),0));
    }
    @Test
    void insertToTheTailIfResultIsTrue() {
        myLinkedEmployee = new MyLinkedEmployee(new Programmer("Alex",1400));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Sveta",1200));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Dima",1800));
        Assertions.assertTrue(myLinkedEmployee.insert(new BackEndProgrammer("Igor",800),2));
    }
    @Test
    void insertToTheTailIfIndexIsNotValidResultIsFalse() {
        myLinkedEmployee = new MyLinkedEmployee(new Programmer("Alex",1400));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Sveta",1200));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Dima",1800));
        Assertions.assertFalse(myLinkedEmployee.insert(new BackEndProgrammer("Igor",800),7));
    }

    @Test
    void addToTailCheckSizeIncrease() {
        myLinkedEmployee = new MyLinkedEmployee(new Programmer("Alex",1400));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Sveta",1200));
        Assertions.assertEquals(2,myLinkedEmployee.size());
    }
    @Test
    void addToTailCheckEmployeeIsAdded() {
        myLinkedEmployee = new MyLinkedEmployee(new Programmer("Alex",1400));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Sveta",1200));
        Assertions.assertEquals(new BackEndProgrammer("Sveta",1200),myLinkedEmployee.getEmployee(1));
    }

    @Test
    void addToHeadCheckSizeDecrease() {
        myLinkedEmployee = new MyLinkedEmployee(new Programmer("Alex",1400));
        myLinkedEmployee.addToHead(new BackEndProgrammer("Sveta",1200));
        Assertions.assertEquals(2,myLinkedEmployee.size());
    }
    @Test
    void addToHeadCheckEmployeeIsAdded() {
        myLinkedEmployee = new MyLinkedEmployee(new Programmer("Alex",1400));
        myLinkedEmployee.addToHead(new BackEndProgrammer("Sveta",1200));
        Assertions.assertEquals(new BackEndProgrammer("Sveta",1200),myLinkedEmployee.getEmployee(0));
    }

    @Test
    void removeFromTail() {
        myLinkedEmployee = new MyLinkedEmployee(new Programmer("Alex",1400));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Sveta",1200));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Dima",1800));
        myLinkedEmployee.print();
        Assertions.assertEquals(new BackEndProgrammer("Dima",1800),myLinkedEmployee.removeEmployee(2));
    }

    @Test
    void removeFromHead() {
        myLinkedEmployee = new MyLinkedEmployee(new Programmer("Alex",1400));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Sveta",1200));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Dima",1800));
        Assertions.assertEquals(new Programmer("Alex",1400),myLinkedEmployee.removeEmployee(0));
    }

    @Test
    void removeFromTheMiddle() {
        myLinkedEmployee = new MyLinkedEmployee(new Programmer("Alex",1400));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Sveta",1200));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Dima",1800));
        Assertions.assertEquals(new BackEndProgrammer("Sveta",1200),myLinkedEmployee.removeEmployee(1));
    }
    @Test
    void removeInvalidIndex() {
        myLinkedEmployee = new MyLinkedEmployee(new Programmer("Alex",1400));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Sveta",1200));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Dima",1800));
        Assertions.assertThrows(IndexOutOfBoundsException.class,()->myLinkedEmployee.removeEmployee(7));
    }


    @Test
    void setIfTrueMiddle() {
        myLinkedEmployee = new MyLinkedEmployee(new Programmer("Alex",1400));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Sveta",1200));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Dima",1800));
        Assertions.assertTrue(myLinkedEmployee.set(new Programmer("Olga",1400),1));
    }
    @Test
    void setIfTrueHead() {
        myLinkedEmployee = new MyLinkedEmployee(new Programmer("Alex",1400));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Sveta",1200));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Dima",1800));
        Assertions.assertTrue(myLinkedEmployee.set(new Programmer("Olga",1400),0));
    }
    @Test
    void setIfTrueTail() {
        myLinkedEmployee = new MyLinkedEmployee(new Programmer("Alex",1400));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Sveta",1200));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Dima",1800));
        Assertions.assertTrue(myLinkedEmployee.set(new Programmer("Olga",1400),2));
    }
    @Test
    void setIfFalse() {
        myLinkedEmployee = new MyLinkedEmployee(new Programmer("Alex",1400));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Sveta",1200));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Dima",1800));
        Assertions.assertFalse(myLinkedEmployee.set(new Programmer("Olga",1400),8));
    }

    @Test
    void findIfIsFoundIfInTheMiddle(){
        myLinkedEmployee = new MyLinkedEmployee(new Programmer("Alex",1400));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Sveta",1200));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Dima",1800));
        Assertions.assertEquals(1,myLinkedEmployee.find(new BackEndProgrammer("Sveta",1200)));

    }
    @Test
    void findIfIsFoundIfHead(){
        myLinkedEmployee = new MyLinkedEmployee(new Programmer("Alex",1400));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Sveta",1200));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Dima",1800));
        Assertions.assertEquals(0,myLinkedEmployee.find(new Programmer("Alex",1400)));

    }
    @Test
    void findIfIsFoundIfTail(){
        myLinkedEmployee = new MyLinkedEmployee(new Programmer("Alex",1400));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Sveta",1200));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Dima",1800));
        Assertions.assertEquals(2,myLinkedEmployee.find(new BackEndProgrammer("Dima",1800)));

    }
    @Test
    void testToArray(){
        myLinkedEmployee = new MyLinkedEmployee(new Programmer("Alex",1400));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Sveta",1200));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Dima",1800));
        Employee[] expected = {new Programmer("Alex",1400),new BackEndProgrammer("Sveta",1200),
                new BackEndProgrammer("Dima",1800)};
        Assertions.assertArrayEquals(expected,myLinkedEmployee.toArray());

    }

    @Test
    void sortListByName() {
        myLinkedEmployee = new MyLinkedEmployee(new Programmer("Alex",1400));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Sveta",1200));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Dima",1800));
        Employee[] expected = {new Programmer("Alex",1400),new BackEndProgrammer("Dima",1800),
                new BackEndProgrammer("Sveta",1200)};
        myLinkedEmployee.sortList(new ComparatorByName());

        Assertions.assertArrayEquals(expected, myLinkedEmployee.toArray());

    }
    @Test
    void sortListBySalary() {
        myLinkedEmployee = new MyLinkedEmployee(new Programmer("Alex",1400));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Sveta",1200));
        myLinkedEmployee.addToTail(new BackEndProgrammer("Dima",1800));
        Employee[] expected = {new BackEndProgrammer("Sveta",1200),new Programmer("Alex",1400),
                new BackEndProgrammer("Dima",1800),
                };
        myLinkedEmployee.sortList(new ComparatorBySalary());

        Assertions.assertArrayEquals(expected, myLinkedEmployee.toArray());

    }
}