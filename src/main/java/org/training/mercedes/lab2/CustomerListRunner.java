package org.training.mercedes.lab2;

import java.util.Scanner;

public class CustomerListRunner {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            CustomerListProcessor listProcessor = new CustomerListProcessor(scanner);
            while (true){
                listProcessor.showMenu();
                System.out.println("seçiminiz : ");
                int index = scanner.nextInt();
                if (!listProcessor.process(index)){
                    return;
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
