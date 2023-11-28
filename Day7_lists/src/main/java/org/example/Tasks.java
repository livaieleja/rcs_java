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

    public static int task2() {
        Scanner sc = new Scanner(System.in);
        List<String> stringList = new ArrayList<>();

        System.out.println("Izvēlieties, cik vērtības pievienot String tipa listam!");
        int values = sc.nextInt();

        for (int i = 0; i < values; i++) {
            stringList.add("kaķis");
            stringList.add("suns");
            stringList.add("pīle");
            stringList.add("zaķis");
            stringList.add("vista");
            stringList.add("cālis");
            stringList.add("zirgs");
        }

        System.out.println("Izvēlieties vai izvadīt visas vērtības, ievadot ciparu - 0 vai kādu konkrētu vērtību norādot ciparu sākot ar 1!");
        int choice = sc.nextInt();

        if (choice == 0) {
            return stringList.size();
    }else{
        if (choice >0 && choice<=stringList.size()) {
            return "Vērtība ir" + stringList.add(choice);
        }else{
            return "Vērtība neeksistē!";
        }
        }
    }
}
