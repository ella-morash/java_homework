package com.company;

import java.util.ArrayList;
import java.util.Arrays;


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

    public void add(Employee employee) {
        if (team == null) {
            team = new Employee[capacity];
            currentInx = 0;
        }
        team[currentInx++] = employee;

        if (currentInx>=capacity) {

            team = Arrays.copyOf(team,capacity*2);
        }

    }

    public int find(Employee e) {

        for (int i = 0; i < currentInx; i++) {
            if (team[i]!=null){
                if (e.hashCode() == team[i].hashCode() && team[i].equals(e) ) {
                    return i;
            }
            }
        }
        System.out.println("There is no such employee in team!");
        return -1;
    }
    public void remove(Employee e) {
         int index = find(e);
         if (index!=-1) {
             remove(index);
         }

    }

    public Employee remove(int index) {
        Employee eToRemove = team[index];
        if (currentInx > 0 && index <= currentInx){

            System.arraycopy(team,index + 1, team,index,team.length - 1 - index);
            currentInx--;
        }


//        if (index == 0) {
//            team = Arrays.copyOfRange(team,1,team.length);
//
//        } else if (index == team.length - 1) {
//            team = Arrays.copyOfRange(team,0, team.length - 1);
//
//        } else {
//
//            Employee[] part1 = Arrays.copyOfRange(team,0,index);
//            Employee[] part2 = Arrays.copyOfRange(team,index + 1,team.length);
//
//            int len1 = part1.length;
//            int len2 = part2.length;
//
//            Employee[] newTeam = new Employee[len1 + len2];
//            System.arraycopy(part1, 0 , newTeam, 0 , len1);
//            System.arraycopy(part2,0,newTeam,len1,len2);
//            team = newTeam;
//        }
        return eToRemove;
    }
    // when indexes does not matter

    public Employee removeEmployeeFromTeam1(int index) {
        Employee temp = team [index];
        team [index] = null;

        return temp;

    }


    public void print() {
        for (int i = 0; i < currentInx; i++) {
            System.out.println(i + ": " + team[i] + " ");
            }
    }
}
