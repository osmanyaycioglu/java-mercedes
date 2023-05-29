package org.training.mercedes.lab1;

public class HelloGER implements IHello {

    @Override
    public String sayHello(String name,
                           String surname) {
        return "Halu " + name + " " + surname;
    }

    @Override
    public String shortDesc() {
        return "Almanca";
    }

}
