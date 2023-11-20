package org.example;

public class Main {
    public static void main(String[] args) {
            task1( "aaaaaaaaa", "bbbb", "cccc");
            samplewithparams( 2,  5);
            samplewithparams( 99, -15);
    }
    public static void samplewithparams(int a, int b){
        System.out.println("Summa ir:");
        System.out.println(a + b);
    }

    public static void task1(String c, String d, String e) {

        if (e.length() + d.length() + c.length() >= 15) {
            System.out.println(c + d);
        }else{
            System.out.println(e+d+c);

        }
    }

}