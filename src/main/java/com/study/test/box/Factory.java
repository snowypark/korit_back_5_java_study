package com.study.test.box;

public class Factory {

    private String factoryName;
    private String factoryAddress;
    private static Factory instance;

    private Factory() {
    }

    public static Factory getInstance(){
        if(instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getFactoryAddress() {
        return factoryAddress;
    }

    public void setFactoryAddress(String factoryAddress) {
        this.factoryAddress = factoryAddress;
    }

    @Override
    public String toString() {
        return "Factory{" +
                "factoryName='" + factoryName + '\'' +
                ", factoryAddress='" + factoryAddress + '\'' +
                '}';
    }
}
