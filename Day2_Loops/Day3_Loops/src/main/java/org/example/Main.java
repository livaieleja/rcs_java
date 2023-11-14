package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1 ();
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