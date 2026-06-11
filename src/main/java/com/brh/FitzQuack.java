package com.brh;

//  Dieses Programm spielt das Spiel "FitzQuack". Es zählt bis 100
//  und ersetzt dabei jedes Vielfache von fünf durch das Wort "Fitz".
//  Jedes Vielfache von sieben durch das Wort "Quack" und jedes
//  Vielfache von fünf und sieben durch das Wort "FitzQuack". Das Programm benutz den Modulo-Operator (%), um zu bestimmen, ob eine
//  Zahl durch eine andere teilbar ist.

public class FitzQuack {
    public static void main(String[] args) {
        for(int i = 0; i <= 100; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.println("FitzQuack");
            }else if (i % 5 == 0) {
                System.out.println("Fitz");
            }else if (i % 7 == 0) {
                System.out.println("Quack");
            } else {
                System.out.println(i);
            }
        }
    }
}
