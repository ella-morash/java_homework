package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskAssignmentLoader {

    private Map<Employee, List<Task>> employeeTaskMap = new HashMap<>();


    public Map<Employee, List<Task>> getEmployeeTaskMap() {
        return employeeTaskMap;
    }

    public void addToMap(TaskAssignment taskAssignment) {
        if (employeeTaskMap.containsKey(taskAssignment.getEmployee())) {
            employeeTaskMap.get(taskAssignment.getEmployee()).add(taskAssignment.getTask());
        } else {
            employeeTaskMap.put(taskAssignment.getEmployee(),new ArrayList<>());
            employeeTaskMap.get(taskAssignment.getEmployee()).add(taskAssignment.getTask());
        }

    }
}
