package com.company;

public interface ITeacher {

    void add(IStudent iStudent);
    void remove(IStudent iStudent);


    void notifyStudent(Task task);

    void taskIsDone(Task task);
}
