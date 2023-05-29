package org.training.mercedes.lab1;

public class HelloTR implements IHello {

    @Override
    public String sayHello(String name,
                           String surname) {
        return "Merhaba " + name + " " + surname;
    }

    @Override
    public String shortDesc() {
        return "Türkçe";
    }
}
