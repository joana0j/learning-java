package br.com.animals;

public class TestAnimal {
    public static void main(String[] args) {
        Animal myCat = new Cat();
        Animal myDog = new Dog();

        myCat.animalSound();
        myDog.animalSound();
    }
}
