package org.training.mercedes.lambdas.streams;

import org.training.mercedes.immutables.CustomerIm2;

import java.util.*;
import java.util.stream.Collectors;

public class StreamRunner3 {
    public static void main(String[] args) {
        List<String> nameList2 = Arrays.asList("edirne",
                                               "osman",
                                               "hatice",
                                               "fatma",
                                               "osman",
                                               "veli",
                                               "ali",
                                               "veli",
                                               "mehmet",
                                               "ahmet");

        if (nameList2.stream()
                     .peek(s -> System.out.println(s))
                     .distinct()
                     .filter(s -> s.contains("a"))
                     .anyMatch(s -> s.contains("h"))) {
            System.out.println("Hem a hemde h var");
        }
        System.out.println("---------------");
        boolean allMatch = nameList2.stream()
                                    .peek(s -> System.out.println(s))
                                    .distinct()
                                    .filter(s -> s.contains("a"))
                                    .allMatch(s -> s.contains("h"));
        System.out.println("---------------");
        Optional<String> a = nameList2.stream()
                                      .peek(s -> System.out.println(s))
                                      .distinct()
                                      .filter(s -> s.contains("a"))
                                      .findFirst();
        System.out.println("----------");
        nameList2.stream()
                 .skip(1)
                 .distinct()
                 .filter(s -> s.contains("a"))
                 .limit(10)
                 .forEach(s -> System.out.println("Son datalar : " + s));

        IntSummaryStatistics a1 = nameList2.stream()
                                           .skip(1)
                                           .distinct()
                                           .filter(s -> s.contains("a"))
                                           .map(s -> s.length())
                                           .collect(Collectors.summarizingInt(u -> u));
        System.out.println(a1);

        List<CustomerIm2> a2 = nameList2.stream()
                                        .skip(1)
                                        .distinct()
                                        .filter(s -> s.contains("a"))
                                        .map(s -> CustomerIm2.builder()
                                                             .setName(s)
                                                             .build())
                                        .collect(Collectors.toList());
        System.out.println(a2);

        List<Integer> a3 = nameList2.stream()
                                    .skip(1)
                                    .distinct()
                                    .filter(s -> s.contains("a"))
                                    .map(s -> CustomerIm2.builder()
                                                         .setName(s)
                                                         .build())
                                    .map(c -> c.getName())
                                    .map(s -> s.length())
                                    .collect(Collectors.toList());


    }
}
