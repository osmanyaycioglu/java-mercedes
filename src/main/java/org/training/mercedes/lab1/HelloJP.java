package org.training.mercedes.lab1;

public class HelloJP implements IHello {

    @Override
    public String sayHello(String name,
                           String surname) {
        return "HA " + name + " " + surname;
    }

    @Override
    public String shortDesc() {
        return "Japonca";
    }
}
