package com.brh;

/**
 * Dieses Programm gibt die ersten zehn Zahlen der Fibonacci-Folge
 * aus. Jede Zahl wird gebildet, indem beiden vorhergehenden
 * addiert werden. Die beiden Startwerte sind 0 und 1.
 */


public class Fibonacci {
    public static void main(String[] args) {

        int current = 0;
        int prev = 1;
        int next = 0;
        for (int i = 0; i < 10; i++) {
            current = prev + next;

            System.out.println(current);
            prev = next;
            next = current;
        }

    }

}
