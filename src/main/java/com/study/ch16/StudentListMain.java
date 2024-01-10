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
        System.out.println("--------");

        for(int i = 0; i < students.size(); i++){
            Student student = students.get(i);
            students.get(i).setAge(student.getAge() + 1);
        }
        System.out.println(students);

        // 향상된  for
        for(Student student : students){    //처음부터 1개씩 대입
            student.setAge(student.getAge()+1);
        }
        System.out.println(students);

        Student[] studentArray = new Student[4];
        for(int i = 0; i < studentArray.length; i++){
            studentArray[i] = new Student("김준일", 31);
        }

        System.out.println("------");

        int i = 0;
        for(Student student : studentArray) {
            studentArray[i] = new Student("김준일", 31);   //배열주소확인
//            student.setAge(student.getAge()+i);
            System.out.println(student);
            i++;
        }

        // 객체의 주소를 가져옴. new(X) 값 대입x
//        students.get(0);
        students.set(0, new Student("김준일",31));


    }
}
