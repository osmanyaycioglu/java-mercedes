package org.training.mercedes.immutables;

import java.util.Objects;

public class CustomerIm {
    private final String name;
    private final String surname;

    public CustomerIm(String name,
                      String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerIm that = (CustomerIm) o;
        return Objects.equals(name,
                              that.name) && Objects.equals(surname,
                                                           that.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
                            surname);
    }
}
