package com.company;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

    }
    /*1.    Есть класс Task {int id, String title, int priority, String status} и
    класс Performer {String name, String city, Task task}.  Дан List< Performer>.
     Для всех задач, исполнители которых из Берлина, необходимо получить мапу,
     где ключом является id задачи, а значением title данной задачи. */

    public static Map<Integer,String> getMapWhereKeyIsIdAndValueIsTitle(List<Performer> performers) {

        return performers.stream()
                .filter(p -> p.getCity().equals("Berlin"))
                .map(Performer::getTask)
                .collect(Collectors.toMap(Task::getId, Task::getTitle));

    }

    /* 2.Дан список Task {int id, String title, int priority, String status}.
   Необходимо получить мапу, где ключом является приоритет, а значением список
   не завершенных (статус завершенной задачи - «done»)  задач, данного приоритета.*/


    public static Map<Integer,List<Task>> getMapOfUndoneTasks(List<Task> tasks) {
        return tasks.stream()
                .filter(task -> !task.getStatus().equals("done"))
                .collect(Collectors.groupingBy(Task::getPriority));


    }
/* 3.    Дан List< Performer> (см.пункт 1)
необходимо получить мапу <Person, List<Task>>.
Person – класс, который содержит одно поле String name из класса Performer. */

    public static Map<Person,List<Task>> getMapOfPersonsTasks(List<Performer> performers) {
       return performers.stream()
                .collect(Collectors.groupingBy(Performer::getPerson,
                         Collectors.mapping(Performer::getTask,Collectors.toCollection(ArrayList::new))));

    }

    /*Дана мапа <Person, List<Task>> }. Необходимо получить мапу <Boolean, Task>, где ключом,
    все не завершенные задачи будут относиться к ключу false, а все завершенные к ключу true.
    Задачи со статусом “canceled” не должны учитываться. */

    public static Map<Boolean,List<Task>> getBooleanMap (Map<Person,List<Task>> map){
        return map.entrySet().stream()
                .flatMap(e->e.getValue().stream())
                .filter(task->!task.getStatus().equals("canceled"))
                .distinct()
                .collect(Collectors.partitioningBy(task -> task.getStatus().equals("done")));
    }

    /* 5.   Дан список  Programmer, у каждого из которых есть имя и список технологий, которыми он владеет,
    например, языки программирования. Необходимо получить мапу, где ключ название технологии, а значение список программистов ей владеющий.   */

    public static Map<String,List<Programmer>> getMapOfTechStack(List<Programmer> programmers) {
        var map = getMapOfTechStackHelper(programmers);
        return inverseGroupingBy(map);

    }

    private static Map<Programmer,List<String>> getMapOfTechStackHelper(List<Programmer> programmers) {
        return   programmers.stream()
                .collect(Collectors.toMap((p->p), Programmer::getTechStack));
    }

    private static <K, V> Map<V, List<K>> inverseGroupingBy(Map<K, List<V>> src)
    {
        return src.entrySet().stream()
                .flatMap(e -> e.getValue().stream().map(a -> new AbstractMap.SimpleImmutableEntry<>(a, e.getKey())))
                .collect(Collectors.groupingBy(Map.Entry::getKey,
                        Collectors.mapping(Map.Entry::getValue, Collectors.toList())));
    }











}


class Programmer {
    private String name;
    private List<String> techStack;

    public Programmer(String name, List<String> techStack) {
        this.name = name;
        this.techStack = techStack;
    }

    public String getName() {
        return name;
    }

    public List<String> getTechStack() {
        return techStack;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", techStack=" + techStack +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Programmer that = (Programmer) o;
        return Objects.equals(name, that.name) && Objects.equals(techStack, that.techStack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, techStack);
    }
}

class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

class Performer {
    private Person person;
    private String city;
    private Task task;

    public Performer(Person person, String city, Task task) {
        this.person = person;
        this.city = city;
        this.task = task;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Performer performer = (Performer) o;
        return Objects.equals(person, performer.person) && Objects.equals(city, performer.city) && Objects.equals(task, performer.task);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, city, task);
    }

    @Override
    public String toString() {
        return "{" +
                "person=" + person +
                ", city='" + city + '\'' +
                ", task=" + task +
                '}';
    }

    public Person getPerson() {
        return person;
    }

    public String getCity() {
        return city;
    }

    public Task getTask() {
        return task;
    }
}



class Task {
    private int id;
    private  String title;
    private  int priority;
    private String status;

    public Task(int id, String title, int priority, String status) {
        this.id = id;
        this.title = title;
        this.priority = priority;
        this.status = status;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", priority=" + priority +
                ", status='" + status + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }
}
