package com.example;

import java.util.Scanner;

public class SestiZad {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b;

        System.out.println("Unesite prvi broj: ");
        a = input.nextInt();

        System.out.println("Unesite drugi broj: ");
        b = input.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " mod " + b + " = " + (a % b));
    }
}
