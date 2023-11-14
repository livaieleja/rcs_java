package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task2 ();
    }

    public static void task2() {
        Scanner sc = new Scanner(System.in);

        int len = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Ievadiet simbolu virkni");
            String input = sc.nextLine();
            len = len + input.length();
        }
        System.out.println("Simbolu virknes kopējais garums ir " + len);

    }


    public static void sample2() {
        Scanner sc = new Scanner(System.in);


        int b = 0; //iedod skaitlim vērtību, tas ir obligāti jāizdara un pēc tam ciklā mainām vērtību.
        for (int i = 0; i < 3; i++) {
            System.out.println("Ievadiet skaitli");
            int a = sc.nextInt();
            b = b + a;
            System.out.println(a);
            System.out.println("----------------");
        }
        System.out.println("Summa ir " + b);

    }


    public static void task1() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            System.out.println("Ievadiet skaitli");
            int a = sc.nextInt();
            System.out.println(a+5);
        }
    }

    public static void sample1(){

        for(int i = 0; i <5; i++) {
            System.out.println(i);
            System.out.println("Hello world");
            System.out.println("------------");
        }
    }
}