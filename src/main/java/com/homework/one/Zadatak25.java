package com.homework.one;

import java.util.Scanner;

public class Zadatak25 {
    public static void main(String[] args) {
        /*
         * Zadatak 25.
         * Ispisati 10 najvećih trocifrenih brojeva deljivih sa K
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Unesite broj K: ");
        int k = scan.nextInt();

        int counter = 0;

        for (int i = 999; i >= 100; i--) {
            if (i % k == 0) {
                System.out.println(i);
                counter++;
            }

            if (counter == 10) {
                break;
            }
        }

        scan.close();
    }
}
