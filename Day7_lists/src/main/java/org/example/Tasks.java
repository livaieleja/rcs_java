package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Tasks {

    public static double task1(double[] number) {
        double biggest = number[0];

        for (int i = 0; i < number.length; i++) {
            if (number[i] > biggest) {
                biggest = number[i];
            }
        }
        return biggest;
    }

    public static void task2() {
        List<String> stringList = new ArrayList<>();
        System.out.println("Izvēlieties, cik vērtības pievienot String tipa listam!");
        Scanner sc = new Scanner(System.in);
        int values;
        try {
            values = sc.nextInt();
        } catch (Exception e) {
            values = 2;
            System.out.println("Nepareiza ievade, automātiski piešķirts garums 2");
        }

        for (int i = 0; i < values; i++) {
            System.out.println("Ievadiet vērtību");
            stringList.add(sc.next());
        }

        System.out.println("Ievadiet 1, ja gribas izvadīt visas vērtības, 2 ja gribat izvadīt konkrētu vērtību!");
        String choice = sc.next();

        if (choice.equals("1")) {
            for (String el : stringList) {
                System.out.println(el);
            }
        } else if (choice.equals("2")) {
            try {
                System.out.println("Ievadiet indeksu");
                int i = sc.nextInt();
                System.out.println(stringList.get(i));
            }catch (Exception ex){
                System.out.println("Nepareiza ievade");
            }
        } else {
            System.out.println("Nepareiza ievade!");
        }
    }

    public static int task3() {
        System.out.println("Ievadiet skaitli!");
        Scanner sc = new Scanner(System.in);
        int number;
        try {
            number = sc.nextInt();
        }
        catch (Exception e) {
            number = 0;
        }
        return number;
    }
}
