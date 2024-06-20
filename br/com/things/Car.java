package br.com.things;

public class Car {
    String carModel;
    String carColor;
    int carYear;

    int calculateCarAge() {
        return 2024 - carYear;
    }

    void displayDatasheet() {
        System.out.println("Car: " + carModel);
        System.out.println("Color: " + carColor);
        System.out.println("Year: " + carYear);
        System.out.println("Car age in 2024: " + calculateCarAge());
    }

    public static void main(String[] args){
        Car myCar = new Car();

        myCar.carModel = "Impala";
        myCar.carColor = "Black";
        myCar.carYear = 1985;

        myCar.displayDatasheet();
    }

}
