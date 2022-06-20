package com.company.lambdasAndGenerics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


public class Main {
    public static void main(String[] args) {


    }

    public static List<String> createListFromPersons(List<Person> personList,
                                                     MyFunction<Person,String> func) {
        List<String> newList = new ArrayList<>();

        personList.forEach(person -> newList.add(func.apply(person)));

        return newList;

    }
    /*
2)*Решить задачу №1 в общем виде: т.е. есть список объектов типа A
необходимо получить список объектов типа B.
Проверить, получив из листа Person лист объектов Address, из листа String лист Integer с длинами строк. */

    public static <T,R> List<R> createNewListGeneric (List<? extends T> t, MyFunction<T,? extends R> myFunction) {
        List<R> newList = new ArrayList<>();


        for (T o: t) {
            newList.add(myFunction.apply(o));

        }

        return newList;
    }
    /* 3)Реализовать обобщенный метод, который принимает любую коллекцию и возвращает максимальный элемент из этой коллекции.*/

    public static <T extends Comparable<? super T>> T getMaxEl(Collection<T> collection) {

        T max = null;
        if (collection==null || collection.isEmpty()) return null;
        Iterator<T> iterator = collection.iterator();
        while ((iterator.hasNext())){
            T temp = iterator.next();
            if (max==null || temp.compareTo(max) > 0) {
                max = temp;
            }
        }
        return max;

    }
}
