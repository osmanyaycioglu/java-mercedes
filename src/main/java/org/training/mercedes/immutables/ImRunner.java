package org.training.mercedes.immutables;

import org.training.mercedes.enums.EGender;
import org.training.mercedes.lab2.Customer;

public class ImRunner {
    public static void main(String[] args) {
        CustomerIm customerIm = new CustomerIm("osman",
                                               "yaycıoğlu");
        CustomerIm2 customerIm2 = CustomerIm2.builder()
                                             .setName("osman")
                                             .setSurname("yaycıoğlu")
                                             .setAge(53)
                                             .setHeight(200)
                                             .setWeight(90)
                                             .build();

        Customer customer = new Customer();
        customer.setFirstName("osman");
        System.out.println("dsjdhf");
        customer.setLastName("yaycıoğlu");
        customer.setGender(EGender.MALE);

    }
}
