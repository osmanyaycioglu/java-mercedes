package org.training.mercedes.other;

import org.training.mercedes.Car;

public class Deneme2 extends Car {

    public String test() {
        return name;
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.setName("BMW");
        car.setHorsePower(100);

        car.setHorsePower(-1);
        // car.name = "test";

    }
}
