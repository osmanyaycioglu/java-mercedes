package org.training.mercedes.lambdas.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamRunner {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("osman");
        nameList.add("osman");
        nameList.add("osman");
        nameList.add("osman");
        nameList.add("ali");
        nameList.add("veli");
        nameList.add("ayşe");
        nameList.add("fatma");
        nameList.add("fatma");
        nameList.add("fatma");
        nameList.add("mehmet");

        nameList.forEach(s -> System.out.println(s));
        System.out.println("------------------");
        nameList.stream()
                .peek(s -> System.out.println("Before distinct : " + s))
                .distinct()
                .peek(s -> System.out.println("Before filter : " + s))
                .filter(s -> s.length() > 4)
                .peek(s -> System.out.println("Before foreach : " + s))
                .forEach(s -> System.out.println(s));
        List<String> nameList2 = Arrays.asList("osman",
                                               "hatice",
                                               "fatma",
                                               "osman",
                                               "veli",
                                               "ali",
                                               "veli",
                                               "mehmet",
                                               "ahmet");
        String s1 = "osman";
        boolean a = s1.contains("a");

        //        nameList.parallelStream()
//                .filter(s -> s.length() > 4)
//                .distinct()
//                .forEach(s -> System.out.println(s));
    }
}
