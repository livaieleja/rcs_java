package org.example;

import java.util.Scanner;

public class Homework {

    public static int task1(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double task2(int[] a) {
        double sum = task1(a);
        return sum / a.length;
    }

    public static int task11(int[] arr) {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
    }

    public static int hometaskDay7() {
        Scanner sc = new Scanner(System.in);
        int number;

        while (true) {
            System.out.println("Lūdzu, ievadiet skaitli!");
            String input = sc.nextLine();

            try {
                number = Integer.parseInt(input);
                System.out.println(number);
            } catch (Exception e) {
                return 0;
                }
            }
        }
    }
