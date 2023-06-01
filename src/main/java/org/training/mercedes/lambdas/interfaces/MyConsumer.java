package org.training.mercedes.lambdas.interfaces;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println("String : " + s);
    }
}
