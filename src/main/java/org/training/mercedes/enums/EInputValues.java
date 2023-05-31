package org.training.mercedes.enums;

public enum EInputValues {
    RIGHT(5,"Doğru"),
    FIRST(1,"İlk"),
    SECOND(3,"İkinci");

    private final int value;
    private final String desc;

    EInputValues(int value,
                 String desc) {
        this.value = value;
        this.desc = desc;
    }

    public int getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }

    public static EInputValues getInputValue(int value){
        EInputValues[] values = EInputValues.values();
        for (EInputValues eInputValues : values) {
            if (eInputValues.getValue() == value) {
                return eInputValues;
            }
        }
        return null;
    }
}
