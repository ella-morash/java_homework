package com.company.animals;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SortingFactoryTest {

    @BeforeEach
    void init() {


    }

    @Test
    void sortByName() {
        Animal animal1=new Animal("tiger",7.8,"black");
        Animal animal2=new Animal("panda",10.0,"braun");
        Animal animal3=new Animal("pig",7.8,"rose");

        Animal pet1  = new Pet("cat",3.2,"orange","Alex");
        Animal pet2  = new Pet("dog",5.3,"white","John");
        Animal pet3  = new Pet("rat",1.3,"gray","Mila");

        Animal[] animals = {animal1,animal2,animal3,pet1,pet2,pet3};

        Animal[] expected = {pet1,pet2,animal2,animal3,pet3,animal1};
        Arrays.sort(animals,new ComparatorByName());
        Assertions.assertArrayEquals(expected,animals);

    }

    @Test
    void sortByLastCharInName() {
        Animal animal1=new Animal("tiger",7.8,"black");
        Animal animal2=new Animal("panda",10.0,"braun");
        Animal animal3=new Animal("pig",7.8,"rose");

        Animal pet1  = new Pet("cat",3.2,"orange","Alex");
        Animal pet2  = new Pet("dog",5.3,"white","John");
        Animal pet3  = new Pet("rat",1.3,"gray","Mila");

        Animal[] animals = {animal1,animal2,animal3,pet1,pet2,pet3};

        Animal[] expected = {animal2,animal3,pet2,animal1,pet1,pet3};
        Arrays.sort(animals,new ComparatorByLastCharInName());
        System.out.println(Arrays.toString(animals));
        Assertions.assertArrayEquals(expected,animals);

    }

    @Test
    void sortByWeight() {
        Animal pet1  = new Pet("cat",3.2,"orange","Alex");
        Animal pet2  = new Pet("dog",5.3,"white","John");
        Animal pet3  = new Pet("rat",1.3,"gray","Mila");


        Animal[] pets = {pet1,pet2,pet3};
        Animal[] expected = {pet3,pet1,pet2};
        Arrays.sort(pets,new ComparatorByWeight());
        Assertions.assertArrayEquals(expected,pets);

    }

}