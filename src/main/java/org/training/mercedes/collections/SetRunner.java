package org.training.mercedes.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("osman");
        stringSet.add("osman");
        stringSet.add("osman");
        stringSet.add("ali");
        stringSet.add("veli");
        stringSet.add("ayşe");

        for (String s : stringSet) {
            System.out.println(s);
        }
        Person person1 = new Person("osman","yay",53);
        Person person2 = new Person("ayşe","alaz",35);
        Person person3 = new Person("ali","veli",45);
        Person person4 = new Person("osman","yay",54);

        System.out.println("Person : " + person1);

        Set<Person> personSet = new TreeSet<>();
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        personSet.add(person4);

        System.out.println("------------------");
        for (Person person : personSet) {
            System.out.println(person);
        }

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> setBackup = new HashSet<>(set1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        set1.removeAll(set2);
        System.out.println("--------------");
        for (Integer integer : set1) {
            System.out.println(integer);
        }

        boolean contains = setBackup.contains(3);
    }
}
