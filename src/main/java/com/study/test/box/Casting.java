package com.study.test.box;

public class Casting {
    public static void main(String[] args) {

        Program[] programs = new Program[2];
        programs[0] = new Java();
        programs[1] = new C();


        for (int i = 0; i < programs.length; i++) {
            programs[i].develop();
        }
    }
}

