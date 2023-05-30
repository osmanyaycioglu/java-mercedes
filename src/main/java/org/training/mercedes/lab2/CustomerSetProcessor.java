package org.training.mercedes.lab2;

import java.util.*;

public class CustomerSetProcessor {
    private Set<Customer> customers = new HashSet<>();
    private Scanner scanner;

    public CustomerSetProcessor(Scanner scanner) {
        this.scanner = scanner;
    }

    public void showMenu(){
        System.out.println("1-Sete ekle");
        System.out.println("2-Seti göster");
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
        if (customers.contains(customer)){
            System.out.println("Eklemedim çünkü set te hali hazırda var");
        } else {
            customers.add(customer);
            System.out.println("Yeni müşteri eklendi. Şu anda " + customers.size() + " müşteri var.");
        }
    }

}
