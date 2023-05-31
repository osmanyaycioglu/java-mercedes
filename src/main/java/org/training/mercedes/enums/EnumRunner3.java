package org.training.mercedes.enums;

import java.util.Scanner;

public class EnumRunner3 {
    public static final int ENTRY_COUNT = 10;
    public static final int MAX_VALUE = 10;
    public static final String VALUE_ENTER_STR = "ENUM : ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 10;
        for (int i = 0; i < ENTRY_COUNT; i++) {
            System.out.println(VALUE_ENTER_STR);
            String value = scanner.next();
            EInputValues inputValue = EInputValues.valueOf(value);
            if (inputValue != null) {
                System.out.println(inputValue.getDesc());
            } else {
                System.out.println("Yanlış");
            }
        }
    }
}
