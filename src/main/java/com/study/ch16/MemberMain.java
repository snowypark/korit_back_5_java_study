package com.study.ch16;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Member> members = new ArrayList<>();
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

            String name = null;
            String address = null;
            String error = "해당 이름의 회원이 존재하지 않습니다.";


            if("q".equalsIgnoreCase(selectedMenu)){
                break;
            }else if ("1".equals(selectedMenu)) {
                /* 1 - 5 - 4 - 6 - 2 - 3
                    [ 회원 등록하기 ]
                    이름 >> 김준일
                    주소 >> 부산 동래구
                    << 등록이 완료되었습니다. >>
                 */
                System.out.println("[ 회원 등록하기");

                System.out.print("이름 >> ");
                name = scanner.nextLine();
                System.out.print("주소 >> ");
                address = scanner.nextLine();

                members.add(new Member(name, address));
                System.out.println("등록이 완료되었습니다.");

            }else if ("2".equals(selectedMenu)) {
                /*
                    [ 회원 이름 수정하기 ]
                    수정 할 회원의 이름을 입력하세요 >> 김준일
                    이름 >> 김준이
                    << 등록이 완료되었습니다. >>
                 */
                String oldName = null;
                String newName = null;

                System.out.println("[ 회원 이름 수정하기 ]");
                System.out.print("수정 할 회원의 이름을 입력하세요 >> ");
                oldName = scanner.nextLine();
                System.out.print("이름 >> ");
                newName = scanner.nextLine();

                if(oldName == null) {
                    continue;
                }
//                members.set(members.indexOf(oldName), new Member(newName, members.indexOf(newName)).getAddress());
                System.out.println(members);


            }else if ("3".equals(selectedMenu)) {
                /*
                    [ 회원 주소 수정하기 ]
                    수정 할 회원의 이름을 입력하세요 >> 김준일
                    해당 이름의 회원이 존재하지 않습니다.
                    주소 >> 부산 동래구 사직동
                    << 등록이 완료되었습니다. >>
                 */
            }else if ("4".equals(selectedMenu)) {
                /*
                    [ 회원 이름으로 조회하기 ]
                    조회 할 회원의 이름을 입력하세요 >> 김준이
                    Member 객체의 toString();
                    << 조회가 완료되었습니다. >>
                 */

                System.out.println("[ 회원 이름으로 조회하기 ]");
                System.out.print("조회 할 회원의 이름을 입력하세요 >> ");
                String search = null;
                search = scanner.nextLine();

                for(int i = 0; i <members.size(); i++) {
                    if(search.equals(members.get(i).getName())){
                        System.out.println(search);
                    }else {
                        System.out.println(error);
                    }
                }
                System.out.println("조회가 완료되었습니다.");

            }else if ("5".equals(selectedMenu)) {
                /*
                    [ 회원 전체 조회하기 ]
                    MemberList 전체 반복 toString();
                    << 조회가 완료되었습니다. >>
                 */
                System.out.println("[ 회원 이름으로 조회하기 ]");
                System.out.println(members);
                System.out.println("조회가 왼료되었습니다.");

            }else if ("6".equals(selectedMenu)) {
                /*
                    [ 회원 이름으로 삭제하기 ]
                    삭제할 할 회원의 이름을 입력하세요 >> 김준이
                    삭제된 Member 객체 toString(); //remove 기능 사용
                    << 삭제가 완료되었습니다. >>
                 */
                String removeName = null;
                System.out.println("[ 회원 이름으로 삭제하기 ]");
                System.out.print("삭제 할 회원의 이름을 입력하세요 >> ");
                removeName = scanner.nextLine();
//                 if(search.equals(members.get(i).getName())){
//                        System.out.println(search);
//                    }else {
//                        System.out.println(error);
                for(int i = 0; i <members.size(); i++) {
                    if(removeName.equals(members.get(i).getName())){
                        System.out.println(members.get(i).toString());
                        members.remove(i).toString();


                        System.out.println("<< 삭제가 완료되었습니다. >>");

                    }

                }
                System.out.println(error);


            }else {
                System.out.println("다시 선택하세요.");
            }
                System.out.println();

            System.out.println("프로그램 종료");

        }
    }
}
