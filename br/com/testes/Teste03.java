package br.com.testes;

import java.util.Scanner;

public class Teste03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = scanner.nextInt();

        System.out.println(number + " times table: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        System.out.println("Enter an integer");
        int newNumber = scanner.nextInt();

        if (newNumber % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        System.out.println("Enter a number: ");
        int entryNumber = scanner.nextInt();
        int factorial = 1;

        for (int i = 1; i <= entryNumber; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + entryNumber + " is: " + factorial);
    }
}
