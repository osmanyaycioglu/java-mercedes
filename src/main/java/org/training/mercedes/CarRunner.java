package org.training.mercedes;

import java.util.Scanner;

public class CarRunner {
    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Mercedes");
        car.setHorsePower(100);
        car.forward();

        System.out.println("------------------");

        SportCar sportCar = new SportCar();
        sportCar.setTopSpeed(180);
        sportCar.setName("BMW");
        sportCar.setHorsePower(120);
        sportCar.forward();
        sportCar.fastForward();

        System.out.println("------------------");

        ICar car1 = new Car();
        car1.forward();
        // car1.setHorsePower(1000);

        ICar car2 = new Truck();
        car2.turn(180);

        System.out.println("------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ne kadar ileri gitsin : ");
        int i = scanner.nextInt();
        for (int j = 0; j < i; j++) {
            car2.forward();
        }
        System.out.println("Ne kadar donsun : ");
        int degree = scanner.nextInt();
        String turn = car2.turn(degree);
        System.out.println(turn);
    }
}
