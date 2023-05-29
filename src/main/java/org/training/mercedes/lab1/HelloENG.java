package org.training.mercedes.lab1;

public class HelloENG implements IHello {

    @Override
    public String sayHello(String name,
                           String surname) {
        return "Hello " + name + " " + surname;
    }

    @Override
    public String shortDesc() {
        return "İngilizce";
    }
}
