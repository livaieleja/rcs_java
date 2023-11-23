package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int rezultats = hometask();
        System.out.println("Rezultāts ir " + rezultats);
    }

        public static int hometask() {
            Scanner sc = new Scanner(System.in);

            System.out.println("Lūdzu norādiet ciparu, kuru darbību vēlaties veikt: 1 - saskaitīšanu, 2 - atņemšanu, 3 - reizināšanu, 4 - dalīšanu");
            int choice = sc.nextInt ();

            System.out.println("Lūdzu, ievadiet pirmo skaitli!");
            int a = sc.nextInt ();

            System.out.println("Lūdzu, ievadiet otro skaitli!");
            int b = sc.nextInt ();

            int result = Integer.MIN_VALUE;
            if (choice ==1) {
                result = Calculations.saskaitsana(a, b);
            }else if (choice ==2) {
                result = Calculations.atnemsana(a, b);
            }else if (choice ==3) {
                result = Calculations.reizinasana(a, b);
            }else if (choice == 4) {
                result = Calculations.dalisana(a, b);
            }else{
                System.out.println("Nav ievadīta korekta darbība");
            }
            return result;
            }
        }