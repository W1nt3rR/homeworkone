package com.homework.one;

import java.util.Scanner;

public class Zadatak18 {
    public static void main(String[] args) {
        /*
         * Zadatak 18.
         * Ispisati sve trocifrene brojeve čija je suma cifara jednaka učitanom broju X.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Unesite broj X: ");
        int x = scan.nextInt();

        for (int i = 100; i < 1000; i++) {
            int sum = 0;
            int temp = i;

            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
            
            if (sum == x) {
                System.out.println(i);
            }
        }

        scan.close();
    }
}