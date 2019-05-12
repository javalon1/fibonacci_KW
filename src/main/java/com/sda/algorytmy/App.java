package com.sda.algorytmy;


import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        //System.out.println(fibonacciR(5));

        //System.out.println(Arrays.toString(fibonacciI(20)));

        fibonacci2();

    }

    private static void fibonacci2() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
        int b = 1;
        int c = 1;
        int k = 2;

        if (n < 2) {
            System.out.println(n);
        } else {
            while (k < n) {
                    a = b;
                    b = c;
                    c = a + b;

                    k++;
                }

            }
        System.out.println(c);
        }


    private static int[] fibonacciI(int n) {


        int[] tab = new int[n];
        tab[0] = 0;
        tab[1] = 1;

        for (int i = 2; i < n; i++) {

            tab[i] = (tab[i - 1]) + (tab[i - 2]);
        }

        return tab;

    }

    private static int fibonacciR(int n) {
        if (n <= 2) {
            return 1;
        }

        return fibonacciR(n - 1) + fibonacciR(n - 2);


    }
}
