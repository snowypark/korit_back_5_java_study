package com.study.ch04;

public class Operation06 {
    public static void main(String[] args) {


        /*
         * << 문제 >>
         *
         * 조건 연산자(삼항연산자)
         *
         * a > 0 ? "양수" : a == 0 ? "0" : "음수"
         *
         */

        int iResult = 10 > 2 ? 1111 : 2222;
        String sResult = 10 > 2 ? "1111" : "2222";
        //결과자료형 일치
        boolean bResult = 10 > 2 ;//? true : false;

        String name = ""; // 문자열이 공백
        String n = null;  // 주소가 없다

        System.out.println(n == null);

        String name1 = "김준일";
        String name2 = new String("김준일");
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name2);


    }
}
