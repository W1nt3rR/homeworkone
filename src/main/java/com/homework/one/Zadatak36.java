package com.homework.one;

import java.util.Scanner;

public class Zadatak36 {
    public static void main(String[] args) {
        /*
         * Napisati program kojim se izračunava:
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Unesite broj n: ");
        int n = scan.nextInt();

        double sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("i: " + i + ", i!: " + factorial(i));
            sum += (double) i / factorial(i);
        }

        System.out.println("Suma je: " + sum);

    }

    public static long factorial(int n) {
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;

    }
}
