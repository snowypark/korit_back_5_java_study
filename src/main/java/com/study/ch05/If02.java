package com.study.ch05;

import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        String result =  x > 0 && y > 0 ? "1사분면"
//                        : x < 0 && y > 0 ? "2사분면"
//                        : x < 0 && y < 0 ? "3사분면"
//                        : x > 0 && y < 0 ? "4사분면" : "오류";
        int x = 0;
        int y = 0;
        System.out.print("x와 y를 입력해주세요(띄어쓰기구분): ");

        x = scanner.nextInt();
        y = scanner.nextInt();

        if(x == 0 || y ==0) {
            System.out.println("오류");
        }else if(x > 0 && y > 0){
            System.out.println("제1사분면");
        }else if(x < 0 && y > 0){
            System.out.println("제2사분면");
        }else if(x < 0 && y < 0){
            System.out.println("제3사분면");
        }else {
            System.out.println("제4사분면");
        }



    }}
