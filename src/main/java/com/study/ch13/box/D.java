package com.study.ch13.box;

import com.study.ch13.Company;

public class D {
    public void d(Company company) {
        System.out.println("<< D클래스 >>");
        System.out.println(company);
        System.out.println("<< D클래스 싱글톤 결과 >>");
        System.out.println(Company.getInstance());
    }
}
