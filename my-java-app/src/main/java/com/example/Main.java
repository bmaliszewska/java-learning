package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your name (type 'exit' to quit): ");
            String name = sc.nextLine();

            if (name.equalsIgnoreCase("exit")) {
                System.out.println("Program finished.");
                break;
            }

            System.out.println("Hello, " + name + "!");
        }

        sc.close();
    }
}