package br.com.testes;

import java.util.Scanner;
public class Teste01 {
    public static void main(String[] args) {
        Scanner evaluation = new Scanner(System.in);
        double media = 0;
        double note = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Type your notes: ");
            note = evaluation.nextDouble();
            media += note;
        }
        System.out.println("Your media is: " + media/3);

        int contador = 1;

        while(contador <= 10) {
            System.out.println(contador);
            contador++;
        }

    }
}