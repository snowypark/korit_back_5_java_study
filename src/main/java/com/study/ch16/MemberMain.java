package com.study.ch16;

import java.awt.*;
import java.nio.channels.AsynchronousByteChannel;
import java.util.ArrayList;
import java.util.Scanner;

public class MemberMain {
    private static ArrayList<Member> members = new ArrayList<>();

    public static String inputSerachName(String label){
        Scanner scanner = new Scanner(System.in);
        System.out.print(label + " >> ");
        return scanner.nextLine();

    }

    public static Member findMemberByName(String name) { //ArrayList static으로 공유
       //반복으로 일치하는 이름 찾기
        for(Member member : members){
            if(member.getName().equals(name)){
                return member;
            }
        }
        return null; //없으면 null
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String selectedMenu = null;

        while (true) {
            System.out.println("회원 관리 프로그램");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 이름 수정");
            System.out.println("3. 회원 주소 수정");
            System.out.println("4. 회원 이름으로 조회");
            System.out.println("5. 회원 전체");
            System.out.println("6. 회원 삭제");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택 >> ");

            selectedMenu = scanner.nextLine();

            if("q".equalsIgnoreCase(selectedMenu)){
                break;
            }else if ("1".equals(selectedMenu)) {
                /* 1 - 5 - 4 - 6 - 2 - 3
                    [ 회원 등록하기 ]
                    이름 >> 김준일
                    주소 >> 부산 동래구
                    << 등록이 완료되었습니다. >>
                 */

                String name = null;
                String address = null;
                System.out.println("[ 회원 등록하기");

                System.out.print("이름 >> ");
                name = scanner.nextLine();
                System.out.print("주소 >> ");
                address = scanner.nextLine();

                Member member = new Member(name,address);
                members.add(member);

                System.out.println("<< 등록이 완료되었습니다. >>");

            }else if ("2".equals(selectedMenu)) {
                /*
                    [ 회원 이름 수정하기 ]
                    수정 할 회원의 이름을 입력하세요 >> 김준일
                    이름 >> 김준이
                    << 등록이 완료되었습니다. >>
                 */

//                String oldName = null;
//                String newName = null;
//                System.out.print("수정 할 회원의 이름을 입력하세요 >> ");
//
//                oldName = scanner.nextLine();
//                System.out.print("이름 >> ");
//                newName = scanner.nextLine();
//                Member rename = null;
//
//                for(Member member : members){
//                    if(member.getName().equals(newName)){
//                        rename = member;
//                        break;
//                    }
//                }
//                if(rename == null) {
//                    System.out.println("해당 이름의 회원이 존재하지 않습니다.");
//                    continue;
//                }
//                System.out.println(rename);

                System.out.println("[ 회원 이름 수정하기 ]");
                String serchName = inputSerachName("수정 할 회원의 이름을 입력하세요.");
                Member findMember = findMemberByName(serchName);
                if(findMember == null) {
                    continue;
                }
                System.out.print("이름 >> ");
                String updateName = scanner.nextLine();
                findMember.setName(updateName);
                System.out.println("<< 수정이 완료되었습니다. >>");
                System.out.println();

            }else if ("3".equals(selectedMenu)) {
                /*
                    [ 회원 주소 수정하기 ]
                    수정 할 회원의 이름을 입력하세요 >> 김준일
                    해당 이름의 회원이 존재하지 않습니다.
                    주소 >> 부산 동래구 사직동
                    << 등록이 완료되었습니다. >>
                 */
//
//                String newAddress = null;
//                String oldAddress = null;
//
//                System.out.println("[ 회원 주소 수정하기 ]");
//                System.out.print("수정 할 회원의 이름을 입력하세요 >> ");
//                newAddress = scanner.nextLine();
//
//                if (newAddress == null) {
//                    continue;
//                }else if(newAddress == oldAddress){
////                    members.set(members.indexOf())
//                }

                System.out.println("[ 회원 주소 수정하기 ]");
                String searchAddress = inputSerachName("수정 할 회원의 이름을 입력하세요.");
                Member findMember = findMemberByName(searchAddress);
                if(findMember == null) {
                    continue;
                }
                System.out.print("주소 >> ");
                String updateAddress = scanner.nextLine();
                findMember.setAddress(updateAddress);
                System.out.println("<< 수정이 완료되었습니다. >>");
                System.out.println();

            }else if ("4".equals(selectedMenu)) {
                /*
                    [ 회원 이름으로 조회하기 ]
                    조회 할 회원의 이름을 입력하세요 >> 김준이
                    Member 객체의 toString();
                    << 조회가 완료되었습니다. >>
                 */

//                System.out.print("조회 할 회원의 이름을 입력하세요 >> ");
//                String searchName = null;
//                searchName = scanner.nextLine();

//                for(int i = 0; i <members.size(); i++) {
//                    if(searchName.equals(members.get(i).getName())){
//                        System.out.println(members.get(i).toString());
//                    }else {
//                        System.out.println("해당 이름의 회원이 존재하지 않습니다.");
//                    }
//                }

                System.out.println("[ 회원 이름으로 조회하기 ]");
                String searchName = null;
                searchName = inputSerachName("조회 할 회원의 이름을 입력하세요");

                Member findMember = findMemberByName(searchName);
                if(findMember == null){
                    System.out.println("해당 이름의 회원이 존재하지 않습니다");
                    continue;
                }

                System.out.println(findMember);
                System.out.println("<< 조회가 완료되었습니다. >>");
                System.out.println();


            }else if ("5".equals(selectedMenu)) {
                /*
                    [ 회원 전체 조회하기 ]
                    MemberList 전체 반복 toString();
                    << 조회가 완료되었습니다. >>
                 */
                System.out.println("[ 회원 이름으로 조회하기 ]");
//                System.out.println(members);
                for(Member member : members){
                    System.out.println(member);
                }

                System.out.println("<< 조회가 왼료되었습니다. >>");
                System.out.println();

            }else if ("6".equals(selectedMenu)) {
                /*
                    [ 회원 이름으로 삭제하기 ]
                    삭제할 할 회원의 이름을 입력하세요 >> 김준이
                    삭제된 Member 객체 toString(); //remove 기능 사용
                    << 삭제가 완료되었습니다. >>
                 */
//                String removeName = null;
//                System.out.println("[ 회원 이름으로 삭제하기 ]");
//                System.out.print("삭제 할 회원의 이름을 입력하세요 >> ");
//                removeName = scanner.nextLine();
//
//                for(int i = 0; i <members.size(); i++) {
//                    if(removeName.equals(members.get(i).getName())){
//                        System.out.println(members.get(i).toString());
//                        members.remove(i).toString();

                String searchName = null;
                Member findMember = null;

                System.out.println("[ 회원 이름으로 삭제하기 ]");
                System.out.print("삭제 할 회원의 이름을 입력하세요 >> ");
                searchName = scanner.nextLine();

                for(Member member : members){
                    if(member.getName().equals(searchName)){
                        findMember = member;
                        break;
                    }
                }
                if(findMember == null){
                    System.out.println("해당 이름의 회원이 존재하지 않습니다");
                    System.out.println();

                    continue;
                }
                members.remove(findMember);
//                members.remove(members.indexOf(findMember)); // index로 지우기
                System.out.println(findMember.toString());
                System.out.println("<< 삭제가 완료되었습니다. >>");
                System.out.println();

            } else {
                System.out.println("다시 선택하세요");

                }


            System.out.println("------------");
            System.out.println("프로그램 종료");

        }
    }
}
