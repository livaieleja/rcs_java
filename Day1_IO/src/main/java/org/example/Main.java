package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println("Mani sauc Līva");
        System.out.println("1+2");
        System.out.println(1+2);
        System.out.println("aaaa " + " bbbb");

        String a = "aaaa"; //Simbolu virkne
        System.out.println(a);
        a = "abc";
        System.out.println(a + " " + "bbb");

        int b = 1; //Vesels skaitlis
        b = 2+4;
        System.out.println(b - 9);

//        double c = 4.2;
//        boolean d = true;
//        char e = 'a';

        // Uzdevums
        // 1.Likt lietotāja ievadīt trīs simbolu virknes (atsevišķi);
        // 2.Izvadīt ievadītos vārdus otrādā secībā

        Scanner sc = new Scanner(System.in); // Vienmēr nepieciešama priekš ievades loga, pēc kura augšā parādās, jauns teksts - import java.util.Scanner;
        System.out.println("Lūdzu, ievadiet vienu vārdu!");// uzrakstam lietotājam tekstu, lai viņš zina, ko darīt
        String pirmais = sc.nextLine(); //lietotājam jāievada viens vārds
        System.out.println("Lūdzu, ievadiet otru vārdu!");
        String otrais = sc.nextLine(); //lietotājam jāievada otrs vārds
        System.out.println("Lūdzu, ievadiet trešo vārdu!");
        String tresais = sc.nextLine(); //lietotājam jāievada trešais vārds
        System.out.println(tresais + " " + otrais + " " + pirmais); // Tiek izvadīti ievadītie vārdi otrādā secībā

        //Uzdevums
        // 1.Likt lietotājam ievadīt savu vārdu;
        // 2.Izvadīt "Sveiki, ievadītasi lietotāja vārds!

        //Scanner sc = new Scanner(System.in);
        //System.out.println("Lūdzu, ievadiet savu vārdu!");
        //String vards = sc.nextLine();
        //System.out.println("Sveiki, " + vards);

        }
    }