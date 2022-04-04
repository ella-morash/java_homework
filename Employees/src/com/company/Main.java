package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


	    Programmer p1=new Programmer("Ivan",1000);

	    Programmer p2=new Programmer("Nick",1500);

	    QAEngineer q1=new QAEngineer("Lena",1200);

	    QAEngineer q2=new QAEngineer("Max",1100);

        Programmer b1 = new BackEndProgrammer("Iren",1300);

        Programmer f1 = new FrontEndProgrammer("Jack",1600);

        Programmer fl1 = new FullstackProgrammer("Sveta",1100);

        Manager mg = new Manager("Alex",1300,200);
        Manager mg1 = new Manager("Igor",1300,200);
        Manager mg2 = new Manager("Serega",1300,200);



        EmployeeTeam team = new EmployeeTeam();
        team.addEmployeeToTeam(p1);
        team.addEmployeeToTeam(p2);
        team.addEmployeeToTeam(q1);
        team.addEmployeeToTeam(q2);
        team.addEmployeeToTeam(b1);
        team.addEmployeeToTeam(f1);

        System.out.println(team);

        System.out.println(team.findEmployee(p2));
//        System.out.println();
//
//        System.out.println(team.removeEmployeeFromTeam(0));
//        System.out.println();
//        System.out.println("After Remove Method");
//
//
//        System.out.println(team.toString());






    }
}
