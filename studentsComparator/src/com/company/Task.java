package com.company;

public class Task {
    private final int id;
    private static int idIncrementor;
    private String description;

    public Task(String description) {
        this.description = description;
        id=++idIncrementor;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
