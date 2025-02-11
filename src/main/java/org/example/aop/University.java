package org.example.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Ulugbek Yarkinov", 4, 1.2);
        Student st2 = new Student("Misha Mishanya", 3, 2.2);
        Student st3 = new Student("Ira Vera", 1, 3.2);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Beginning of getStudents");

//        System.out.println(students.get(3)); //intended Exception

        System.out.println("Information from method getStudents:");
        System.out.println(students);
        return students;
    }
}
