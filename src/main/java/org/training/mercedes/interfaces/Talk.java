package org.training.mercedes.interfaces;

public abstract class Talk implements ITalk {

    @Override
    public String goodAfternoon(String name) {
        return "Good afternoon " + name ;
    }

    @Override
    public String goodNight(String name) {
        return "Good night " + name;
    }
}
