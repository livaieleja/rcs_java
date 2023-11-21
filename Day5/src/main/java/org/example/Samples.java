package org.example;

import java.util.Scanner;

public class Samples {
    public static int c = 3; //mainīgais, kurš strādā visur, jo ir iekšā lielajās iekavās.

    public static void sample1() {
        int a = sum();
        System.out.println(a);
    }

    public static int sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet skaitli!");
        int sk1 = sc.nextInt();

        System.out.println("Ievadiet skaitli!");
        int sk2 = sc.nextInt();

        return sk1 + sk2;

    }
}
