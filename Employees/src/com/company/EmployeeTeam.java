package com.company;

import java.util.Arrays;

public class EmployeeTeam {
    private Employee[] team;
    private int capacity = 8;
    private int currentInx = 0;


    @Override
    public String toString() {
        return "EmployeeTeam{" +
                "team=" + Arrays.toString(team) +
                ", capacity=" + capacity +
                ", currentInx=" + currentInx +
                '}';
    }

    public void addEmployeeToTeam(Employee employee) {
        if (team == null) {
            team = new Employee[capacity];
            currentInx = 0;
        }
        team[currentInx++] = employee;

        if (currentInx>=capacity){

            team = Arrays.copyOf(team,capacity*2);

        }

    }

    public Employee removeEmployeeFromTeam(int index) {
        Employee eToRemove = team[index];

        if (index == 0) {
            team = Arrays.copyOfRange(team,1,team.length);

        } else if (index == team.length - 1) {
            team = Arrays.copyOfRange(team,0, team.length - 1);

        } else {

            Employee[] part1 = Arrays.copyOfRange(team,0,index);
            Employee[] part2 = Arrays.copyOfRange(team,index + 1,team.length);

            int len1 = part1.length;
            int len2 = part2.length;

            Employee[] newTeam = new Employee[len1 + len2];
            System.arraycopy(part1, 0 , newTeam, 0 , len1);
            System.arraycopy(part2,0,newTeam,len1,len2);
            team = newTeam;
        }

        return eToRemove;
    }


    public void printTeam() {
        for (int i = 0; i < currentInx; i++) {

                System.out.println(team[i]);
            }
    }
}