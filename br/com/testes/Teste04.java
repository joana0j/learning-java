package br.com.testes;

import java.util.Scanner;
public class Teste04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int entryAge;
        int minimumAge = 18;

        System.out.println("Bem vindo! Digite sua idade para prosseguir ");
        entryAge = scanner.nextInt();

        // Um jeito mais simples de fazer if else:
        String result = (entryAge >= minimumAge) ? "Prosseguindo.." : "Impossível de prosseguir! Você não possui mais de 18 anos.";
        System.out.println(result);

       /* if (entryAge >= minimumAge) {
            System.out.println("Prosseguindo..");
        } else {
            System.out.println("Impossível de prosseguir! Você não possui mais de 18 anos.");
        } */

        int dice = 1;

        while (dice <= 6) {
            if (dice < 6) {
                System.out.println("NÃO DEU 6");
            } else {
                System.out.println("DEU 6!!!");
            }
            dice = dice + 1;
        }
        String[] palavras = {"ovinho", "leite", "calipso", "fiapo", "físico", "vassoura"};
        System.out.println(palavras);
    }

}
