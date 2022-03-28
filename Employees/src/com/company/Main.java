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

        mg.addEmployeeToTeam(mg);
        mg.addEmployeeToTeam(p1);
        mg.addEmployeeToTeam(p2);
        mg.addEmployeeToTeam(q1);
        mg.addEmployeeToTeam(q2);
        mg.addEmployeeToTeam(b1);
        mg.addEmployeeToTeam(f1);
        mg.addEmployeeToTeam(fl1);
        mg.addEmployeeToTeam(mg1);
        mg.addEmployeeToTeam(mg2);




        System.out.println(Arrays.toString(mg.getTeam()));



    }
}
