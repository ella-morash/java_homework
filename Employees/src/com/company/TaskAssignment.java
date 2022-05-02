package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskAssignment {
    private Task task;
    private Employee employee;


    public TaskAssignment(Task task, Employee employee) {
        this.task = task;
        this.employee = employee;
    }

    public Task getTask() {
        return task;
    }

    public Employee getEmployee() {
        return employee;
    }

    @Override
    public String toString() {
        return "TaskAssignment{" +
                "task=" + task +
                ", employee=" + employee +
                '}';
    }


}
