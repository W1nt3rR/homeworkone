package com.homework.one;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Zadatak36 {
    public static void main(String[] args) {
        /*
         * Napisati program kojim se izračunava:
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Unesite broj n: ");
        int n = scan.nextInt();

        BigDecimal sum = BigDecimal.ZERO;

        for (int i = 1; i <= n; i++) {
            BigDecimal factorial = factorial(i);
            BigDecimal temp = BigDecimal.ONE.divide(factorial, 100, RoundingMode.HALF_UP);
            sum = sum.add(temp);
        }

        System.out.println("Suma je: " + sum);

        scan.close();

    }

    public static BigDecimal factorial(int n) {
        BigDecimal factorial = BigDecimal.ONE;

        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigDecimal.valueOf(i));
        }

        return factorial;

    }
}
