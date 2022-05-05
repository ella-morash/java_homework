package com.company;

import java.util.ArrayList;
import java.util.Arrays;



public class EmployeeTeam  {
    private Employee[] team;
    private int capacity = 8;
    private int currentInx = 0;

    public EmployeeTeam(int capacity) {

        this.capacity = capacity;

    }

    public EmployeeTeam() {

    }

   public void sortTeam() {
        trimToSize();
        Arrays.sort(team);
   }

    public Employee[] getTeam() {
        return team;
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
            capacity=currentInx;
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
        if (employee!=null) {
            team[currentInx++] = employee;

            if (currentInx >= capacity) {

                team = Arrays.copyOf(team, capacity * 2);
            }
        }


    }

    //Adding several employees to a team at a time (addAll).
    // As previous It should be possible to set the list by array or by EmployeeTeam
    public boolean addAll(Employee[] employees){
        int size=size();
        if (employees==null) return false;
        int newCapacity=currentInx+employees.length+10;
        if (newCapacity<capacity){
            increaseToSize(newCapacity);
        }
        for (int i = 0; i < employees.length ; i++) {
            if (employees[i]!=null){
                add(employees[i]);
            }
        }
        return size!=size();
    }

    public boolean addAll(EmployeeTeam employees){
        if(employees!=null){
            return addAll(employees.getTeam());
        } else {
            return false;
        }
    }

    //The method that returns the new EmployeeTeam with all employees with the given name from this team .
    public EmployeeTeam findAllByName(String name){
        EmployeeTeam employeeTeam=new EmployeeTeam();
        if(name==null) return employeeTeam;
        for (int i = 0; i < currentInx; i++) {
            if(team[i].getName().equals(name)){
                employeeTeam.add(team[i]);
            }
        }
        return employeeTeam;
    }


    //Implement the method that returns the EmployeeTeam with all programmers
    // or all QA Engineers from this team
    public EmployeeTeam findAllBySpeciality(String name) {
        EmployeeTeam employeeTeam = new EmployeeTeam();
        if (name == null) return employeeTeam;
        for (int i = 0; i < currentInx; i++) {
            switch (name) {
                case "programmer":
                    if (team[i] instanceof Programmer) add(team[i]);
                case "qa":
                    if (team[i] instanceof QAEngineer) add(team[i]);
            }
        }

        return employeeTeam;

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

    //insert employee by index
    public boolean insert(Employee employee, int index) {

        if (currentInx > 0 && index <= currentInx) {
            Employee[] newTeam = new Employee [team.length + 1];
            System.arraycopy(team, 0, newTeam, 0,index);
            newTeam[index] = employee;
            System.arraycopy(team, index , newTeam, index + 1, currentInx - index);
            team = newTeam;
            return true;


        } else {
            return false;
        }



    }
    //Removal of several employees from the team at once (removeAll)
    // It should be possible to use an array of Employee or EmployeeTeam to set the list of removed workers

    public boolean removeAll(Employee[] employees){
            if(employees==null) return false;
            int size=size();
            for (int i = 0; i < employees.length ; i++) {
                if(employees[i]!=null) {
                    remove(employees[i]);
                }
            }
            return size!=size();
        }

    public boolean removeAll(EmployeeTeam employees){
        if(employees==null) return false;
        int size=size();
        for (int i = 0; i < employees.size() ; i++) {
            Employee e=get(i);
            if(e!=null) {
                remove(e);
            }
        }
        return size!=size();
    }

    private void increaseToSize(int newCapacity){
        if(newCapacity>capacity){
            team= Arrays.copyOf(team,newCapacity);
            capacity=newCapacity;
        }
    }



    public void print() {
        for (int i = 0; i < currentInx; i++) {
            System.out.println(i + ": " + team[i] + " ");
        }
    }
}

