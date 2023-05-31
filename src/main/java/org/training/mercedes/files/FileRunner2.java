package org.training.mercedes.files;

import org.training.mercedes.immutables.CustomerIm2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FileRunner2 {
    public static void main(String[] args) {
        try {
            Map<String, CustomerIm2> collect = Files.readAllLines(Paths.get("customer.txt"))
                                                    .stream()
                                                    .map(l -> l.split(","))
                                                    .filter(sa -> sa.length == 5)
                                                    .map(sa -> CustomerIm2.builder()
                                                                          .setName(sa[0])
                                                                          .setSurname(sa[1])
                                                                          .setAge(Integer.parseInt(sa[2]))
                                                                          .setHeight(Integer.parseInt(sa[3]))
                                                                          .setWeight(Integer.parseInt(sa[4]))
                                                                          .build())
                                                    .collect(Collectors.toMap(c -> c.getName() + " " + c.getSurname(),
                                                                              c -> c));
            System.out.println(collect);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
