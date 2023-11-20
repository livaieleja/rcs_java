package org.example;

public class Main {
    public static void main(String[] args) {
            task1( "aaa", "bbb", "ccc");
            samplewithparams( 2,  5);
            samplewithparams( 99, -15);
    }
    public static void samplewithparams(int a, int b){
        System.out.println("Summa ir:");
        System.out.println(a + b);
    }

    public static void task1(String c, String d, String e) {
        System.out.println(e + d + c);

    }

}