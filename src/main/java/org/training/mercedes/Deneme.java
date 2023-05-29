package org.training.mercedes;

public class Deneme {

    public static void main(String[] args) {
        System.out.println("Osman deneme");
        int iVal = 100;
        Integer ioVal = 100;
        ioVal = null;
        Integer ioVal2 = new Integer(100);

        Car car = new Car();
        car.setName("BMW");
        car.setHorsePower(100);

        car.setHorsePower(-1);
        car.name = "test";

        Car car2 = new Car();
        car2.setName("Mercedes");
        car2.setHorsePower(180);

        // car = car2;
        System.out.println(car.getName());
    }

}
