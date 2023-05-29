package org.training.mercedes.lab1;

public class HelloESP implements IHello {

    @Override
    public String sayHello(String name,
                           String surname) {
        return "Ola " + name + " " + surname;
    }

    @Override
    public String shortDesc() {
        return "İspanyolca";
    }
}
