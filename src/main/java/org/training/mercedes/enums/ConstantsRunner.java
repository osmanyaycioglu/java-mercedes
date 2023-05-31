package org.training.mercedes.enums;

import java.util.Scanner;

public class ConstantsRunner {

    public static final int ENTRY_COUNT = 10;
    public static final int MAX_VALUE = 10;
    public static final String VALUE_ENTER_STR = "Değer : ";
    // Girilebilinen değerler
    public static final int VALUE_FOR_FIRST = 1;
    public static final int VALUE_FOR_SECOND = 3;
    public static final int RIGHT_VALUE = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 10;
        for (int i = 0; i < ENTRY_COUNT; i++) {
            System.out.println(VALUE_ENTER_STR);
            int value = scanner.nextInt();
            if (value > MAX_VALUE) {
                System.out.println("Çok yanlış girdiniz");
                return;
            }
            if (value == VALUE_FOR_FIRST) {
                System.out.println("İlk");
            } else if (value == VALUE_FOR_SECOND) {
                System.out.println("ikinci");
            } else if (value == RIGHT_VALUE) {
                System.out.println("Doğru");
            } else if (value == 4) {
                System.out.println("Doğru gibi");
            } else {
                System.out.println("Yanlış");
            }
        }
    }

}
