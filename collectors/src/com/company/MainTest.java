package com.company;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MainTest {

    @Test
    void testTask3() {
        Task task1 = new Task(1,"aws",1,"in progress");
        Task task2 = new Task(2,"payment",1,"done");
        Task task3 = new Task(3,"provider",1,"done");

        Performer performer1 = new Performer(new Person("Alex"),"Berlin",task1);
        Performer performer2 = new Performer(new Person("Alex"),"Berlin",task2);
        Performer performer3 = new Performer(new Person("Olga"),"Berlin",task1);
        Performer performer4 = new Performer(new Person("Olga"),"Berlin",task3);
        Performer performer5 = new Performer(new Person("Stas"),"Chemnitz",task3);

        List<Performer> performerList = List.of(performer1,performer2,performer3,performer4,performer5);

        Map<Person,List<Task>> expected = new HashMap<>();
        expected.put(new Person("Alex"),new ArrayList<>());
        expected.get(new Person("Alex")).add(task1);
        expected.get(new Person("Alex")).add(task2);

        expected.put(new Person("Olga"),new ArrayList<>());
        expected.get(new Person("Olga")).add(task1);
        expected.get(new Person("Olga")).add(task3);

        expected.put(new Person("Stas"),new ArrayList<>());
        expected.get(new Person("Stas")).add(task3);

        Assertions.assertEquals(expected,Main.getMapOfPersonsTasks(performerList));
    }

    @Test
    void testTask1() {
        Task task1 = new Task(1,"aws",1,"in progress");
        Task task2 = new Task(2,"payment",1,"done");
        Task task3 = new Task(3,"provider",1,"done");

        Performer performer1 = new Performer(new Person("Alex"),"Berlin",task1);

        Performer performer3 = new Performer(new Person("Olga"),"Berlin",task2);

        Performer performer5 = new Performer(new Person("Stas"),"Chemnitz",task3);

        List<Performer> performerList = List.of(performer1,performer3,performer5);

        Map<Integer,String> expected = new HashMap<>();
        expected.put(1,"aws");
        expected.put(2,"payment");



        Assertions.assertEquals(expected,Main.getMapWhereKeyIsIdAndValueIsTitle(performerList));
    }

    @Test
    void testTask2() {
        Task task1 = new Task(1,"aws",1,"in progress");
        Task task2 = new Task(2,"payment",1,"undone");
        Task task3 = new Task(3,"provider",2,"done");

        Performer performer1 = new Performer(new Person("Alex"),"Berlin",task1);

        Performer performer3 = new Performer(new Person("Olga"),"Berlin",task2);

        Performer performer5 = new Performer(new Person("Stas"),"Chemnitz",task3);

        List<Task> tasks = List.of(task1,task2,task3);

        Map<Integer,List<Task>> expected= new HashMap<>();
        expected.put(1,new ArrayList<>());
        expected.get(1).add(task1);
        expected.get(1).add(task2);




        Assertions.assertEquals(expected,Main.getMapOfUndoneTasks(tasks));
    }
    @Test
    void testTask4() {
        Task task1 = new Task(1,"aws",1,"in progress");
        Task task4 = new Task(5,"smth",1,"canceled");
        Task task2 = new Task(2,"payment",1,"done");
        Task task3 = new Task(3,"provider",1,"done");

        Performer performer1 = new Performer(new Person("Alex"),"Berlin",task1);
        Performer performer2 = new Performer(new Person("Alex"),"Berlin",task2);
        Performer performer3 = new Performer(new Person("Olga"),"Berlin",task4);
        Performer performer4 = new Performer(new Person("Olga"),"Berlin",task3);
        Performer performer5 = new Performer(new Person("Stas"),"Chemnitz",task3);

        List<Performer> performerList = List.of(performer1,performer2,performer3,performer4,performer5);
        var personTasks = Main.getMapOfPersonsTasks(performerList);


        Map<Boolean,List<Task>> expected = new HashMap<>();
        expected.put(true,new ArrayList<>());
        expected.get(true).add(task2);
        expected.get(true).add(task3);
        expected.put(false,new ArrayList<>());
        expected.get(false).add(task1);

        Assertions.assertEquals(expected,Main.getBooleanMap(personTasks));
    }
    @Test
    void testTask5(){

        Programmer programmer1 = new Programmer("Alex",List.of("java","spring boot","sql"));
        Programmer programmer2 = new Programmer("Olga",List.of("java","mvc","sql"));
        Programmer programmer3 = new Programmer("Igor",List.of("python","spring boot","mongo db"));

        List<Programmer> programmers = List.of(programmer1,programmer2,programmer3);

        Map<String,List<Programmer>> expected = new HashMap<>();
        expected.put("java",new ArrayList<>());
        expected.get("java").add(programmer1);
        expected.get("java").add(programmer2);

        expected.put("spring boot",new ArrayList<>());
        expected.get("spring boot").add(programmer3);
        expected.get("spring boot").add(programmer1);

        expected.put("sql",new ArrayList<>());
        expected.get("sql").add(programmer1);
        expected.get("sql").add(programmer2);

        expected.put("mvc",new ArrayList<>());
        expected.get("mvc").add(programmer2);

        expected.put("python",new ArrayList<>());
        expected.get("python").add(programmer3);

        expected.put("mongo db",new ArrayList<>());
        expected.get("mongo db").add(programmer3);

        Assertions.assertEquals(expected,Main.getMapOfTechStack(programmers));



    }

}