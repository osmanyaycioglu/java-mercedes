package org.training.mercedes.lambdas.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamRunner2 {
    public static void main(String[] args) {
        List<String> nameList2 = Arrays.asList("osman",
                                               "hatice",
                                               "fatma",
                                               "osman",
                                               "veli",
                                               "ali",
                                               "veli",
                                               "mehmet",
                                               "ahmet");

        nameList2.stream()
                 .distinct()
                 .filter(s -> s.contains("a"))
                 .sorted()
                 .forEach(s -> System.out.println(s));
        List<String> stringList = nameList2.stream()
                                           .distinct()
                                           .filter(s -> s.contains("a"))
                                           .sorted()
                                           .collect(Collectors.toList());
        List<String> stringList2 = nameList2.stream()
                                            .distinct()
                                            .filter(s -> s.contains("a"))
                                            .sorted()
                                            .reduce(new ArrayList<String>(),
                                                    (al, s) -> {
                                                        al.add(s);
                                                        return al;
                                                    },
                                                    (al1, al2) -> {
                                                        al1.addAll(al2);
                                                        return al1;
                                                    });
        System.out.println("--------------");
        String str = nameList2.stream()
                            .distinct()
                            .filter(s -> s.contains("a"))
                            .sorted()
                            .reduce("",
                                    (s1, s2) -> s1 + " " + s2,
                                    (s1, s2) -> s1 + " " + s2);
        System.out.println(str);
        Set<String> stringSet = nameList2.stream()
                                 .distinct()
                                 .filter(s -> s.contains("a"))
                                 .sorted()
                                 .collect(Collectors.toSet());

    }
}
