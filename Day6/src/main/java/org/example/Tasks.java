package org.example;

import java.util.Scanner;

public class Tasks {
    public static double averagenumber(int count) {
        Scanner sc = new Scanner(System.in);

        double sum = 0;
        for (int i = 0; i < count; i++) {
            System.out.println("Ievadiet skaitli!");
            double number = sc.nextInt();
            sum += number; // ir tas pats, kas sum = sum + number
        }

        return sum / count;
    }

    public static void run (){
        task2();
    }
    private static void task2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet skaitli!");
        int input = sc.nextInt();
        int smallest = Integer.MAX_VALUE;

        while (true) {
            smallest = input;

            System.out.println("Ievadiet skaitli!");
            input = sc.nextInt();

            if (input >= smallest) {
                System.out.println("Hello world!");
            }else{
                break;
            }
        }
    }
}


