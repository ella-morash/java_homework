package com.company;

public class FrontEndProgrammer extends Programmer{
    public FrontEndProgrammer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void doWork() {
        System.out.println("I am frontend programmer " + getName() + ".I write code and Implement new features");
    }

    @Override
    public String toString() {
        return super.toString() + " Frontend Programmer";
    }
}
