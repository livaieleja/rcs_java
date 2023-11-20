package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = task3(4);
        System.out.println(sum);
       // String result = sampleFull( "aaa", "bbbb", "cccccc");
       // System.out.println(result);
       // int result = sampleWithReturn();
       // System.out.println(result);
        //        String a = anothersample();
        //        task1( "aaaaaaaaa", "bbbb", "cccc");
        //        task2(2);
        //        samplewithparams( 2,  5);
        //        samplewithparams( 99, -15);
    }

    public static int task3 (int count) {
        if (count < 1) {
            System.out.println("Kļūda");
            return 0;
        }
        int sum = 0;

            for (int i = 1; i <= count; i++) {
                sum = sum + i;
            }

            return sum;
    }


    public static String sampleFull (String a, String b, String c){
        String result = c + b + a;
        if (result.length() <= 15) {
            return result;
        }else{
            return c +a;
        }

    }
    public static void samplewithparams(int a, int b) {
        System.out.println("Summa ir:");
        System.out.println(a + b);
    }

    public static void task1(String c, String d, String e) {

        if (e.length() + d.length() + c.length() >= 15) {
            System.out.println(c + d);
        } else {
            System.out.println(e + d + c);

        }
    }

    public static void task2(int l) {
        if (l >0) {
            String symbol = "";
            for (int i = 0; i < l; i++) {
                symbol = symbol + "$";
                System.out.println(symbol);
            }
            }else {
            System.out.println("$");
        }
        }

        public static int sampleWithReturn(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Ievadiet skaitli!");
            int a =sc.nextInt ();

            System.out.println("Ievadiet skaitli!");
            int b = sc.nextInt ();

            int c = a+b;

            return c; // return no metodes atgriež vērtību

        }

        public static String anothersample() {
        String c = "aaa" + "bbbb";
            return c;
        }
    }
