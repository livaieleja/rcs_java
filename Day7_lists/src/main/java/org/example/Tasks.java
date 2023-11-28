package org.example;

public class Tasks {

    public static double task1(int[] number) {
        double biggest = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (number[i] > biggest) {
                biggest = number[i];
            }
        }
        return biggest;
    }
}
