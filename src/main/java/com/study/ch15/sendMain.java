package com.study.ch15;

public class sendMain {
    public static void main(String[] args) {

        // <> 생략시 object 타입 (생략x)
        // 일반 자료형 불가능 (int, char x) class 타입 사용 (Integer, String)
        SendData<String> sendData1 = new SendData<>(200, "김준일"); // 앞에서 정의 - <>생략가능
//        send(sendData1);

        SendData<Member> sendData2 = new SendData<>(200, new Member("김준일","01099881916"));
        send(sendData2);

        SendData<VipMember> sendData3 = new SendData<>(200, new VipMember("김준이", "01099881916"));
        send(sendData3);
    }

                                    //extends Member = Member 상속 받은 경우만 가능
                                    //super VipMember = VipMember 와 그 부모(Member)까지만 가능. super 방향 아래->위
    public static void send(SendData<? super VipMember> sendData) {    // <?> 와일드카드 - 리턴 타입 모를때. 제한 가능
        sendData.send();
    }
}
