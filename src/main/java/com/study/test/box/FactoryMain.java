package com.study.test.box;


public class FactoryMain {

    public static void main(String[] args) {

        Factory factory1 = Factory.getInstance();
        Factory factory2 = Factory.getInstance();
        Factory factory3 = Factory.getInstance();

        factory1.setFactoryName("삼성");
        factory3.setFactoryAddress("경기도");

        System.out.println(factory1);
        System.out.println(factory2);
        System.out.println(factory3);
        System.out.println(factory1 == factory2);



    }
}
