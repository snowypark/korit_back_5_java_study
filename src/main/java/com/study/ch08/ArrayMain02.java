package com.study.ch08;

public class ArrayMain02 {
    public static void main(String[] args) {

        String[] names = new String[5];
        names[0] = "최수현";
        names[1] = "전주환";
        names[2] = "서창현";
        names[3] = "예홍렬";
        names[4] = "심재원";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);

        System.out.println("---------");


        for(int i = 0; i<names.length ; i++) {
                    System.out.println(names[i]);
                }

    }
}
