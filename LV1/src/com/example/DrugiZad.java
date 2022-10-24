package com.example;

import java.util.Scanner;

public class DrugiZad {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String ime, prezime;

        System.out.println("Upišite vaše ime: ");
        ime = input.next();

        System.out.println("Upišite vaše prezime: ");
        prezime = input.next();

        System.out.println("Hello");
        System.out.println(ime + " " + prezime);

    }
}
