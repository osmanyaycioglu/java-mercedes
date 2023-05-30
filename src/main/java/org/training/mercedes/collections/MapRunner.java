package org.training.mercedes.collections;

import org.training.mercedes.lab2.Customer;

import java.util.*;

public class MapRunner {
    public static void main(String[] args) {

        Map<String, Customer> customerMap = new HashMap<>();
        customerMap.put("osmany",new Customer("osman","yaycıoğlu"));
        customerMap.put("aliv",new Customer("ali","veli"));
        customerMap.put("ahmetm",new Customer("ahmet","mehmet"));
        customerMap.put("osmany1",new Customer("osman","yurt"));

        // 1
        Set<String> stringSet = customerMap.keySet();
        for (String key : stringSet) {
            Customer value = customerMap.get(key);
            System.out.println("key : " + key + " value : " + value);
        }
        System.out.println("--------------------");
        //2
        Collection<Customer> values = customerMap.values();
        for (Customer value : values) {
            System.out.println(value);
        }
        // 3
        Set<Map.Entry<String, Customer>> entries = customerMap.entrySet();
        for (Map.Entry<String, Customer> entry : entries) {
            System.out.println("key : " + entry.getKey() + " value : " + entry.getValue());
        }
        Customer aliv = customerMap.remove("aliv");
    }
}
