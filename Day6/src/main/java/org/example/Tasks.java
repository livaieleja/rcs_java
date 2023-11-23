package org.example;

import java.util.Scanner;

public class Tasks {

    public static void task3(){
        Scanner sc = new Scanner(System.in);
        int len = 0;
        String [] a = new String[5];
        for (int i = 0; i < 5; i++) {

            System.out.println("Ievadiet vērtību!");
            a [1] = sc.nextLine();
            len = a [1].length ();
            System.out.println(a[1] + " " +len);
            System.out.println("-------------");
            System.out.println("Ievadiet vērtību!");
            a [2] = sc.nextLine();
            len = a [2].length ();
            System.out.println(a[2] + " " +len);
            System.out.println("-------------");
            System.out.println("Ievadiet vērtību!");
            a [3] = sc.nextLine();
            len = a [3].length ();
            System.out.println(a[3] + " " +len);
            System.out.println("-------------");
            System.out.println("Ievadiet vērtību!");
            a [4] = sc.nextLine();
            len =  a [4].length ();
            System.out.println(a[4] + " " +len);
            System.out.println("-------------");
            System.out.println("Ievadiet vērtību!");
            a [5] = sc.nextLine();
            len =  a [5].length ();
            System.out.println(a[5] + " " +len);
        }
    }


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


