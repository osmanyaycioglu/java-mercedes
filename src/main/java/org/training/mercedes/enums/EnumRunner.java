package org.training.mercedes.enums;

public class EnumRunner {
    public static void main(String[] args) {
        EInputValues inputValues1 = EInputValues.FIRST;
        int ordinal = inputValues1.ordinal();
        String name = inputValues1.name();

        EInputValues inputValues2 = EInputValues.SECOND;
        EInputValues inputValues3 = EInputValues.RIGHT;
        switch (inputValues1) {
            case FIRST:
                System.out.println("first");
                break;
            case SECOND:
                System.out.println("second");
                break;
            case RIGHT:
                System.out.println("doğru");
                break;
            default:
                System.out.println("yanlış");
                break;
        }
    }
}
