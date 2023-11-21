package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result = task22(6,19);
        System.out.println(result);
    //    System.out.println(combineStrings("e"));
    //    int a = sum();
    //    System.out.println(a);
    //    task1("ss", 3);
    //    task1 ("JJ", 5);
    }

    public static int task22 (int a,int b){
        if (a>b){
            return a;
        }
        return b;
    }
    public static int task2 (int a, int b){
        if (a > b) {
            return a;
        }else{
            return b;
        }
    }

    public static String combineStrings(String param){
        // Uztaisīt metodi, kura paņem vienu string tipa vērtību kā parametru
        // šo vērtību saglabāt citā stringā 10x
        // Vērtību padod ar return
        // piemērs -> parametrs = "a" -> ar return "aaaaaaaaaa"
        String result = "";
        for(int i = 0; i < 10; i++){
            result = result + param;
        }

        return result;

    }

    public static int sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet skaitli!");
        int sk1 = sc.nextInt();

        System.out.println("Ievadiet skaitli!");
        int sk2 = sc.nextInt();

        return sk1 + sk2;

    }
    public static void task1(String a, int b) {
        String symbol = "";
        for (int i = 0; i < b; i++) {
            symbol = symbol + " " + a;
            System.out.println(symbol);
        }
    }
}