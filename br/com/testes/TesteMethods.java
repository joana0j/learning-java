package br.com.testes;

public class TesteMethods {
    static void checkAge(int age) {

        if (age < 18) {
            System.out.println("Access Denied - You are not old enough!");
        } else {
            System.out.println("Access Granted - You are old enough!");
        }
    }
    // return values:

    static int firstExample(int x) {
        return 5 + x;
    }

    static int secondExample(int a, int b) {
        return a - b;
    }

    static int thirdExample(int p, int q) {
        return p * q;
    }



    public static void main(String[] args) {
        checkAge(23);

        System.out.println("5 + x = " + firstExample(8));

        System.out.println("a - b = " + secondExample(10, 6));

        int r = thirdExample(2, 4);
        System.out.println("p * q = " + r);
    }
}
