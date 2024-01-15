package com.study.test.box;


public class FactoryTest1 {
    public static void main(String[] args) {

        Factory factory2 = Factory.getInstance();

        factory2.setFactoryName("삼성");
        factory2.setFactoryAddress("경기도");
    }
}
