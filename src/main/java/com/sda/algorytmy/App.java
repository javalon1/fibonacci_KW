package com.sda.algorytmy;


import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        System.out.println(fibonacciR(20-1));

        System.out.println(Arrays.toString(fibonacciI(20)));

    }

    private static int[] fibonacciI(int n){


        int[] tab = new int[n];
        tab[0] = 0;
        tab[1] = 1;

        for (int i = 2; i < n ; i++) {

            tab[i] = (tab[i-1]) + (tab[i-2]);
        }

        return tab;

    }

    private static int fibonacciR(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fibonacciR(n-1) + fibonacciR(n-2);


    }
}
