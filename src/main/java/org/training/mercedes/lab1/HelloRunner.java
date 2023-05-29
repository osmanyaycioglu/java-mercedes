package org.training.mercedes.lab1;

import java.util.Scanner;

public class HelloRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HelloFactory helloFactory = new HelloFactory();
        while (true) {
            helloFactory.writeMenu();
            System.out.println("seçiminiz : ");
            int index = scanner.nextInt();
            IHello hello = helloFactory.createHelloImpl(index);
            if (hello == null){
                return;
            }
            System.out.println("İsminiz : ");
            String name = scanner.next();
            System.out.println("Soy isminiz : ");
            String surname = scanner.next();
            System.out.println(hello.sayHello(name,
                                              surname));
        }
    }
}
