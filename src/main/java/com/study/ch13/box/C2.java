package com.study.ch13.box;

import com.study.ch13.Company;

public class C2 {
    public void c2(Company company) {
        System.out.println("<< C2 클래스 >>");
        System.out.println(company);
        System.out.println("<< C클래스 싱글톤 결과 >>");
        System.out.println(Company.getInstance());

    }
}
