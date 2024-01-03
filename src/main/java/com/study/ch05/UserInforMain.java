package com.study.ch05;

import java.util.Scanner;

public class UserInforMain {
    public static void main(String[] args) {

        /*
            이름: 김준일
            나이: 31
            연락처: 01099881916
            주소 : 부산 동래구
            학년: 4
         */

        Scanner scanner = new Scanner(System.in);
        String name = null;
        int age = 0;
        String phone = null;
        int grade = 0;
        String address = null;

        System.out.print("이름: ");
        name = scanner.nextLine();

        System.out.print("나이: ");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("연락처: ");
        phone = scanner.nextLine();

        System.out.print("학년: ");
        grade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("주소: ");
        address = scanner.nextLine();


        System.out.println("이름: " + name);

        System.out.println("나이: " + age);

        System.out.println("연락처: " + phone);

        System.out.println("학년: " + grade);

        System.out.println("주소: " + address);

        //

        System.out.println("---------");



    }
}