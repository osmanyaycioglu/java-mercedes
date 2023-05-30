package org.training.mercedes.lab2;

import java.util.Scanner;

public class CustomerSetRunner {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            CustomerSetProcessor setProcessor = new CustomerSetProcessor(scanner);
            while (true){
                setProcessor.showMenu();
                System.out.println("seçiminiz : ");
                int index = scanner.nextInt();
                if (!setProcessor.process(index)){
                    return;
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
