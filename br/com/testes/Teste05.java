package br.com.testes;

public class Teste05 {
    public static void main(String[] args){
        //arrays
        String[] cats = {"Luke", "Amora", "Amendoim", "Klaus", "Mei", "Frajola", "Bia", "Magrela"};
        for (String i : cats) {
            System.out.println(i);
        }

        //arrays ex 2

        int[] ages = {20, 12, 60, 88, 47, 5};
        int length = ages.length;
        double averageAge, sum = 0;

        for (int age : ages) {
            sum += age;
        }
        averageAge = sum / length;

        System.out.println("The average age is: " + averageAge);

        /* Multidimensional Array
        are useful when you want to store data as a tabular form,
        like a table with rows and columns. -->
        */

        int[][] numbersAgain = { {2, 5, 7, 14 }, {1, 4, 6, 12} };
        numbersAgain[1][2] = 9;
        System.out.println(numbersAgain[1][2]); // Outputs 9 instead of 6

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int[] row : myNumbers) {
            for (int i : row) {
                System.out.println(i);
            }
        }

    }
}