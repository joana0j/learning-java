package br.com.people;

public class Person {
    void greeting() {
        System.out.println("Hello, world!");
    }

    public static void main(String[] args) {
        Person alguem = new Person();
        alguem.greeting();
    }
}
