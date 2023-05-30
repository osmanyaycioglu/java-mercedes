package org.training.mercedes.lab2;

import java.util.Objects;

public class Customer {
    private String firstName;
    private String lastName;

    public Customer() {
    }

    public Customer(String firstName,
                    String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(firstName,
                              customer.firstName) && Objects.equals(lastName,
                                                                    customer.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName,
                            lastName);
    }
}
