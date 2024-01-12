package com.study;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*  Test
            ch19 - builder

         */

        /*
            접근지정자
            public
            private
            protected
            default
         */

        /*
            싱글톤
                     public class Printer {

                private static Printer printer = null;

                private Printer(){}

                public static Printer getInstance() {
                    if(printer == null) {
                        printer = new Printer();
                    }
                    return printer;
                }

                public void print(String input) {
                    System.out.println(input);
                }
    }
         */

    }
}