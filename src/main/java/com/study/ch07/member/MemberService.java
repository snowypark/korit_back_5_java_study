package com.study.ch07.member;

import com.sun.source.tree.MemberReferenceTree;

import java.util.Scanner;

public class MemberService {

    String inputValue(String label) {
        Scanner scanner = new Scanner(System.in) ;
        String value = null;

        while (true) {
            System.out.print(label + "(입력취소: exit) >>> ");
            value = scanner.nextLine();
            if(!value.isBlank()){
                break;
            }
        }
        return value;
    }

    boolean addMember() {

        String code = null;
        String name = null;
        String age = null;
        String address = null;

        System.out.println("<<< 회원등록 >>>");

        code = inputValue("회원코드");
        if("exit".equalsIgnoreCase(code)) {
            return false;
        }
        name = inputValue("이름");
        if("exit".equalsIgnoreCase(name)) {
            return false;
        }
        age = inputValue("나이");
        if("exit".equalsIgnoreCase(age)) {
            return false;
        }
        address = inputValue("주소");
        if("exit".equalsIgnoreCase(address)) {
            return false;
        }


        Member member = new Member(code, name, Integer.parseInt(age) , address);

        MemberRepository memberRepository = new MemberRepository();


        return memberRepository.insert(member) > 0;

//        while (true) {
//            System.out.print("회원코드 >>> ");
//            code = scanner.nextLine();
//            if(!code.isBlank()){
//                //null일수없어서 isBlank
//                break;
//            }
//        }
//        while (true) {
//            System.out.print("이름 >>> ");
//            name = scanner.nextLine();
//            if(!name.isBlank()){
//                break;
//            }
//        }
//
//        System.out.print("이름 >>> ");
//        name = scanner.nextLine();
//
//        System.out.print("나이 >>> ");
//        age = scanner.nextLine();
//
//        System.out.print("주소 >>> ");
//        address = scanner.nextLine();
//

    }
}
