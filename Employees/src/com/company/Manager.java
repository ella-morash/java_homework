package com.company;


import java.util.Objects;

public class Manager extends Employee {

    private double bonus;
    EmployeeTeam team;




    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;

    }

    @Override
    public boolean equals(Object o) {
        if (super.equals(o)) {
            if (this == o) return true;
            if (!(o instanceof Manager)) return false;
            if (!super.equals(o)) return false;
            Manager manager = (Manager) o;
            return Double.compare(manager.bonus, bonus) == 0;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bonus) + super.hashCode();
    }

    public double getBonus() {

        return bonus;
    }


    @Override
    public String toString() {

        return super.toString() + " Manager";
    }

    @Override
    public void getPaid() {
        System.out.println("I got paid " + (getSalary() + bonus));
        ;
    }

    @Override
    public void doWork() {
        System.out.println("I am a manager " + getName() + ". I do a lot!");
        ;
    }

    public void addToTeam(Employee e){
        if(e!=null) {
            if (team == null) {
                team = new EmployeeTeam();
            }
            team.add(e);
        }
    }
    public int countEmployees () {
        return team.size();
    }
    public Employee getEmployee (int index) {
        return team.get(index);
    }

    public void removeFromTeam(int index) {
        team.remove(index);
    }
    public void removeFromTeam(String name) {
        team.remove(name);
    }

    public void removeAllEmployees (Employee[] employees) {
        team.removeAll(employees);
    }
    public void addAllEmployees (Employee[] employees) {
        team.addAll(employees);
    }

    public void removeFromTeam(Employee e)
    {
        team.remove(e);
    }
    public Employee[] findAllEmployees(String name) {
        return team.findAll(name);
    }
    public Employee[] getSpecificEmployees(String job) {
        return team.findSpecificEmployees(job);
    }

    public void printTeam(){

        team.print();
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
