package com.study.ch19;

public class BuilderMain {
    public static void main(String[] args) {

        // static. Car in Carbuilder(static class)
        Car.CarBuilder carBuilder = new Car.CarBuilder(); // 생성자(Car class 안에 들어있음)
        Car car2 = carBuilder.build(); //Car 객체 new 생성

        // builder = static method 접근
        Car car = Car.builder()
                .model("아반떼")
                .color("블랙")
                .build(); //생성

        System.out.println(car);

        Car2 car22 = new Car2.Car2Builder()
                .name("a")
                .color("red")
                .build();
        System.out.println(car22);

        Member member = new Member("김준일","01012345678");
        Member member2 = Member.builder()
                .phone("012345678")
                .name("b")
                .build();

        System.out.println(member);
        System.out.println(member2);
    }
}

/*
    Car(폴더) -> model(폴더), color(폴더)
    model -> String(txt)

    new Car() -> Car폴더 복사
    car.model() = 접근 (위치)

    static company 폴더생성 -> 복사 시도 -> 복사 안됨
    객체 안에 static 복사 X

    car2에서 static 사용 -> Car(클래스).company(=builder) 접근
    Car.builder() 접근 -> builder()는 리턴할 때 new (static끼리 접근가능) CarBuild();
    builder() 안데 static Carbuilder 클래스 존재

    Carbuilder 안에 model, color(멤버변수), build, + 새변수 model,color(=setter:메소드를 통해 값 할당)(this.존재:리턴해줌)

    Car.builder().build() = 인스턴스 메모리 할당
    Car.builder() 사용마다 new Carbuilder 실행 - 생성
    .build(); = build메소드 호출

    build() -> new Car();
    Car car = Car.builder().build();
    Car car = Car.builder().model(this.model=model).color(return this=builder())

    model과 color는 Carbuilder()에 들어있음 -> Car에 넣는 것이 목표

    생성자
    @AllargsConstuctor
    public Car(String model, String color)
    { this.model = model; this.color=color; }

    build() -> new Car() 생성자에 넣어줌(전달)
    Car 폴더 -> model 폴더 (String에 값 넣어줌) / color 폴더 (String = null)

    static 접근 - builder() 호출 - build() 호출 -> new Car 생성 (static 제외 복사, 메모리 주소 생성)


 */