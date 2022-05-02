package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class EmployeeTeamTest {
    EmployeeTeam team;

    @BeforeEach
    public void init() {

        this.team = new EmployeeTeam();
    }

    @Test
    void sizeFewEmplAddedIntoEmptyArray() {
        this.team.add(new Programmer("Gera",10));
        this.team.add(new Programmer("Gera",10));
        Assertions.assertEquals(2,team.size());

    }
    @Test
    void sizeOneEmplAddedIntoEmptyArray() {
        this.team.add(new Programmer("Gera",10));
        Assertions.assertEquals(1,team.size());

    }
    @Test
    void findEmployeeNormalCase() {
        this.team.add(new Programmer("Gera",10));
        Assertions.assertEquals(0,team.find(new Programmer("Gera",10)));
    }

    @Test
    void getEmployeeIfIndexNotCorrect() {
        this.team.add(new Programmer("Gera",10));
        Assertions.assertThrows(IndexOutOfBoundsException.class,() -> this.team.get(2));
    }

    @Test
    void getIfNormalCase() {
        this.team.add(new Programmer("Gera",10));
        Assertions.assertEquals(new Programmer("Gera",10),team.get(0));
    }

    @Test
    void addEmployeeCheckSizeIncrease() {
        int previousSize = team.size();
        team.add(new Programmer("Alex",1200));
        Assertions.assertEquals(1 ,team.size());
    }

    @Test
    void addEmployeeCheckAddedEmployeeInTeamIfNull() {
        int previousSize = team.size();
        team.add(null);
        Assertions.assertEquals(previousSize, team.size());
    }

    @Test
    void addEmployeeCheckAddedEmployeeInTeam() {
        team.add(new Programmer("Alex",1200));
        Employee e = team.get(0);
        Assertions.assertEquals(new Programmer("Alex",1200) ,e);
    }

    @Test
    void removeEmployeeCheckSizeDecrease() {
        int previousSize = team.size();
        team.add(new Programmer("Alex",1200));
        team.remove(new Programmer("Alex",1200));
        Assertions.assertEquals(previousSize,team.size());
    }

    @Test
    void removeEmployeeCheckRemovedEmployeeIsNotInTeam() {
        team.add(new Programmer("Alex",1200));
        team.remove(new Programmer("Alex",1200));
        int indexOfEmployee = team.find(new Programmer("Alex",1200));
        Assertions.assertEquals(-1 ,indexOfEmployee);
    }

    @Test
    void addAllNormalCase() {
        Employee[] toAdd = {new Programmer("Alex",1200),new Programmer("Alex",1200)};
        Assertions.assertTrue(team.addAll(toAdd));

    }

    @Test
    void addAllNullCase() {
        Employee[] toAdd = {null};
        Assertions.assertFalse(team.addAll(toAdd));

    }

    @Test
    void removeAllNormalCase() {
        Employee[] toAdd = {new Programmer("Alex",1200),new Programmer("Alex",1200)};
        team.addAll(toAdd);
        Employee[] toRemove= toAdd;
        Assertions.assertTrue(team.removeAll(toRemove));

    }
    @Test
    void removeAllNullCase() {
        Employee[] toAdd = {new Programmer("Alex",1200),new Programmer("Alex",1200)};
        team.addAll(toAdd);
        Employee[] toRemove= {null};
        Assertions.assertFalse(team.removeAll(toRemove));

    }

    @Test
    void removeByNameNormalCaseSizeEqualSizeBefore() {
        int sizeNow = team.size();
        team.add(new Programmer("Alex",1200));
        team.remove("Alex");
        Assertions.assertEquals(sizeNow,team.size());
    }

    @Test
    void removeByNameNormalCaseCheckIfRemovedEmplNotInTeam() {
        team.add(new Programmer("Alex",1200));
        team.remove("Alex");
        int indexOfEmployee = team.find(new Programmer("Alex",1200));
        Assertions.assertEquals(-1 ,indexOfEmployee);
    }
}