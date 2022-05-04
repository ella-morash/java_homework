package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


	    Programmer p1=new Programmer("Ivan",1000);

        Programmer p3=new Programmer("Ivan",1200);

	    Programmer p2=new Programmer("Nick",1500);

	    QAEngineer q1=new QAEngineer("Lena",1200);

	    QAEngineer q2=new QAEngineer("Max",1100);

        Programmer b1 = new BackEndProgrammer("Iren",1300);

        Programmer f1 = new FrontEndProgrammer("Jack",1600);

        Programmer fl1 = new FullstackProgrammer("Sveta",1100);

        Manager mg = new Manager("Alex",1300,200);
        Manager mg1 = new Manager("Igor",1300,200);
        Manager mg2 = new Manager("Serega",1300,200);

        BackEndProgrammer p100 = new BackEndProgrammer("Nick",1500);



        EmployeeTeam team = new EmployeeTeam();
        mg.addToTeam(p1);
        mg.addToTeam(p2);
        mg.addToTeam(q1);
        mg.addToTeam(q2);
        mg.addToTeam(b1);
        mg.addToTeam(f1);
        mg.addToTeam(p3);


        mg.printTeam();
        mg.insertEmployee(fl1,3);
        System.out.println("-----------------------------------------");
        //mg.sortEmployees();

        mg.printTeam();




        Task task1 = new Task(1,"BACKLOG","implement logic");
        Task task2 = new Task(2,"BACKLOG","implement classes");
        Task task3 = new Task(3,"IN PROGRESS","implement classes");
        Task task4 = new Task(4,"DONE","implement classes");

        TaskAssignment taskAssignment = new TaskAssignment(task1,p1);
        TaskAssignment taskAssignment1 = new TaskAssignment(task1,p2);
        TaskAssignment taskAssignment2 = new TaskAssignment(task2,p2);
        TaskAssignment taskAssignment3 = new TaskAssignment(task1,p2);
        TaskAssignment taskAssignment4 = new TaskAssignment(task3,p1);

       TaskAssignmentLoader loader = new TaskAssignmentLoader();

       loader.addToMap(taskAssignment);
       loader.addToMap(taskAssignment1);
       loader.addToMap(taskAssignment2);
       loader.addToMap(taskAssignment3);
       loader.addToMap(taskAssignment4);

        System.out.println(loader.getEmployeeTaskMap());













    }
}
