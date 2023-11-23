package org.example;

public class Calculations {

    public static int saskaitsana (int a, int b){
        return a + b;
    }
    public static int atnemsana (int a, int b){
        return a - b;
    }
    public static int reizinasana (int a, int b){
        return a * b;
    }
    public static int dalisana (int a, int b){
        if (b==0){
            System.out.println("Ar nulli dalīt nedrīskt");
        }
        return a / b;
    }
}
