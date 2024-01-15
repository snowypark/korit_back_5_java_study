package com.study.test.box;


public class FactoryTest2 {
    public static void main(String[] args) {

        Factory factory3 = Factory.getInstance();

        System.out.println(factory3.getFactoryName());
        System.out.println(factory3.getFactoryAddress());
    }
}
