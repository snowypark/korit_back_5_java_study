package com.study.ch13.box;

import com.study.ch13.Company;
import com.study.ch13.box.A;
import com.study.ch13.box.A2;

public class TestMain {
    public static void main(String[] args) {

        A a = new A();
        A2 a2 = new A2();
        Company company = Company.getInstance();

        a.a(company);
        a2.a2(company);

    }
}
