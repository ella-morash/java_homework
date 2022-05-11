package com.company;

import java.util.ArrayList;
import java.util.List;

/**.
 * The type Teacher.
 */
public class Teacher implements ITeacher{
    private static Teacher INSTANCE;
    private String name;
    private List<Student> studentList = new ArrayList<>();


    private Teacher(String name) {
        this.name = name;
    }


    /**
     * Gets instance.
     *
     * @param name the name
     * @return the instance
     */
    public static Teacher getINSTANCE(String name) {
        if (INSTANCE==null) {
            INSTANCE = new Teacher(name);
        }
        return INSTANCE;
    }

    @Override
    public void add(Student student) {
        studentList.add(student);

    }


    @Override
    public void remove(Student student) {
        studentList.remove(student);

    }

    @Override
    public void notifyStudent(Task task) {
        studentList.forEach(student -> student.doTask(task));

    }

    @Override
    public void taskIsDone(Task task) {
        System.out.println(task+" is completed");
    }
}
