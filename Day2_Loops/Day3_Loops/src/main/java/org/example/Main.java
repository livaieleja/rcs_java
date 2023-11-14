package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sample6 ();
    }

    public static void sample6() {
        //Uztaisīt ciklu, kas darbojas kamēr lietotājs neievada negatīvu skaitli
        //Izvadīt skaitļu summu

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int input = 0;

        while(input >= 0){

            System.out.println("Ievadiet skaitli!");
            input = sc.nextInt();
            if (input<0){
                break;
            }

            sum = sum + input;

        }
        System.out.println("Summa ir " + sum);
    }

    public static void sample5() {
    //cikls darbojas līdz lietotājs uzraksta vārdu exit
        Scanner sc = new Scanner(System.in);
        String input = "" ; //simbolu virknes versija, definējot 0 vērtību/tukšumu - nepieciešams

        while(!input.equals("exit")){ // ! nozīmē pagriezt nosacījumu uz otru pusti, tad ja ir equals + ! tātad, lai nav vienāds.
            System.out.println("Hello world!");
            System.out.println("Ievadīt simbolu virkni!");
            input = sc.nextLine();
        }
    }

    public static void task3() {
        Scanner sc = new Scanner(System.in);

        int b = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Lūdzu ievadiet skaitli!");
            int number = sc.nextInt();
            if (number > 0) {
                b = b + number;
            } else {
                System.out.println("Kļūda");
            }
        }
        System.out.println("Summma ir " + b);
    }


    public static void sample3() { //6x var vadīt skaitli un katru skaitli ievadot parādās attiecīgais paziņojums
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Lūdzu ievadiet skaitli!");
            int number = sc.nextInt();

            if(number == 0) {
                System.out.println("Kļūda");
            }else if(number == 4) {
                System.out.println("Hello!");
            }else{
                System.out.println("Hello! 2");
            }
        }
    }

    public static void sample4() { //Ja ievada 5 tad parāda 6x hello, ja citu skaitli, tad Kļūda!
        Scanner sc = new Scanner(System.in);

        System.out.println("Lūdzu ievadiet skaitli!");
        int number = sc.nextInt();

        if(number == 5) {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
            }
        }else{
            System.out.println("Kļūda");
        }
    }


    public static void task2() {
        Scanner sc = new Scanner(System.in);

        int len = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Ievadiet simbolu virkni");
            String input = sc.nextLine();
            len = len + input.length();
        }
        System.out.println("Simbolu virknes kopējais garums ir " + len);

    }


    public static void sample2() {
        Scanner sc = new Scanner(System.in);


        int b = 0; //iedod skaitlim vērtību, tas ir obligāti jāizdara un pēc tam ciklā mainām vērtību.
        for (int i = 0; i < 3; i++) {
            System.out.println("Ievadiet skaitli");
            int a = sc.nextInt();
            b = b + a;
            System.out.println(a);
            System.out.println("----------------");
        }
        System.out.println("Summa ir " + b);

    }


    public static void task1() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            System.out.println("Ievadiet skaitli");
            int a = sc.nextInt();
            System.out.println(a+5);
        }
    }

    public static void sample1(){

        for(int i = 0; i <5; i++) {
            System.out.println(i);
            System.out.println("Hello world");
            System.out.println("------------");
        }
    }
}