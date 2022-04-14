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



        EmployeeTeam team = new EmployeeTeam(100);
        mg.addToTeam(p1);
        mg.addToTeam(p2);
        mg.addToTeam(q1);
        mg.addToTeam(q2);
        mg.addToTeam(b1);
        mg.addToTeam(f1);
        mg.addToTeam(p3);



        //System.out.println(mg.countEmployees());
        //System.out.println(mg.getEmployee(0));
        //System.out.println(mg.getEmployee(10));

        Employee[] toRemove = {p1,q2,f1};
        Employee[] toAdd = {fl1,mg};




        //mg.printTeam();
        System.out.println("-----------------------------------------");
        System.out.println(Arrays.toString(mg.getSpecificEmployees("Programmer")));
        System.out.println("-----------------------------------------");
        System.out.println(Arrays.toString(mg.getSpecificEmployees("QAEngineer")));
        //System.out.println(Arrays.toString(mg.getSpecificEmployees("Engineer")));
        //System.out.println(Arrays.toString(mg.findAllEmployees("Ivan")));
        //mg.removeFromTeam(0);
        //mg.addAllEmployees(toAdd);
        //mg.removeFromTeam("Igor");
        //mg.removeAllEmployees(toRemove);
        //System.out.println(mg.countEmployees());

        //mg.printTeam();
        //System.out.println(team.findEmployee(p2));
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
