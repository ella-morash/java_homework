package com.company;

public interface ITeacher {

    void add(Student student);
    void remove(Student student);
    void notifyStudent(Task task);
    void taskIsDone(Task task);
}
