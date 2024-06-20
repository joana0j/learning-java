package br.com.things;

public class Calculator {

    static int receiveNumber(int x) {
        return x * 2;
    }

    public static void main(String[] args){
        System.out.println(receiveNumber(3));
    }
}
