package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task1();

    }
    public static void task1(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet pirmo skaitli!");
        int a = sc.nextInt();
        System.out.println("Ievadiet otru skaitli");
        int b = sc.nextInt();

        System.out.println(a + b);

    }


    public static void sample1(){
        System.out.println("Ievadi savu vārdu!");

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        System.out.println("Sveiki, " + input);
}
}