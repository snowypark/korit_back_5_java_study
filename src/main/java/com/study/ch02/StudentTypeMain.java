package com.study.ch02;

public class StudentTypeMain {
    public static void main(String[] args) {
        StudentType st = new StudentType();
        st.name = "a";
        st.address = "부산 동래구";
        st.studentYear = 1;


//        Person 전주환 = new Person();
//        StudentType 전주환학생 = (StudentType) 전주환;

        StudentType 전주환학생 = new StudentType();
        Person 전주환사람 = 전주환학생;
        StudentType 전주환학생2 = (StudentType) 전주환사람;

    }
}
