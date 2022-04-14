package com.company;

import java.util.Arrays;
import java.util.List;


public class EmployeeTeam {
    private Employee[] team;
    private int capacity = 8;
    private int currentInx = 0;

    public EmployeeTeam(int capacity) {

        this.capacity = capacity;
    }

    public EmployeeTeam() {

    }

    @Override
    public String toString() {
        return "EmployeeTeam{" +
                "team=" + Arrays.toString(team) +
                ", capacity=" + capacity +
                ", currentInx=" + currentInx +
                '}';
    }

    //The int size() method that returns how many Employees in the team
    public int size() {
        return currentInx;
    }

    //Since our EmployeeTeam allows null cells at the end of the array, it could takes up extra memory.
    // Implement the trimToSize() method that trims the capacity of the array to be the real current size.
    public void trimToSize() {
        if (currentInx < capacity) {
            team = Arrays.copyOf(team, currentInx);
        }
    }

    //The Employee get(int index) method that return the Employee with the given index
    public Employee get(int index) {
        if (currentInx > 0 && index <= currentInx) {
            return team[index];
        }
        throw new IndexOutOfBoundsException();
    }

    public void add(Employee employee) {
        if (team == null) {
            team = new Employee[capacity];
            currentInx = 0;
        }
        team[currentInx++] = employee;

        if (currentInx >= capacity) {

            team = Arrays.copyOf(team, capacity * 2);
        }

    }

    //Adding several employees to a team at a time (addAll).
    // As previous It should be possible to set the list by array or by EmployeeTeam
    public boolean addAll(Employee[] employeesToAdd) {
        if (employeesToAdd.length == 0) return false;
        for (Employee employee : employeesToAdd) {
            add(employee);

        }

        return true;
    }

    //The method that returns the new EmployeeTeam with all employees with the given name from this team .
    public Employee[] findAll(String name) {
        int capacity = 10;
        int index = 0;
        Employee[] newTeam = new Employee[capacity];
        for (int i = 0; i < currentInx; i++) {
            if (team[i].getName().equals(name)) {
                newTeam[index++] = team[i];
            }
            if (index >= capacity) {
                newTeam = Arrays.copyOf(newTeam, capacity * 2);
            }
        }
        return newTeam;
    }


    //Implement the method that returns the EmployeeTeam with all programmers
    // or all QA Engineers from this team
    public Employee[] findSpecificEmployees(String jobTitle) {
        Employee[] subTeam = new Employee[this.team.length];


        switch (jobTitle) {

            case "Programmer":
                int i = 0;

                for (Employee employee : this.team) {
                    if (employee instanceof Programmer) {
                        subTeam[i++] = employee;

                    }
                }
                return subTeam;
            case "QAEngineer":
                int j = 0;

                for (Employee employee : this.team) {
                    if (employee instanceof QAEngineer) {
                        subTeam[j++] = employee;

                    }

                }
                return subTeam;
            default:
                throw new ClassCastException();
        }
    }


    public int find(Employee e) {

        for (int i = 0; i < currentInx; i++) {
            if (team[i] != null) {
                if (e.hashCode() == team[i].hashCode() && team[i].equals(e)) {
                    return i;
                }
            }
        }

        return -1;
    }

    public void remove(Employee e) {
        int index = find(e);
        if (index != -1) {
            remove(index);
        }

    }

    // The remove (String name) method that remove Employees by the name
    public void remove(String name) {
        boolean found = false;
        for (int i = 0; i < currentInx; i++) {
            if (team[i].getName().equals(name)) {
                remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No such employee in team");
        }

    }

    public Employee remove(int index) {
        Employee eToRemove = team[index];
        if (currentInx > 0 && index <= currentInx) {

            System.arraycopy(team, index + 1, team, index, team.length - 1 - index);
            currentInx--;
        }

        return eToRemove;
    }
    //Removal of several employees from the team at once (removeAll)
    // It should be possible to use an array of Employee or EmployeeTeam to set the list of removed workers

    public boolean removeAll(Employee[] teamToRemove) {
        int len = teamToRemove.length;
        outerFor:
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < currentInx; j++) {
                if (team[j].hashCode() == teamToRemove[i].hashCode() && team[j].equals(teamToRemove[i])) {
                    remove(team[j]);
                    remove(teamToRemove[i]);
                    continue outerFor;
                }
            }
        }

        if (len == 0) return true;
        return false;
    }


    public void print() {
        for (int i = 0; i < currentInx; i++) {
            System.out.println(i + ": " + team[i] + " ");
        }
    }
}

