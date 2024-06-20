package br.com.testes;

import java.util.Scanner;

public class Teste02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //menu with options
        int options = 0;
        String initialText = """
                ------------------------------------------
                Choose with area you would like to calculate:
                1.Square area
                2.Circle area
                3.Exit
                ------------------------------------------
                """;

        while (options != 3) {
            System.out.println(initialText);
            options = scanner.nextInt();

            if (options == 1) {
                System.out.println("Enter the area of the square");
                double squareSide = scanner.nextDouble();
                double squareArea = squareSide * squareSide;
                System.out.println("The square area is: " + squareArea);

            } else if (options == 2) {
                System.out.println("Enter the radius of the circle");
                double radius = scanner.nextDouble();
                double circleArea = 3.14 * radius * radius;
                System.out.println("The circle area is: " + circleArea);

            } else if (options == 3) {
                System.out.println("Exiting..");

            } else {
                System.out.println("Invalid option. Please try again.");
            }

        }




        //choose 2 numbers
        System.out.println("Enter an integer");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter a second integer");
        int secondNumber = scanner.nextInt();

        String higher = "The following number is higher: ";
        System.out.println(higher + Math.max(firstNumber, secondNumber));

        if (firstNumber == secondNumber) {
            System.out.println("The integers are equals!");
        }


        /*
        // Positive vs Negative numbers
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Positive Number");
        } else {
            System.out.println("Negative Number");
        }
    */

    }
}
