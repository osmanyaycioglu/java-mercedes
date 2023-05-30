package org.training.mercedes.lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerListProcessor {
    private List<Customer> customers = new ArrayList<>();
    private Scanner scanner;

    public CustomerListProcessor(Scanner scanner) {
        this.scanner = scanner;
    }

    public void showMenu(){
        System.out.println("1-Listeye ekle");
        System.out.println("2-Listeyi göster");
    }

    public boolean process(int index){
        if (index == 1){
            addCustomer();
            return true;
        } else if (index == 2){
            showCustomers();
            return true;
        }
        return false;
    }

    private void showCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    private void addCustomer() {
        System.out.println("Müşterinin ismi :");
        String name = scanner.next();
        System.out.println("Müşterinin soyismi :");
        String surname = scanner.next();
        Customer customer = new Customer();
        customer.setFirstName(name);
        customer.setLastName(surname);
        customers.add(customer);
    }

}
