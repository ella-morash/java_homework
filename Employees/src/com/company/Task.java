package com.company;

import java.util.ArrayList;

public class Task {
    private int id;
    private String status;
    private String description;
    //private ArrayList<Employee> employees = new ArrayList<>();

    public Task(int id, String status, String description) {
        this.id = id;
        this.status = status;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }


}

