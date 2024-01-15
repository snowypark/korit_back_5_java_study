package com.study.test.box;

import com.study.test.box.SubjectService;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//
//        Calculator calculator = new Calculator();
//        System.out.println(calculator.add(10, 20));
//        System.out.println(calculator.sub(200, 100));

        List<String> subjects = Arrays.asList(new String[]{"C","Java","Python"});
        SubjectService subjectService = new SubjectService(subjects);
        subjectService.showSubjects();

    }
}
