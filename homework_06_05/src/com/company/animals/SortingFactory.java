package com.company.animals;

import java.util.Arrays;

public class SortingFactory {

    public static void main(String[] args) {
        Animal animal1=new Animal("tiger",7.8,"black");
        Animal animal2=new Animal("panda",10.0,"braun");
        Animal animal3=new Animal("pig",7.8,"rose");

        Animal pet1  = new Pet("cat",3.2,"orange","Alex");
        Animal pet2  = new Pet("dog",5.3,"white","John");
        Animal pet3  = new Pet("rat",1.3,"gray","Mila");

        Animal[] animals = {animal1,animal2,animal3,pet1,pet2,pet3};
        Animal[] pets = {pet1,pet2,pet3};
        System.out.println(Arrays.toString(animals));
        System.out.println("-----------------------");
        Arrays.sort(animals,new ComparatorByName());
        System.out.println(Arrays.toString(animals));
        System.out.println("-----------------------");
        Arrays.sort(animals,new ComparatorByLastCharInName());
        System.out.println(Arrays.toString(animals));
        System.out.println("------------------");
        System.out.println(Arrays.toString(pets));
        Arrays.sort(pets,new ComparatorByWeight());
        System.out.println(Arrays.toString(pets));

    }
}
