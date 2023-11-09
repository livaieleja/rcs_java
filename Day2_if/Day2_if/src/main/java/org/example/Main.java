package org.example;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        hometask1();

    }

    public static void hometask1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet simbolu virkni!");
        String b = sc.nextLine();

        int len = b.length();

        if(b.length()>10) {
            System.out.println("###");
        }else if (b.length()==10){
            System.out.println("#");
        }else{
            System.out.println("##");
        }
    }
    public static void sample4() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet vārdu!");
        String b = sc.nextLine();

        int len = b.length(); //šis nozīmē simbolu skaits

        if(b.equals("bbb") || b.length()==3) { // || nozīmē vai - jāizpildās vienam no nosacījumiem && nozīmē un - jāizpildas abiem
            System.out.println("ir vienāds");
        }else{
            System.out.println("nav vienāds");

        }
    }
    public static void task2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet skaitli!");
        int a = sc.nextInt();
        if (a > 5) {
            System.out.println("###");
        } else {
            System.out.println("####");
        }

    }
    public static void sample3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet skaitli!");
        int a = sc.nextInt();

        // Izvadīt "jā", ja skaitlis ir pozitīvs un "nē", ja skaitlis ir negatīvs un izvadīt kļūdas paziņojumu, ja ir 0!
        // ideja: skaitlis var būt 0 >, <, >=, <=, ==, !=
        if(a > 0) {
            System.out.println("Jā");
        }else if(a < 0) {
            System.out.println("Nē");
        }else{
            System.out.println("Kļūda");
        }

        //String if
        //ir vai nav vienāds
        String b = sc.nextLine();
        if(b.equals("bbb")){
            System.out.println("ir vienāds");
        }

        }



    public static void task1(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet pirmo skaitli!");
        int a = sc.nextInt();
        System.out.println("Ievadiet otru skaitli");
        int b = sc.nextInt();

        System.out.println(a + b);

    }


    public static void sample1(){
        System.out.println("Ievadi savu vārdu!");

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        System.out.println("Sveiki, " + input);
}
}