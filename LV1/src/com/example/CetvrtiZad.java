package com.example;

import java.util.Scanner;

public class CetvrtiZad {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b;

        System.out.println("Upisite prvi broj: ");
        a = input.nextInt();

        System.out.println("Upisite drugi broj");
        b = input.nextInt();

        System.out.println(a + " / " + b + " = " + (a / b));
    }
}
