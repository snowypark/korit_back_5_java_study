package com.study.ch18;

import java.nio.channels.AsynchronousByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

// https://bangu4.tistory.com/215
public class LambdaMain {
    public static void main(String[] args) {

        Runnable start = () -> {    //람다식 함수 안에 함수 정의
            System.out.println("프로그램을 실행합니다.");
            System.out.println("데이터를 초기화 합니다");
            int a = 10;
            int b = 20;
            System.out.println("a + b =" + (a + b));
        };

        start.run();

        Supplier<Integer> supplier1 = () -> 10;
        int a = supplier1.get();

        Supplier<Scanner> scannerInstance = () -> new Scanner(System.in);
//        scannerInstance.get().nextLine();

        Consumer<String> setName = name -> {
            String newName = name + "님";
            System.out.println(name);
        };

        setName.accept("김준일");

        ArrayList<String> strList = new ArrayList<>();
        strList.add("a");
        strList.add("b");
        strList.add("c");

        Consumer<String> action = str -> System.out.println(str);

        action.accept("김준일");
        strList.forEach(str -> System.out.println(str));

        Function<Integer, String> fx1 = num -> Integer.toString(num * num);
        String result = fx1.apply(10);
        System.out.println(result);

        String result2 = fx1.andThen(num -> {
            System.out.println("andThen에 넣은 함수 " +num);
            return "문자열 " + num;
        }).apply(10);

        System.out.println(result2);

        Predicate<Integer> filterFx = num -> num % 2 ==0;

        List<Integer> numList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            numList.add(i+1);
        }

        System.out.println(numList); // 1 ~ 10

        // stream -> 뒤로 못 돌아감. filter로 일치값만 담음(반복).
        // List -> stream -> 조건 -> 답만 stream에 담기 -> collection에 담기 -> toList에 담기
        List<Integer> newList = numList.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);

        // List -> (2,4,6,8,10) -> stream -> num에서 꺼내 *2 -> num -> 반복(기존*2->newList2)
        // map - Function(T 데이터, R 리턴) : 가공
        List<Integer> newList2 = newList.stream().map(num -> num * 2).collect(Collectors.toList());
        System.out.println(newList2);

    }
}