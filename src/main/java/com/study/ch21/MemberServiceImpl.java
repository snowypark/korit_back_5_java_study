package com.study.ch21;

import com.study.ch19.Member;

import java.util.ArrayList;

public class MemberServiceImpl implements MemberService{

    @Override
    public void printMemberList(ArrayList<Member> members) throws Exception {
        for(int i = 0; i < 5 ; i++) {
            System.out.println(members.get(i));
        }
    }
}
