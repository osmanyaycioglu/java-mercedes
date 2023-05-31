package org.training.mercedes.enums;

import java.util.Scanner;

public class EnumRunner2 {
    public static final int ENTRY_COUNT = 10;
    public static final int MAX_VALUE = 10;
    public static final String VALUE_ENTER_STR = "Değer : ";


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
            EInputValues inputValue = EInputValues.getInputValue(value);
            if (inputValue != null) {
                System.out.println(inputValue.getDesc());
            } else {
                System.out.println("Yanlış");
            }
        }
    }
}
