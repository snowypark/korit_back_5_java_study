package com.study.ch08.car;

public class CarRepository {
    final Car[] cars;

    CarRepository(Car[] cars) {
        this.cars = cars;
    }

//
//    int getEmptyCount() {
//        int emptyCount = 0;
//        for (int i = 0; i < cars.length; i++) {
//            if (cars[i] == null) {
//                emptyCount++;
//            }
//        }
//        return  emptyCount;
//    }

    int getEmptyIndex() {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == null) {
                return i;
            }
        }
        return -1;
    }

    void insert(Car car) {
        cars[getEmptyIndex()] = car;
    }

    Car[] getCarDatas() {
        int carCount = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                carCount++;
            }
        }

        Car[] newCars = new Car[carCount];
        int j = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                newCars[j] = cars[i];
                j++;
            }
        }
        return newCars;
    }

}

