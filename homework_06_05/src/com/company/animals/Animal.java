package com.company.animals;

public class Animal {
    /*создать класс Animal с полями name, weight, colour и класс Pet расширяющий его с доп. полем
    owner. Вывести на экран список животных, упорядоченный по имени, список домашних животных(из класса
Pet) упорядоченный по весу и список имен животных упорядоченный по возрастанию последней буквы
    имени. Использовать компараторы. Написать тесты*/
    private String name;
    private double weight;
    private String colour;

    public Animal(String name, double weight, String colour) {
        this.name = name;
        this.weight = weight;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", weight=" + weight +
                ", colour='" + colour;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }
}
