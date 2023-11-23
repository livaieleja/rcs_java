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
}
