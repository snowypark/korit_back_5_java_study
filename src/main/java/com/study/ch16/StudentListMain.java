package com.study.ch16;

import java.util.ArrayList;
import java.util.Set;

public class StudentListMain {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("김준일", 31));
        students.add(new Student("김준이", 32));
        students.add(new Student("김준삼", 33));
        students.add(new Student("김준사", 34));

        System.out.println(students);

        Student s = new Student("aaa", 10);
        s.setAge(s.getAge() + 1);



        for(int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            student.setAge(student.getAge() + 1);
        }

        // 향상된 for
        for(Student student : students) {
            student.setAge(student.getAge() + 1);
        }

        System.out.println(students);

        students.forEach(student -> student.setAge(student.getAge() + 1));

        Student[] studentArray = new Student[4];
        for(int i = 0; i < studentArray.length; i++) {
            Student student;
            student = new Student("김준일", 31);
//            studentArray[i] = new Student("김준일", 31);
        }

        int i = 0;
        for(Student student : studentArray) {
            studentArray[i] = new Student("김준일", 31);
            i++;
        }

        for(Student student : studentArray) {
            System.out.println(student);
        }

        students.set(0, new Student("김준일", 31));

    }
}
