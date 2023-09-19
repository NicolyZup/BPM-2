package org.example;

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("      Sequência de Fibonacci     ");
        System.out.println("=================================");

        System.out.println("Informe um valor inteiro: ");
        int valor = scanner.nextInt();

        System.out.println("Segue sequência de Fibonacci do valor "+valor+" : ");
        System.out.println(fibonacci(valor));
    }

    static long fibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
