package com.study.ch04;

public class Operation04 {
    public static void main(String[] args) {


        /*
         * << 문제 >>
         *
         * 연도가 주어졌을 때, 윤년이면 true, 아니면 false 출력
         * 윤년은 연도가 4의 배수이면서 100의 배수가 아닐 때,
         * 또는 400의 배수
         *
         * 2012년은 4의 배수이면서 100의 배수가 아니라 윤년
         * 1900년은 100의 배수이고 400의 배수가 아니라 윤년이 아니다
         * 2000년은 400의 배수이기 때문에 윤년이다
         *
         * 연도는 0보다 크고 4001보다 작은 자연수
         * int year = 2000; => 결과 true
         * int year = 1999; => 결과 false
         *
         *
         */

        int year = 3640;

        boolean step1 = year > 0;
        boolean step2 = year < 4001;
        boolean step3 = year % 4 == 0;
        boolean step4 = year % 100 != 0;
        boolean step5 = year % 400 == 0;

        boolean result = step1 && step2 && (step3 && step4 || step5);

        System.out.println(result);
        System.out.println( year > 0 &&
                            year < 4001 &&
                            (year % 100 !=0 && year % 4 == 0 ||
                            year % 400 == 0));







    }
}
