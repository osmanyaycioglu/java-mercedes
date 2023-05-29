package org.training.mercedes;

public class Truck implements ICar {

    @Override
    public void forward() {
        System.out.println("Kamyon ileri gidiyor");
    }

    @Override
    public String turn(int degree) {
        return "Kamyon " + degree + " döndü";
    }
}
