package org.training.mercedes.lambdas.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class CommonInterfaces {
    public static void main(String[] args) {
        Consumer<String> consumer1 = (String a) -> System.out.println("String : " + a);
        Consumer<String> consumer1a = new MyConsumer();

        Consumer<String> consumer2 = a -> System.out.println("String : " + a);
        BiConsumer<String,Integer> consumer3 = (s,i) -> System.out.println("sonuç : " + (Integer.parseInt(s)+ i));

        List<String> stringList = Arrays.asList("osman",
                                                "ali",
                                                "ahmet",
                                                "mehmet");
        stringList.forEach(consumer2);
        stringList.forEach(a -> System.out.println("String : " + a));

        List<Long> longList = Arrays.asList(10L,20L,30L,40L);
        longList.forEach(l1 -> System.out.println("Data nın 10 katı : " + (l1 * 10)));

        for (Long l1 : longList) {
            System.out.println("Data nın 10 katı : " + (l1 * 10));
        }
        Function<String,Integer> f2 = Integer::parseInt;

        Function<String,Integer> f1 = w -> Integer.parseInt(w);
        Integer apply = f1.apply("1201");

        BiFunction<String,String,String> f3 = (s1,s2) -> s1 + " " + s2;


        Predicate<String> p1 = s -> s.length() > 10;

        if (p1.test("osman tulgar")){
            System.out.println("uzun isim");
        }

        BiPredicate<String,String> p2 = (s1,s2) -> s1.length() > s2.length();
        if (p2.test("Tulgar","osman")){
            System.out.println("Büyük");
        }

        Supplier<Integer> s1 = () -> 10;
        Integer integer = s1.get();

    }
}
